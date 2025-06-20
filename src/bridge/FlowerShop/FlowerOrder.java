package bridge.FlowerShop;

public abstract class FlowerOrder {

    protected Flower flower;

    public FlowerOrder(Flower flower) {
        this.flower = flower;
    }

    public abstract void displayOrderDetails();

    public abstract double calculateTotal();
}
