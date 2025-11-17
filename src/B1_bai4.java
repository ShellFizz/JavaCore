import java.util.Scanner;

public class B1_bai4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 4: In tam giác số\n"
        + "Đề bài:\n"
        + "Nhập số nguyên b (1 ≤ n ≤ 9).\n"
        + "In tam giác số như sau:\n"
        + "Ví dụ với b = 4:\n"
        + "1\n"
        + "22\n"
        + "333\n"
        + "4444");
    System.out.println("Nhập số nguyên b: ");
    int b = sc.nextInt();
    for(int i = 1; i <= b; i++){
      for(int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
