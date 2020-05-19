import java.util.Scanner;

public class bb {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;

      while (true) { // 홀수 입력받기
         System.out.print("마방진 크기 홀수 n을 입력: ");
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
      int ti, tj; // 둘다 벽 넘을때 방지 위치 저장
      int tii, tjj; // 이미 존재할때 방지 위치 저장

      arr[i][j] = num;

      while (num < n * n) {
         tii = i;
         tjj = j;
         i--;
         j--;

         if (i < 0 && j >= 0) { // i만 벽 넘은 경우
            i = n - 1;
         }

         if (i >= 0 && j < 0) { // j만 벽 넘은 경우
            j = n - 1;
         }

         if (i < 0 && j < 0) { // i, j 둘다 벽 넘은 경우
            ti = i;
            tj = j;
            i = n - 1;
            j = n - 1;
         }

         num++;

         if (arr[i][j] == 0) { // 자리 비어있으니 값 대입
            arr[i][j] = num;
         } 
         else { // 이미 차지하고 있으니 이전위치 바로아래에 대입
            i = tii + 1;
            if (i >= n) {
               i -= n;
            }
            j = tjj;
            arr[i][j] = num;
         }

      }

      for (int a = 0; a < n; a++) { // 배열 출력
         for (int b = 0; b < n; b++) {
            System.out.printf("%2d ", arr[a][b]);
         }
         System.out.println();
      }
   }

}