package mediator.Chat;

public interface ChatMediator
{
	public void wyslijWiadomosc(String komunikat, Uzytkownik uzytkownik);
	void dodajUzytkownika(Uzytkownik uzytkownik);
}