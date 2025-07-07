package visitor.StudentWinners;

public class Program {
    public static void main(String[] args) {
        GrupaStudentow grupa = new GrupaStudentow();
        grupa.dodaj(new StudentMagister("Anna", 4.8, false, false));
        grupa.dodaj(new StudentMagister("Piotr", 4.5, true, false));
        grupa.dodaj(new StudentMagister("Marek", 4.2, true, true));
        grupa.dodaj(new StudentMagister("Zofia", 4.3, false, false));

        ProgramNagrod nagrod = new ProgramNagrod();
        grupa.przeprowadzWizyte(nagrod);
    }
}
