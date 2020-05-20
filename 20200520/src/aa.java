
public class aa {

	public static void main(String[] args) {

		int length = 7;
		int output = length;
		int[][] array = new int[length][length];
		int SW = 1;
		int i = 0, j = -1;
		int k = 1;

		while (true) {

			for (int c = 0; c < length; c++) {
				j = j + SW;
				array[i][j] = k;
				k = k + 1;
			}
			length = length - 1;
			if (length == 0)
				break;

			for (int c = 0; c < length; c++) {
				i = i + SW;
				array[i][j] = k;
				k = k + 1;
			}
			SW = SW * (-1);
		}
		for (i = 0; i < output; i++) {
			for (j = 0; j < output; j++) {
				System.out.printf("(%2d)", array[i][j]);
			}
			System.out.println();
		}
	}

}
