package visitor.Post;

public class Program {
    public static void main(String[] args) {
        List przesylka1 = new List(0.3, "kraj");
        List przesylka2 = new List(0.7, "zagranica");
        Paczka przesylka3 = new Paczka(1.5, "kraj");
        Paczka przesylka4 = new Paczka(3.0, "zagranica");

        OplataVisitor nalicz = new NaliczOpłaty();

        przesylka1.zaakceptuj(nalicz);
        przesylka2.zaakceptuj(nalicz);
        przesylka3.zaakceptuj(nalicz);
        przesylka4.zaakceptuj(nalicz);
    }
}
