package bridge.FlowerShop;

public class SingleFlowerOrder extends FlowerOrder {

    private int quantity;

    public SingleFlowerOrder(Flower flower, int quantity) {
        super(flower);
        this.quantity = quantity;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println(quantity + " x " + flower.getColor() + " " + flower.getName() + " (" + flower.getPrice() + " zł/szt)");
    }

    @Override
    public double calculateTotal() {
        return flower.getPrice() * quantity;
    }
}
