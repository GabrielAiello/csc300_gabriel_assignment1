package hwassignment1csc300;

public class Driver 
{
	public static void main(String[] args)
	{
		Alist lst = new Alist();
		lst.add("s");
		lst.add("c");
		lst.add("v");
		lst.add("b");
		lst.add("g");
		lst.add("n");
		lst.removeAtIndex(1);
		System.out.println(lst.getAtIndex(1));
	}
}
