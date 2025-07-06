package iterator.Table;

public interface Iterator 
{
	boolean hasNext();
	boolean hasPrevious();
	Object next();
	Object previous();
}