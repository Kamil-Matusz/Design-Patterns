package abstractFactory.Paycheck;

public class Rok2024 implements RokPodatkowy{

    private final String rokPodatkowy;

    public Rok2024() {
        rokPodatkowy = "2024";
    }

    @Override
    public String rokPodatkowy() {
        return rokPodatkowy;
    }
}
