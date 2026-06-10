package FactoryMethod.UniversityFactory;

public class UniversityDemo {
    public static void main(String[] args) {
        Users lecturer = UniversityFactory.getUser("lecturer");
        Users student = UniversityFactory.getUser("student");
        Users technicalOfficer = UniversityFactory.getUser("technical-officer");

        lecturer.dashboard();
        student.dashboard();
        technicalOfficer.dashboard();
    }
}
