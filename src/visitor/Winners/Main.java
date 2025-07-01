package visitor.Winners;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> lista = List.of(
                new Student("Anna A", 4.80, true , false),
                new Student("Bartek B",4.60, true , false),
                new Student("Celina C",4.40, true , true ), // laureat
                new Student("Darek D",4.40, false, false)   // nie spełnia
        );

        // odwiedzacze nagród
        var nagrody = List.of(
                new ZwolnienieCzesnegoVisitor(),
                new KarnetSilowniaVisitor(),
                new LimitBibliotekaVisitor(),
                new StrzelnicaVisitor()
        );

        for (Student s : lista) {
            // 1) kwalifikacja
            KwalifikacjaVisitor kwal = new KwalifikacjaVisitor();
            s.accept(kwal);

            if (kwal.isQualified()) {
                // 2) przydziel nagrody
                nagrody.forEach(v -> s.accept(v));
            }
            System.out.println(s);
        }
    }
}
