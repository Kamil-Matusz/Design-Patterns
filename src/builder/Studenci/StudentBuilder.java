package builder.Studenci;

public abstract class StudentBuilder {

    protected Student student;

    public void newStudent() {
        student = new Student();
    }

    public Student getStudent() {
        return student;
    }

    public abstract void addStudentName();
    public abstract void addStudentSurname();
    public abstract void addStudentIndex();
    public abstract void addStudentSpecialization();
}
