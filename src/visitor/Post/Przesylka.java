package visitor.Post;

public abstract class Przesylka {
    protected double waga;
    protected String miejsce;

    public Przesylka(double waga, String miejsce) {
        this.waga = waga;
        this.miejsce = miejsce;
    }

    public abstract void zaakceptuj(OplataVisitor visitor);
}