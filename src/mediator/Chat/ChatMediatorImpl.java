package mediator.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<Uzytkownik> uzytkownicy;

    public ChatMediatorImpl() {
        this.uzytkownicy = new ArrayList<Uzytkownik>();
    }


    public void dodajUzytkownika(Uzytkownik uzytkownik) {
        this.uzytkownicy.add(uzytkownik);
    }


    public void wyslijWiadomosc(String komunikat, Uzytkownik uzytkownik) {
        for (Uzytkownik u : this.uzytkownicy) {
            if (u != uzytkownik)
                u.odbierz(komunikat);

        }
    }
}