public class Matrix {
	private int[][] matrix;
	
	//Constructor method
	public Matrix(int x, int y) {
		this.matrix = new int[x][y];
		this.x = x;
		this.y = y;
		for (int i=0; i < x; i++) {
			for (int j=0; j < y; j++) {
				matrix[i][j] = 1;
			}	
		}
	}
	//Setter method
	public void setElement(int a, int b, int c) {
		if (a > this.a || b > this.b {
			System.out.println ("Out of range");
			return;
		}
		maxtrix[a][b] = c;
	}
			
		
		
				
				
		
		
	
	
}
	
	