package decorator.File;

public class Files {
    public static void main(String[] args) {

        File mp4file = new MP4File();
        System.out.println(mp4file.getDescription());

        File mp4cryptedfile = new CryptedFile(mp4file);
        System.out.println(mp4cryptedfile.getDescription());
    }
}
