package visitor.Post;

public class List extends Przesylka {
    public List(double waga, String miejsce) {
        super(waga, miejsce);
    }

    @Override
    public void zaakceptuj(OplataVisitor visitor) {
        visitor.wizytuj(this);
    }
}