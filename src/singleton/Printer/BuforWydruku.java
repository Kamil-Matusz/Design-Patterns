package singleton.Printer;

public class BuforWydruku {

    private static volatile BuforWydruku bufor;
    private static int licz;

    private BuforWydruku() {  
    }
    
    public static BuforWydruku getSpooler() {
        if (bufor == null) {
            synchronized (BuforWydruku.class) {
                if (bufor == null) {
                    bufor = new BuforWydruku();
                }
            }
        }
        return bufor;
    }

    protected void print(String s) {
        int lokalnaLicz = ++licz;
        System.out.println(s + " na drukarce " + lokalnaLicz);
    }
}