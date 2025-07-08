package visitor.Post;

public class NaliczOpłaty implements OplataVisitor {
    @Override
    public void wizytuj(List list) {
        double cena = 5.0; // podstawa
        if (list.waga > 0.5) cena += 3.0;
        if (list.miejsce.equalsIgnoreCase("zagranica")) cena += 10.0;

        System.out.println("List: " + cena + " PLN");
    }

    @Override
    public void wizytuj(Paczka paczka) {
        double cena = 15.0; // podstawa
        if (paczka.waga > 2.0) cena += 10.0;
        if (paczka.miejsce.equalsIgnoreCase("zagranica")) cena += 20.0;

        System.out.println("Paczka: " + cena + " PLN");
    }
}