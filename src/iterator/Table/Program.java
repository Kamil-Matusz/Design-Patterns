package iterator.Table;

public class Program 
 {
	public static void main(String[] args)
	{
		Tablica<Double> kontener = new Tablica<Double>(5000);
        kontener.set(0, 0.1);

        int rozmiar = kontener.size();

        for (int i = 1; i < rozmiar; ++i)
            kontener.set(i, Double.valueOf(i));

        Iterator iterator = kontener.getIterator();
        while (iterator.hasNext()) {
            Double value = (Double) iterator.next();
            System.out.println(value);
        }

        System.out.println("\nIteracja w odwrotnej kolejnosci:");

        while (iterator.hasPrevious()) {
            Double value = (Double) iterator.previous();
            System.out.println(value);
	
	    }
    }
}
