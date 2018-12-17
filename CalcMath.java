class CalcMath {
	public static void main (String args[]) {
	int a, b, sum, mul, sub, div;
	a=50;
	b=40;
	sum = a+b;
	mul = a*b;
	sub = a-b;
	div = a/b;		
		System.out.println("The Addition is: " +sum);
		System.out.println("The Multiplication is: " +mul);
		System.out.println("The Sub is: " +sub);
		System.out.println("The Division is: " +div);
	if (sum == a+b||mul == a*b||sub == a-b||div == a/b)
			System.out.println("You are the coder");
	else		
			System.out.println("Study well");     
	}
}