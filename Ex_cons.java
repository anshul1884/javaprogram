class A {
	A ()
	{
		System.out.println("Constr. Of Class A.");
	}
}
public class Ex_cons
	{
		Ex_cons ()
		{
			System.out.println("Constr. Of Class Ex_cons.");				
		}
						
		public static void main( String args[])
		{
			A ob1 = new A();		
			Ex_cons ob2 = new Ex_cons();
		}
	}