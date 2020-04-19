import java.io.*;
public  class Ex_DIS
{
	public static void main (String args[]) throws Exception
	{
		String sname;
		int age;
		DataInputStream ob = new DataInputStream (System.in);
		System.out.println("Enter your name");
		sname = ob.readLine();
		System.out.println("Enter Your age");
		age = integer.parseInt(ob.readLine());
		System.out.println("Hello"+sname+ "Your age "+age);
	}
}	
