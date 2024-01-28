package Creational.Factory.PracticalFactory.v1;
public class UserFactory {

    public static User getUserFronEnum(UserType userType) {
        return switch (userType) {
            case MENTOR -> new Mentor();
            case TA -> new TA();
            case STUDENT -> new Student();
            default -> new User();
        };
    }
    public static User getUserForInput(String input) {
        if(input.equalsIgnoreCase("mentor")) {
            return new Mentor();
        } else if (input.equalsIgnoreCase("ta")) {
            return new TA();
        } else if (input.equalsIgnoreCase("student")) {
            return new Student();
        } else {
            return null;
        }
    }
}
