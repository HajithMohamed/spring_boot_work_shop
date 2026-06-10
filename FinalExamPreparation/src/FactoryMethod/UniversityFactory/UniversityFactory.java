package FactoryMethod.UniversityFactory;

public class UniversityFactory {
    public static Users getUser(String userName){
        if(userName.equalsIgnoreCase("lecturer")) return new Lecturer();
        if(userName.equalsIgnoreCase("student")) return new Student();
        if (userName.equalsIgnoreCase("technical-officer")) return new TechnicalOfficer();

        throw new IllegalArgumentException("Invalid notification type");
    }
}
