package FactoryMethod.UniversityFactory;

public class Student implements Users{
    @Override
    public void dashboard() {
        System.out.println("This is students dashboard");
    }
}
