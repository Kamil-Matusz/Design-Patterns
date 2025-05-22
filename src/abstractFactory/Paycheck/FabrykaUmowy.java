package abstractFactory.Paycheck;

public class FabrykaUmowy extends FabrykaAbstrakcyjna{
    @Override
    public RokPodatkowy getRokPodatkowy(String rokPodatkowy) {
        return null;
    }

    @Override
    public Umowa getUmowa(String umowa) {
        if(umowa.equalsIgnoreCase("umowa o prace")) {
            return new UmowaOPrace();
        }
        else if (umowa.equalsIgnoreCase("umowa zlecenie")) {
            return new UmowaZlecenie();
        }
        else {
            return null;
        }
    }
}
