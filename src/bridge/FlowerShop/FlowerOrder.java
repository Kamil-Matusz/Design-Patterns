package bridge.FlowerShop;

public abstract class FlowerOrder {
    protected Flower flower;
    protected int quantity;

    public FlowerOrder(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public abstract void displayDetails();
    public abstract double calculateTotal();
}
