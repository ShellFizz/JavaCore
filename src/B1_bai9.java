import java.util.Scanner;

public class B1_bai9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 9 – Kiểm tra số Armstrong \nYêu cầu:\nNhập d (100 ≤ d ≤ 999).\nKiểm tra số Armstrong: tổng lập phương các chữ số = chính nó.\n153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 → Là số Armstrong");
    System.out.print("Nhập số d: ");
    int d = sc.nextInt();
    int sumArmstrong = 0;

    for(int i = d; i > 0; i /= 10) {
      int digit = i % 10;
      sumArmstrong += digit * digit * digit;
    }

    if (sumArmstrong == d) {
      System.out.println("Là số Armstrong.");
    } else {
      System.out.println("Chưa tài đâu..!");
    }

  }
}
