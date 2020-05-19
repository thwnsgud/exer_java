
public class aa {

	public static void main(String[] args) {

		int n = 3;                          

		int array[][] = new int[n][n];
		int a = 1;
		int row = 0, colum = n / 2;
		for (a = 1; a <= (n * n); a++) {
			array[row][colum] = a;
			if (a % n == 0) {
				row++;
			} else {
				row--;
				colum--;
				if (row < 0)
					row = n - 1;
				else if (colum < 0)
					colum = n - 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}
}
