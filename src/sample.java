import java.util.Scanner;

public class sample {

  public static void Matrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.printf("%5d", matrix[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] A = new int[3][3];

    System.out.println("Nhập 9 số nguyên cho ma trận 3x3:");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("A[" + i + "][" + j + "] = ");
        A[i][j] = sc.nextInt();
      }
    }

    System.out.println("\nMa trận A:");
    Matrix(A);

    sc.close();
  }
}
