import java.util.Scanner;

public class bb {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;

      while (true) { // Ȧ�� �Է¹ޱ�
         System.out.print("������ ũ�� Ȧ�� n�� �Է�: ");
         n = sc.nextInt();

         if (n % 2 == 1) {
            break;
         }
      }
      sc.close();

      System.out.println();
      int[][] arr = new int[n][n];
      int num = 1;

      int i = 0;
      int j = n / 2; // n=2 i=0 j=1
      int ti, tj; // �Ѵ� �� ������ ���� ��ġ ����
      int tii, tjj; // �̹� �����Ҷ� ���� ��ġ ����

      arr[i][j] = num;

      while (num < n * n) {
         tii = i;
         tjj = j;
         i--;
         j--;

         if (i < 0 && j >= 0) { // i�� �� ���� ���
            i = n - 1;
         }

         if (i >= 0 && j < 0) { // j�� �� ���� ���
            j = n - 1;
         }

         if (i < 0 && j < 0) { // i, j �Ѵ� �� ���� ���
            ti = i;
            tj = j;
            i = n - 1;
            j = n - 1;
         }

         num++;

         if (arr[i][j] == 0) { // �ڸ� ��������� �� ����
            arr[i][j] = num;
         } 
         else { // �̹� �����ϰ� ������ ������ġ �ٷξƷ��� ����
            i = tii + 1;
            if (i >= n) {
               i -= n;
            }
            j = tjj;
            arr[i][j] = num;
         }

      }

      for (int a = 0; a < n; a++) { // �迭 ���
         for (int b = 0; b < n; b++) {
            System.out.printf("%2d ", arr[a][b]);
         }
         System.out.println();
      }
   }

}