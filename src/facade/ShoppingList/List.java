package facade.ShoppingList;

public class List {
    public static void main(String[] args) {
        ShoppingListFacade facade = new ShoppingListFacade("lista_zakupow.txt");

        String[] zakupy = { "mleko", "chleb", "masło", "jajka" };
        facade.createList(zakupy);
        facade.showListWithSeparator("; ");
        facade.saveListToFile("; ");
    }
}

