import java.util.Scanner;

public class B1_bai10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("B10 Tìm bội chung nhỏ nhất (BCNN) \n"
        + "Yêu cầu:\n"
        + "Nhập 2 số e, f (1 ≤ e,f ≤ 100).\n"
        + "Tìm BCNN của e và f.\n");
    System.out.print("Nhập số e: ");
    int e = sc.nextInt();
    System.out.print("Nhập số f: ");
    int f = sc.nextInt();

    int t1 = e, t2 = f;
    while(t2!=0){
      int temp = t2;
      t2 = t1 % t2;
      t1 = temp;
    }
    int UCLN = t1;
    int BCNN = (e * f)/UCLN;
    System.out.println("Bội chung nhỏ nhất của e = " + e + " và f = " + f + " là: " + BCNN);
  }
}
