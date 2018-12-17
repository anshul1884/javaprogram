class A {
	public A()
	{
		System.out.println("Constr of class A");
	}
}
class B extends A{
	public B ()
	{
		System.out.println("Constr of class B");	
	}	
}
class C extends B{
	public C ()
	{
		System.out.println("Constr of class C");	
	}	
}
public class Ex_inhr
{
	public static void main (String args[])
	{
	C ob2 = new C ();
	}
}