package FactoryMethod.UniversityFactory;

public class Lecturer implements Users {
    @Override
    public void dashboard() {
        System.out.println("This is lecturer dashboard");
    }
}
