package visitor.StudentWinners;

import java.util.ArrayList;
import java.util.List;

public class GrupaStudentow {
    private List<Student> lista = new ArrayList<>();

    public void dodaj(Student s) {
        lista.add(s);
    }

    public void przeprowadzWizyte(Visitor odwiedzajacy) {
        for (Student s : lista) {
            s.zaakceptuj(odwiedzajacy);
        }
    }
}
