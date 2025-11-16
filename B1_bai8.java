import java.util.Scanner;

public class B1_bai8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 8 – Tính tổng các số lẻ từ 1 đến c \n"
        + "Yêu cầu:\n"
        + "Nhập c (1 ≤ c ≤ 1000).\n"
        + "Tính tổng các số lẻ từ 1 đến c.");
    System.out.print("Nhập c: ");
    int c = sc.nextInt();
    int sum_odd = 0;
    for(int i = 1; i <= c; i++){
      if(i%2 != 0){
        sum_odd+=i;
      }
    }
    System.out.println("Tổng số lẻ là: " + sum_odd);
  }
}
