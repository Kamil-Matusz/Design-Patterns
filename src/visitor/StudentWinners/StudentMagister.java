package visitor.StudentWinners;

public class StudentMagister extends Student {
    public StudentMagister(String imie, double srednia, boolean wszystkoZaliczoneW1Termin, boolean laureatKonkursu) {
        super(imie, srednia, wszystkoZaliczoneW1Termin, laureatKonkursu);
    }

    @Override
    public void zaakceptuj(Visitor visitor) {
        visitor.odwiedz(this);
    }
}