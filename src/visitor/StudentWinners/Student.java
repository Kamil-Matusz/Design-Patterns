package visitor.StudentWinners;

public abstract class Student {
    protected String imie;
    protected double srednia;
    protected boolean wszystkoZaliczoneW1Termin;
    protected boolean laureatKonkursu;

    public Student(String imie, double srednia, boolean wszystkoZaliczoneW1Termin, boolean laureatKonkursu) {
        this.imie = imie;
        this.srednia = srednia;
        this.wszystkoZaliczoneW1Termin = wszystkoZaliczoneW1Termin;
        this.laureatKonkursu = laureatKonkursu;
    }

    public String getImie() {
        return imie;
    }

    public double getSrednia() {
        return srednia;
    }

    public boolean isWszystkoZaliczoneW1Termin() {
        return wszystkoZaliczoneW1Termin;
    }

    public boolean isLaureatKonkursu() {
        return laureatKonkursu;
    }

    public abstract void zaakceptuj(Visitor visitor);
}
