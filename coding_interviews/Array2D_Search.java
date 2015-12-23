package coding_interviews;

//Page 40
public class Array2D_Search {
	public static boolean search(int[][] a, int key) {
		int row = a.length;
		int col = a[0].length;
		int i = 0, j = col - 1;
		while (key < a[i][j] && j >= 0) {
			j--;
		}
		while (key > a[i][j] && i < row) {
			i++;
		}
		return key == a[i][j];
	}
}
