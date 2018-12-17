class Two_darray {
	public static void main (String args[]) {
		int twoD [] [] = new int [4] [9];
		int i, j, k = 0; {
	for (i=0; i<4; i++)
		for (j=0; j<i+1; j++) {
			twoD [i] [j] = k;
			k++;
			}
	for (i=0; i<4; i++) {
		for (j=0; j<i+1; j++)
			System.out.print(twoD [i] [j]+ " ");
		System.out.println ();
			}
		}
	}	
}