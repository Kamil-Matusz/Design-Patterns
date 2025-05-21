package builder.Students;

public class Director {

    private StudentBuilder studentBuilder;

    public void setBuilder(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student constructStudent(String name, String surname, String indexNumber, String specialization) {
        studentBuilder.newStudent();
        studentBuilder.setName(name);
        studentBuilder.setSurname(surname);
        studentBuilder.setIndexNumber(indexNumber);
        studentBuilder.setSpecialization(specialization);
        return studentBuilder.getStudent();
    }
}
