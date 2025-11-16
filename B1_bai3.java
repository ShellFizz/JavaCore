import java.util.Scanner;

public class B1_bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 3: Đếm số lượng chữ số và tổng chữ số\n"
        + "Đề bài:\n"
        + "Nhập số nguyên dương a (0 < n < 10^9).\n"
        + "In ra:\n"
        + "Số lượng chữ số\n"
        + "Tổng các chữ số");
    System.out.println("Nhập số nguyên dương a: ");
    int a = sc.nextInt();
    int count = 0;
    int sum_a = 0;
    for(int i=a; i > 0; i/= 10) {
      sum_a+=i%10;
      count++;
    }
    System.out.println("Số lượng chữ số là: " + count);
    System.out.println("Tổng chữ số là: " + sum_a);
  }
}
