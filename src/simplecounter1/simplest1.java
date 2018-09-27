package simplecounter1;

public class simplest1
{
	// Instance variables
	
	private int count;
	
	// Constructor
	
	public simplest1()
	{
		count = 0;
	}
		
	public simplest1(int startNum)
	{
		count = startNum;
	}
	
	public void click()
	{
		count = count + 1;
		// count ++; that is a shortcut for the above
		// count+=1; another shortcut	
	}
	
	public void unclick()
	{
		count = count - 1;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "count: " + count;
	}
	
}
