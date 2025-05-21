package builder.Pizza;

public class Pizza {

    private String creme;
    private String cheese;
    private String meet;
    private String vegetables;
    private String fruits;

    public void setCreme(String creme) {
        this.creme = creme;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeet(String meet) {
        this.meet = meet;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public void show() {
        System.out.println("Cheese: " + cheese);
        System.out.println("Creme: " + creme);
        System.out.println("Meet: " + meet);
        System.out.println("Vegetables: " + vegetables);
        System.out.println("Fruits: " + fruits);
    }
}
