package facade.ShoppingList;

public class View {

    public void display(String[] data) {
        for (String item : data) {
            System.out.println(item);
        }
    }

    public void displayWithSeparator(String[] data, String separator) {
        System.out.println(String.join(separator, data));
    }
}
