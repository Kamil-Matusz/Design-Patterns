package visitor.StudentWinners;

public class StudentInzynier extends Student {
    public StudentInzynier(String imie, double srednia, boolean wszystkoZaliczoneW1Termin, boolean laureatKonkursu) {
        super(imie, srednia, wszystkoZaliczoneW1Termin, laureatKonkursu);
    }

    @Override
    public void zaakceptuj(Visitor visitor) {
        visitor.odwiedz(this);
    }
}