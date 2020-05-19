import java.util.Scanner;

public class cc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] square = new int[n][n];
		int num = 1;
		int y = 0;
		int x = n / 2;
		for (int i = 0; i < n * n; i++) {
			square[y][x] = num; // 숫자입력
			int originX = x; // 원점위치 기억
			int originY = y;
			if (x - 1 < 0) {
				x = n - 1;
			} else {
				x--;
			}
			if (y - 1 < 0) {
				y = n - 1;
			} else {
				y--;
			}
			if (square[y][x] > 0) {
				y = originY + 1;
				x = originX;
			}
			num++;
		}
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}
}