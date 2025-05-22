package abstractFactory.Paycheck;


public class KreatorFabryki {
    public static FabrykaAbstrakcyjna getFabryka(String choice)
    {
        if(choice.equalsIgnoreCase("umowa"))
        {
            return new FabrykaUmowy();
        }
        else if(choice.equalsIgnoreCase("rok"))
        {
            return new FabrykaRoku();
        }
        return null;
    }
}
