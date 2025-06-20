package facade.ShoppingList;

import java.io.IOException;

public class ShoppingListFacade {
    private final StringArray stringArray;
    private final View view;
    private final TextFile textFile;

    public ShoppingListFacade(String filePath) {
        this.stringArray = new StringArray();
        this.view = new View();
        this.textFile = new TextFile(filePath);
    }

    public void createList(String[] items) {
        stringArray.initialize(items);
    }

    public void showListWithSeparator(String separator) {
        view.displayWithSeparator(stringArray.getAll(), separator);
    }

    public void saveListToFile(String separator) {
        try {
            textFile.write(String.join(separator, stringArray.getAll()));
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
