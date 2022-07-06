package eu.javaca.playground;

import eu.javaca.playground.simple.example.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InstantiableTest {

    @Test
    void instantiateComplexRealWorldXmlExample() {
        /*Instantiable i = (any, target) -> {
           throw new RuntimeException("not implemented");
        };
        fail(i.instantiate(AIRMETType.class, Target.XML));*/
    }


    @Test
    void instantiateSimpleJsonExampleTest() {
        // Arrange
        Instantiable i = new Instantiable() {};
        Person person = new Person();

        person.setName("Popescu Gigel");
        person.setAge(21);

        Hobby hobby1 = new Hobby();
        hobby1.setType("WATER_SPORT");
        hobby1.setProficiencyLevel(4);
        hobby1.setTimePracticing(10);
        hobby1.setName("Swimming");
        hobby1.setRequiresSuit(true);
        person.addHobby(hobby1);

        Hobby hobby2 = new Hobby();
        hobby2.setName("Chess");
        hobby2.setEloRating(1560);
        person.addHobby(hobby2);

        Book book = new Book();
        book.setName("Lumea Sofiei");
        book.setISBN("308283402880");
        person.setFavouriteBook(book);

        person.setFriends(Arrays.asList("Ionel", null, "Vasile"));
        person.setNumbers(Arrays.asList(1, 4, 7));
        person.setLastUpdate(LocalDate.of(2022, 07, 04));

        // Act
        System.out.println("Testing the instantiation of a JSON example.");
        String result = i.instantiate(person, Target.JSON);

        // Assert
        String expected = "{\n" +
                "    \"name\": \"Popescu Gigel\",\n" +
                "    \"age\": 21,\n" +
                "    \"hobbies\": [\n" +
                "    {\n" +
                "        \"type\": \"WATER_SPORT\",\n" +
                "        \"proficiencyLevel\": 4,\n" +
                "        \"timePracticing\": 10,\n" +
                "        \"name\": \"Swimming\",\n" +
                "        \"requiresSuit\": true\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Chess\",\n" +
                "        \"eloRating\": 1560\n" +
                "    }],\n" +
                "    \"favouriteBook\": \n" +
                "    {\n" +
                "        \"name\": \"Lumea Sofiei\",\n" +
                "        \"ISBN\": \"308283402880\"\n" +
                "    },\n" +
                "    \"workplace\": null,\n" +
                "    \"friends\": [\"Ionel\",null,\"Vasile\"],\n" +
                "    \"numbers\": [1,4,7],\n" +
                "    \"lastUpdate\": \"2022-07-04\"\n" +
                "}";
        System.out.println("Expected result: ");
        System.out.println(expected);
        assertEquals(expected, result);
        System.out.println("\nTest passed!");
    }
}