class CalcMath {
	public static void main (String args[]) {
	int a, b, sum, mul, sub, div;
	a=87;
	b=11;
	sum = a+b;
	sub = a-b;
	mul = a*b;
	div = a/b;		
		System.out.println("The Addition of a & b is: " +sum);
		System.out.println("The Multiplication of a & b: " +mul);
		System.out.println("The Sub of a & b is: " +sub);
		System.out.println("The Division of a & b is: " +div);
	if (sum == a+b||mul == a*b||sub == a-b||div == a/b)
			System.out.println("Program quitely worked ");
	else		
			System.out.println("Don't worry look it again");     
	}
}
