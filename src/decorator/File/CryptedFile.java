package decorator.File;

public class CryptedFile extends FileDecorator {

    File file;

    public CryptedFile(File file) {
        this.file = file;
    }

    @Override
    public String getDescription() {
        return file.getDescription() + "crypted";
    }
}
