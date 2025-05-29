package decorator.Practise;

public class CoursePractice extends TypePracticeDecorator {

    Practice practice;

    public CoursePractice(Practice practice) {
        this.practice = practice;
    }

    @Override
    public String getTypePractice() {
        return practice.getPractice() + "course practice";
    }
}
