public class ArrayCopier {
	
	public static void main(String[] args) {
		int[] srcArray1 = {1, 2, 3};
		int[] srcArray2 = {1, 2, 3, 4};
		int[] dstArray1 = {0, 0, 0};
		ArrayCopier arrayCopier = new ArrayCopier();
		arrayCopier.copy(srcArray1, dstArray1);
		System.out.println(dstArray1[0]);
		System.out.println(dstArray1[1]);
		System.out.println(dstArray1[2]);
	}

	//Method to copy elements of first array to second array	
	public int[] copy(int[] src, int[] dst) {
		if (src.length < dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = 0;
			}
		} 
		else if (src.length >= dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		}
		return dst;
	}
}