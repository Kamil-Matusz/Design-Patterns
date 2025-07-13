package mediator.Chat;

public interface ChatMediator
{
	void wyslijWiadomosc(String komunikat, Uzytkownik uzytkownik);
	void dodajUzytkownika(Uzytkownik uzytkownik);
}