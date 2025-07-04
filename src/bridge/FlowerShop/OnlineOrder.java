package bridge.FlowerShop;

public class OnlineOrder extends FlowerOrder {

    public OnlineOrder(Flower flower, int quantity) {
        super(flower, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.printf("[Online] %d x %s %s (%.2f zł/szt)\n",
                quantity, flower.getColor(), flower.getName(), flower.getPrice());
    }

    @Override
    public double calculateTotal() {
        return quantity * flower.getPrice() * 1.10;
    }
}
