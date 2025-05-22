package abstractFactory.Paycheck;

public class UmowaZlecenie implements Umowa{
    @Override
    public void obliczWynagrodzenie(double brutto, boolean czyStudent) {
        double skladki = brutto * (0.0976 + 0.015 + 0.0245);
        double zdrowotna = (brutto - skladki) * 0.09;
        double kosztUzyskania = 250;
        double podstawa = brutto - skladki - kosztUzyskania;
        double podatek = podstawa * 0.12;
        double netto = brutto - skladki - zdrowotna - podatek;
        double kosztPracodawcy = brutto + brutto * (0.0976 + 0.065 + 0.0193 + 0.0245 + 0.001);

        System.out.printf("Netto: %.2f PLN\n", netto);
        System.out.printf("Koszt pracodawcy: %.2f PLN\n", kosztPracodawcy);
    }
}
