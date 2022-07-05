package eu.javaca.playground;

public interface Instantiable {

    default String instantiate(Pojo myPojo, Target target) {
        String result;
        switch (target) {
            case JSON:
                try {
                    result = Util.getObjectAsJson(myPojo, 0);
                } catch (RuntimeException e) {
                    return "Error in parsing";
                }
                break;
            case XML:
                System.out.println("Not implemented yet");
                result = "";
            default:
                System.out.println("Invalid target!");
                result = "";
        }
        return result;
    }
}
