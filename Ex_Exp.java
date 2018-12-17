public class Ex_Exp{
	public static void main (String s[]){
		try
		{  
			int x,y,z;
			x = integer.parseInt(S[0]);
			y = Integer.parseInt(S[1]);
			z = x/y;
			System.out.print("Z= "+z);		
		}
	
		Catch(Arithmetic Exception e)
		{
			System.out.println("Divided by Zero"+e)
		}
		catch(NumberFormat Exception e)
		{
			System.out.println("not an number");
		}	
		finally
		{
			System.out.println("Finally Block");
		}
	}
}