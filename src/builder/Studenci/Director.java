package builder.Studenci;

public class Director {

    private StudentBuilder studentBuilder;

    public Student getStudent() {
        return studentBuilder.getStudent();
    }

    public void setStudentBuilder(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public void buildStudent() {
        studentBuilder.newStudent();
        studentBuilder.addStudentName();
        studentBuilder.addStudentSurname();
        studentBuilder.addStudentSpecialization();
        studentBuilder.addStudentIndex();
    }
}
