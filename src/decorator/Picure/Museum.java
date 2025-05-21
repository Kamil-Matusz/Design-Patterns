package decorator.Picure;

public class Museum {

    public static void main(String args[])
    {
        Picture picture1 = new Frame();
        System.out.println(picture1.getDescription());

        Picture picture2 = new Frame();
        picture2 = new Horizontal(picture2);
        System.out.println(picture2.getDescription());

        Picture picture3 = new Frame();
        picture3 = new Horizontal(picture3);
        picture3 = new Vertical(picture3);
        System.out.println(picture3.getDescription());
    }
}
