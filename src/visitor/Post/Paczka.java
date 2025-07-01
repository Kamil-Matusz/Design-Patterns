package visitor.Post;

public class Paczka extends Przesylka {
    public Paczka(double waga, String miejsce) {
        super(waga, miejsce);
    }

    @Override
    public void zaakceptuj(OplataVisitor visitor) {
        visitor.wizytuj(this);
    }
}
