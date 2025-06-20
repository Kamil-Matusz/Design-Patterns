package bridge.FlowerShop;

import java.util.ArrayList;
import java.util.List;

public class MixedFlowerOrder extends FlowerOrder {

    private List<FlowerOrder> orders = new ArrayList<>();

    public MixedFlowerOrder() {
        super(null);
    }

    public void addFlowerOrder(FlowerOrder order) {
        orders.add(order);
    }

    @Override
    public void displayOrderDetails() {
        for (FlowerOrder order : orders) {
            order.displayOrderDetails();
        }
    }

    @Override
    public double calculateTotal() {
        return orders.stream().mapToDouble(FlowerOrder::calculateTotal).sum();
    }
}
