package simplecounter1;

public class tallycounter {

	public static void main(String[] args) 
	{
		simplest1 counter1 = new simplest1();
		simplest1 counter2 = new simplest1(100);
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		
		counter1.reset();
		System.out.println(counter1.getCount());
		
		
	}

}
