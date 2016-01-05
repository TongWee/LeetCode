package coding_interviews;

public class PrintMatrixClockwisely {
	public static void printMatrix(int[][] a, int rows, int cols) {
		if (rows <= 0 || cols <= 0 || a == null)
			return;
		int start = 0;
		while (start < rows / 2 && start < cols / 2) {
			printCircle(a, rows, cols, start);
			start++;
		}
	}

	private static void printCircle(int[][] a, int rows, int cols, int start) {
		int endX = cols - start - 1, endY = rows - start - 1;
		int i, j, k, l;
		for (i = start; i <= endX; i++) {
			System.out.print(a[start][i] + " ");
		}
		if (start < endY)

			for (j = start + 1; j <= endY; j++) {
				System.out.print(a[j][endX] + " ");
			}
		if (start < endX && start < endY)
			for (k = endX - 1; k >= start; k--) {
				System.out.print(a[endX][k] + " ");
			}
		if (start < endX && start < endY - 1)
			for (l = endY - 1; l >= start + 1; l--) {
				System.out.print(a[l][start] + " ");
			}
	}

	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		printMatrix(a, 4, 4);
	}
}
