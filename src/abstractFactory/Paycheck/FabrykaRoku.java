package abstractFactory.Paycheck;

public class FabrykaRoku extends FabrykaAbstrakcyjna{
    @Override
    public RokPodatkowy getRokPodatkowy(String rokPodatkowy) {
        if(rokPodatkowy.equalsIgnoreCase("2024")) {
            return new Rok2024();
        }
        else if (rokPodatkowy.equalsIgnoreCase("2025")) {
            return new Rok2025();
        }
        else {
            return null;
        }
    }

    @Override
    public Umowa getUmowa(String umowa) {
        return null;
    }
}
