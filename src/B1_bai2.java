import java.util.Scanner;

public class B1_bai2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 2: Tính tổng các số chia hết cho 3 hoặc 5 \n"
        + "Đề bài:\n"
        + "Nhập số nguyên m (1 ≤ m ≤ 100).\n"
        + "Tính tổng các số từ 1 đến m chia hết cho 3 hoặc 5.");
    System.out.print("Nhập số n: ");
    int m = sc.nextInt();
    int sum35 =0;
    for(int i=1; i<=m; i++){
      if(i%3 == 0 || i%5 == 0){
        sum35 +=i;
      }
    }
    System.out.println("Tổng = " + sum35);
  }
}
