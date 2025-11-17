import java.util.Scanner;

public class B1_bai7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 7: Đếm số ngày trong tháng \n"
        + "Đề bài:\n"
        + "Nhập tháng (thang) và năm (nam).\n"
        + "In ra số ngày trong tháng đó (xử lý năm nhuận).\n"
        + "Ví dụ:\n"
        + "Nhap thang: 2\n"
        + "Nhap nam: 2024\n"
        + "Thang 2 nam 2024 co 29 ngay");
    System.out.print("Nhập tháng: ");
    int thang = sc.nextInt();
    System.out.print("Nhap nam: ");
    int nam = sc.nextInt();
    switch (thang) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Tháng " + thang + " năm " + nam + " có 31 ngày.");
        break;
      case 2:
        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
          System.out.println("Tháng " + thang + " năm " + nam + " có 29 ngày.");
        } else {
          System.out.println("Tháng " + thang + " năm " + nam + " có 28 ngày.");
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Tháng " + thang + " năm " + nam + " có 30 ngày.");
        break;
    }
  }
}
