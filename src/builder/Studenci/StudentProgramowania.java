package builder.Studenci;

public class StudentProgramowania extends StudentBuilder{
    @Override
    public void addStudentName() {
        student.setName("Kamil");
    }

    @Override
    public void addStudentSurname() {
        student.setSurname("Matusz");
    }

    @Override
    public void addStudentIndex() {
        student.setIndexNumber("72958");
    }

    @Override
    public void addStudentSpecialization() {
        student.setSpecialization("Programowanie");
    }
}
