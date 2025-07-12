package mediator.Chat;

public class Program {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        Uzytkownik uzytkownik1 = new UzytkownikImpl(mediator, "Marek");
        Uzytkownik uzytkownik2 = new UzytkownikImpl(mediator, "Ela");
        Uzytkownik uzytkownik3 = new UzytkownikImpl(mediator, "Wojtek");
        Uzytkownik uzytkownik4 = new UzytkownikImpl(mediator, "Asia");
        mediator.dodajUzytkownika(uzytkownik1);
        mediator.dodajUzytkownika(uzytkownik2);
        mediator.dodajUzytkownika(uzytkownik3);
        mediator.dodajUzytkownika(uzytkownik4);

        uzytkownik1.wyslij("Cześć wszystkim!");
    }
}
