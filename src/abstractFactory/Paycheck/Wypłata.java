package abstractFactory.Paycheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wypłata {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wpisz rodzaj umowy: ");
        String rodzajUmowy=br.readLine();

        System.out.print("Podaj rok podatkowy: ");
        String rokPodatkowy=br.readLine();

        FabrykaAbstrakcyjna fabrykaUmowy = KreatorFabryki.getFabryka("umowa");
        Umowa umowa= fabrykaUmowy.getUmowa(rodzajUmowy);

        FabrykaAbstrakcyjna fabrykaRoku = KreatorFabryki.getFabryka("rok");
        RokPodatkowy rok = fabrykaRoku.getRokPodatkowy(rokPodatkowy);
        umowa.obliczWynagrodzenie(8000, false);

    }
}
