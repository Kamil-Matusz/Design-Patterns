package decorator.Practise;

public class PilotPractice extends TypePracticeDecorator {

    private  final Practice practice;

    public PilotPractice(Practice practice) {
        this.practice = practice;
    }

    @Override
    public String getPractice() {
        return practice.getPractice() + "Pilot practice";
    }

    @Override
    public String getTypePractice() {
        return "";
    }
}
