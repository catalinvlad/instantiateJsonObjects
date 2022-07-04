package eu.javaca.playground;

import eu.javaca.playground.simple.example.Required;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Util {
    public static <T> String getObjectAsJson(T object, int deep) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(addSpaces(deep) + "{" + "\n");
            deep++;
            List<Field> fields = List.of(object.getClass().getDeclaredFields());
            Iterator<Field> it = fields.iterator();
            while (it.hasNext()) {
                Field field = it.next();
                field.setAccessible(true);
                if (field.get(object) != null) {
                    sb.append(addSpaces(deep) + "\"" + field.getName() + "\"" + ": ");
                    Class cls = field.getType();
                    appendFieldValue(object, sb, field, cls, deep);
                    sb.append(",\n");
                } else {
                    if (field.getAnnotation(Required.class) != null) {
                        sb.append(addSpaces(deep) + "\"" + field.getName() + "\"" + ": null,\n");
                    }
                }
                if (!it.hasNext()) {
                    sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
                }
            }
            deep--;
            sb.append(addSpaces(deep) + "}");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
        return sb.toString();
    }

    private static <T> void appendFieldValue(T object, StringBuilder sb, Field field, Class cls, int deep) throws IllegalAccessException {
        if (completeSingleRowData(object, sb, field, cls)) {
            return;
        };

        if (Collection.class.isAssignableFrom(cls)) {
            ParameterizedType listType = (ParameterizedType) field.getGenericType();
            if ((isSingleRowListType(listType))) {
                sb.append(printArray((Collection) field.get(object)));
                return;

            } else {
                Collection value = (Collection) field.get(object);
                Iterator<Pojo> it = value.iterator();
                sb.append("[\n");
                while (it.hasNext()) {
                    Pojo element = it.next();
                    sb.append(getObjectAsJson(element, deep) + ",");
                    if (it.hasNext()) {
                        sb.append("\n");
                    } else {
                        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
                        sb.append("]");
                    }
                }
                return;
            }
        }

        sb.append("\n" + getObjectAsJson(field.get(object), deep));

    }

    private static boolean isSingleRowListType(ParameterizedType listType) {
        Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];
        if (listClass.equals(String.class)
        || listClass.equals(Integer.class)
                || listClass.equals(Long.class)
                || listClass.equals(Double.class)
                || listClass.equals(Boolean.class)
                || listClass.equals(Byte.class)
                || listClass.equals(Float.class)
                || listClass.equals(Short.class)
                || listClass.equals(Character.class)
                || listClass.equals(LocalDate.class)
                || listClass.equals(LocalDateTime.class)
        ) {
            return true;
        }
        return false;
    }

    private static <T> boolean completeSingleRowData(T object, StringBuilder sb, Field field, Class cls) throws IllegalAccessException {
        // TODO refactor - repetitive code, when collections or single row data are used
        if (cls.equals(String.class)
                || cls.equals(LocalDate.class)
                || cls.equals(LocalDateTime.class)
        ) {
            sb.append("\"" + field.get(object).toString() + "\"");
            return true;
        }
        if (cls.equals(Integer.class)
                || cls.equals(Long.class)
                || cls.equals(Double.class)
                || cls.equals(Boolean.class)
                || cls.equals(Byte.class)
                || cls.equals(Float.class)
                || cls.equals(Short.class)
                || cls.equals(Character.class)
        ) {
            sb.append(field.get(object));
            return true;
        }
        return false;
    }

    private static String addSpaces (int deep) {
        return new String(new char[deep * 4]).replace('\0', ' ');
    }

    private static <T> String printArray(Collection<T> elements) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            T element = it.next();
            if (element == null) {
                sb.append("null,");
                continue;
            }
            if (requiresQuotes(element.getClass())) {
                sb.append("\"" + element.toString() + "\"" + ",");
            } else {
                sb.append(element.toString() + ",");
            }
        }
        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "");
        sb.append("]");
        return sb.toString();
    }

    private static boolean requiresQuotes(Class<?> cls) {
        return cls.equals(String.class)
        || cls.equals(LocalDateTime.class)
        || cls.equals(LocalDate.class);
    }
}
