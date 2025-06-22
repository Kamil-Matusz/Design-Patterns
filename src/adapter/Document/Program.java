package adapter.Document;

public class Program {
    public static void main(String[] args) {
        PDFDocument pdfDocument = new PDFDocument();
        Document writer = new TextDocument(pdfDocument);
        writer.save("Twoj dokument tekstowy");
    }
}
