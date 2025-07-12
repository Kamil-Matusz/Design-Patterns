package observer.Access;

import java.util.ArrayList;
import java.util.HashMap;

public class KonfiguratorAplikacji extends Konfigurator {

    private ArrayList<Obserwator> obserwatorzy;
    private HashMap<String, String> klientKonfiguracji;

    public KonfiguratorAplikacji() {
        this.obserwatorzy = new ArrayList<Obserwator>();
        this.klientKonfiguracji = new HashMap<String, String>();
    }

    public void dodaj(Obserwator o) {
        if (!this.obserwatorzy.contains(o))
            this.obserwatorzy.add(o);

    }

    public void usun(Obserwator o) {
        if (this.obserwatorzy.contains(o))
            this.obserwatorzy.remove(o);
    }

    public void powiadomObserwatorow() {
        for (Obserwator o : this.obserwatorzy)
            o.aktualizuj(this.klientKonfiguracji);

    }

    public void ustawKonfiguracje(String klucz, String wartosc) {
        if (this.klientKonfiguracji.containsKey(klucz))
            this.klientKonfiguracji.replace(klucz, wartosc);
        else
            this.klientKonfiguracji.put(klucz, wartosc);

    }
}
