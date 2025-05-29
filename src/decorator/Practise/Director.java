package decorator.Practise;

public class Director {
    public static void main(String[] args) {

        Practice firstPractice = new FirstPractice();
        System.out.println(firstPractice.getPractice());

        Practice secondPilotPracice = new SecondPractice();
        secondPilotPracice = new PilotPractice(secondPilotPracice);
        System.out.println(secondPilotPracice.getPractice());
    }
}
