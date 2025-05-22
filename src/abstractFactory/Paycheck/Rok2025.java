package abstractFactory.Paycheck;

public class Rok2025 implements RokPodatkowy{

    private final String rokPodatkowy;

    public Rok2025() {
        rokPodatkowy = "2025";
    }

    @Override
    public String rokPodatkowy() {
        return rokPodatkowy;
    }
}
