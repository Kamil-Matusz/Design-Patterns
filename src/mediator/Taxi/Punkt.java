package mediator.Taxi;

public class Punkt {
    int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double odlegloscDo(Punkt other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}