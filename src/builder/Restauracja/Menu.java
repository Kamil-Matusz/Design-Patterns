package builder.Restauracja;

public class Menu {
    public static void main(String[] args) {
        Stolik table1 = new Stolik(5);
        Kelner waiter1 = new Kelner("Anna");
        DanieDirector director = new DanieDirector();

        String[] składniki = { "Bun", "Beef", "Lettuce" };
        CustomDanie builder = new CustomDanie("Burger", true, składniki);
        director.setDanieBuilder(builder);
        Danie burger = director.stworzDanie();

        Zamowienie order = new Zamowienie(burger, table1, waiter1);
        order.showOrder();

    }
}
