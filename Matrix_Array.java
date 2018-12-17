class Matrix_Array {
	public static void main (String a[]){
	double matrix [ ] [ ] = {
		{ 0*0, 1*0, 2*0 },
		{ 0*1, 1*1, 2*1 },
		{ 0*2, 1*2, 2*2 }
		};
	int i ,  j;
	for(i=0; i<3; i++) {
		for (j=0; j<3; j++)
			System.out.print (matrix [i] [j] + " ");
			System.out.println();			
		}		
	}
}