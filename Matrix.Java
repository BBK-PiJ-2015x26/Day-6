public class Matrix {
	private int[][] array;
	
	//Constructor method
	public Matrix(int x, int y) {
		array = new int[x][y];
		for (int i=0; i < x; i++) {
			for (int j=0; j < y; j++) {
				array[i][j] = 1;
			}	
		}
	}
	//Setter method
	public void setElement(int a, int b, int c) {
		if (a > array.length && b >= array[0].length) {
			System.out.println ("Out of range");
			return;
		} else {
			array[a][b] = c;
		}
		
	}
	//Method to set row
	public void setRow(int row, String str) {
	// Count the numbers in a string
		int count = 0;
		for (int i=0; i < row; i++) {
			if (str.charAT(i) == ',') {
				count ++;
			}
			count = count + 1 //Count will be one higher than number of commas
		}
		if (count != array[0].length {
			return
		}
		
		
			
		
		
			
}
	
	