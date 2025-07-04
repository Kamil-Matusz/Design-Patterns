package bridge.FlowerShop;

public class InStoreOrder extends FlowerOrder {

    public InStoreOrder(Flower flower, int quantity) {
        super(flower, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Sklep] %d x %s %s (%.2f zł/szt)\n",
                quantity, flower.getColor(), flower.getName(), flower.getPrice());
    }

    @Override
    public double calculateTotal() {
        return quantity * flower.getPrice();
    }
}
