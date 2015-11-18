public class ArrayCopier {
	
	public static void main(String[] args) {
	
	}
	
	//Method to copy elements of first array to second array	
	public int copy(int[] src, int dst[]) {
		if (src.length < dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = 0:;
			}
		} else if (src.length >= dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		}
	}
}