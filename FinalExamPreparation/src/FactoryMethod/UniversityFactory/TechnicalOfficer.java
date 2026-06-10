package FactoryMethod.UniversityFactory;

public class TechnicalOfficer implements Users{
    @Override
    public void dashboard() {
        System.out.println("This is technical officer dashboard");
    }
}
