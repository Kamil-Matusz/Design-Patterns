package builder.Students;

public abstract class StudentBuilder {

    protected Student student;

    public void newStudent() {
        student = new Student();
    }

    public Student getStudent() {
        return student;
    }

    public abstract void setName(String name);
    public abstract void setSurname(String surname);
    public abstract void setIndexNumber(String indexNumber);
    public abstract void setSpecialization(String specialization);
}