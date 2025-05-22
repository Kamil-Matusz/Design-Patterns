package builder.Studenci;

public class Specjalizacja {
    public static void main(String[] args) {

        Director director = new Director();
        StudentBuilder studentProgramowaniaBuilder = new StudentProgramowania();

        director.setStudentBuilder(studentProgramowaniaBuilder);
        director.buildStudent();

        Student programowanie = director.getStudent();
        programowanie.showStudent();

    }
}
