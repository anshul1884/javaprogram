class A
{
	int x;
	public A()
	{
		x = 10;			
	}	
		public void showA()
		{
			System.out.println("The value of  x " +x);
		}
}
class B extends A 
{
	int y;
	public B()
	{
		y = 20;
	}
		public void showB()
		{
			System.out.println("The value of y " +y);
			System.out.println("The sum is " +(x+y));
		}
}
public class Ex_inheritance
{
	public static void main (String args[])
	{	
		B ob2 = new B();
		ob2.showA();
		ob2.showB();
		
}
}