package visitor.Winners;

public class Student extends Element {
    private final String name;
    private final double average;
    private final boolean allFirstTerm;
    private final boolean laureate;

    // nagrody:
    private boolean czesneZw = false;
    private boolean karnet = false;
    private boolean limitBib = false;
    private boolean strzelnica = false;

    public Student(String name, double avg, boolean firstTerm, boolean laureate) {
        this.name = name;
        this.average = avg;
        this.allFirstTerm = firstTerm;
        this.laureate = laureate;
    }

    public double getAverage() {
        return average;
    }

    public boolean isAllFirstTerm() {
        return allFirstTerm;
    }

    public boolean isLaureate() {
        return laureate;
    }

    public void setCzesneZw() {
        this.czesneZw = true;
    }

    public void setKarnet() {
        this.karnet = true;
    }

    public void setLimitBib() {
        this.limitBib = true;
    }

    public void setStrzelnica() {
        this.strzelnica = true;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return name + "  |  nagrody: "
                + (czesneZw ? "czesne✔ " : "") + (karnet ? "karnet✔ " : "")
                + (limitBib ? "biblioteka✔ " : "") + (strzelnica ? "strzelnica✔ " : "");
    }
}
