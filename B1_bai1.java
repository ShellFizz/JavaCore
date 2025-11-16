import java.util.Scanner;

public class B1_bai1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Bài 1: Kiểm tra số chẵn/lẻ và nguyên tố\n"
            + "Đề bài:\n"
            + "Viết chương trình nhập vào một số nguyên dương n (1 ≤ n ≤ 1000).\n"
            + "In ra:\n"
            + "\"So chan\" nếu n là số chẵn\n"
            + "\"So le\" nếu n là số lẻ\n"
            + "\"So nguyen to\" nếu n là số nguyên tố\n"
            + "\"Khong phai so nguyen to\" nếu không phải\n");
    System.out.print("Nhập số n : ");
    int n = sc.nextInt();

    if(n%2==0){
      System.out.println("So chan");
    } else{
      System.out.println("So le");
    }

    boolean isPrime = true;
    if(n<2) isPrime = false;
    else {
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.println("So nguyen to");
      } else {
        System.out.println("Ko phai so nguyen to");
      }
    }
  }
}
