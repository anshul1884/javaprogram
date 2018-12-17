class A
{
	int x,y,z;
	public void show (int p1, int p2)
	{
		try
		{
		x = p1;
		y = p2;
		z = x/y;
		System.out.println("z= " +z);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divided by zero");
		}
		finally
		{
			System.out.println("Finally of A");
		}
	}
}
public class Try 
{
	public static void main(String args[])
	{
		try
		{
		A ob1 = new A();
		ob1.show(10,2);
		ob1.show(10,0);
		ob1.show(10,5);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divided by zero in MAIN");	
		}
		finally
		{	
			System.out.println("Finally of MAIN");
		}
	}
}