package decorator.Picure;

public class Horizontal extends DecoratorOrientation {

    Picture picture;

    public Horizontal(Picture horizontal) {
        this.picture = horizontal;
    }

    public String getDescription() {
        return picture.getDescription() + " horizontal";
    }
}
