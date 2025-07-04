package adapter.Document;

public class TextDocument implements Document {

    private PDFDocument pdfDocument;

    public TextDocument(PDFDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    @Override
    public void save(String data) {

        String formattedData = transformToTextFormat(data);

        pdfDocument.saveToPDF(formattedData, "plik.pdf");
    }

    private String transformToTextFormat(String data) {
        return data;
    }
}
