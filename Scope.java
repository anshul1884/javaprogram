class Scope {
 	public static void main(String s[]) {
	int x = 10;
	if (x == 10)
	{
	int y = 20;
		System.out.println("x and y: " + x + " " +y);
	x = y*2;
		System.out.println("y is :" +y);
	}
		System.out.println("x is :" +x);
	}
}	