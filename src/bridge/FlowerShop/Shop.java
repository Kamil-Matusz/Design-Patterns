package bridge.FlowerShop;

public class Shop {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower tulip = new Tulip();

        FlowerOrder order1 = new SingleFlowerOrder(rose, 3);
        FlowerOrder order2 = new SingleFlowerOrder(tulip, 5);

        MixedFlowerOrder mixedOrder = new MixedFlowerOrder();
        mixedOrder.addFlowerOrder(order1);
        mixedOrder.addFlowerOrder(order2);

        System.out.println("Zamówienie klienta:");
        mixedOrder.displayOrderDetails();
        System.out.println("Łączna cena: " + mixedOrder.calculateTotal() + " zł");
    }
}
