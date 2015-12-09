public class Matrixchecker {
	 
	
	public boolean isSymmetrical (int[] array) {
		for (i = 0; i < array.length; i++) {
			if array[i] != array[array.length - 1 - i] {
				return false;
			}
		}
		return true;
	}
	
	public boolean isSymmetrical (int[] [] array) {
		for (i=0; i < array.length; i++) {
			for (j=0; j < array[0].length; i++) {
				if (array[i][j] != array [j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isTriangular(int[][] array) {
		for (i=0; i < array.lenght; i++) {
			for (j=0; j < array[0].length; j++) {
				if (i > j && arrayToTest[i][j] != 0) {
					return false;
				}
			}
		}	
		return true;
	}
}

		
		
				
		
		
		
				
	