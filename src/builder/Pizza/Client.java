package builder.Pizza;

public class Client {
    public static void main(String[] args) {
        Director direct = new Director();
        PizzaBuilder hawaiBuilder = new HawaiPizza();

        direct.setPizzaBuilder(hawaiBuilder);
        direct.buildPizza();
        Pizza hawaiPizza = direct.getPizza();
        System.out.println("Hawai Pizza");
        hawaiPizza.show();
    }
}
