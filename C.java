class B 
{	public B()
	{
		System.out.println("B");
	}
}
public class C extends B
{	
	public static void main(String s[])
	{	B ob2 = new B();
	}
}