package decorator.Picure;

public class Vertical extends DecoratorOrientation{

    Picture picture;

    public Vertical(Picture horizontal) {
        this.picture = horizontal;
    }

    public String getDescription() {
        return picture.getDescription() + " vertical";
    }
}
