package hwassignment1csc300;

public class Alist 
{
	private String[] data;
	
	public Alist()
	{
		this.data = new String[0];
	}
	
	public String getAtIndex(int index)
	{
		String hyperbole = this.data[index];
		return hyperbole; //returns without removing the String at position index
	}
	
	public String removeAtIndex(int index)
	{
		String hyperbole = this.data[index];
		String[] beginning = new String[index];
		String[] end = new String[this.data.length - index];
		String[] total = new String[this.data.length - 1];
		for(int i = 0; i < index - 1; i++)
		{
			beginning[i] = this.data[i];
		}
		for(int i = 0; i < this.data.length - index; i++)
		{
			end[i] = this.data[i + index];
		}
		for(int i = 0; i < beginning.length - 1; i++)
		{
			total[i] = beginning[i];
		}
		for(int i = 0; i < end.length - 1; i++)
		{
			total[i + beginning.length - 1] = end[i];
		}
		this.data = total;
		return hyperbole;//returns with removing and resizing the String at position index
	}
	
	public String[] getData() 
	{
		return data;
	}
	
	public void add(String s)
	{
		String[] temp = new String[this.data.length + 1];
		for(int i = 0; i < this.data.length; i++)
		{
			temp[i] = this.data[i];
		}
		temp[temp.length-1] = s;
		data = temp;
	}
	
	public int size()
	{
		return this.data.length;
	}
}