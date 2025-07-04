package bridge.FlowerShop;

public class FloristAppBridge {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower tulip = new Tulip();

        FlowerOrder order1 = new OnlineOrder(rose, 3);
        FlowerOrder order2 = new InStoreOrder(tulip, 5);

        order1.displayDetails();
        order2.displayDetails();

        double total = order1.calculateTotal() + order2.calculateTotal();
        System.out.printf("Łączna kwota zamówienia: %.2f zł\n", total);
    }
}
