import java.util.Scanner;

public class B1_bai5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 5: Chuyển đổi nhiệt độ \n"
        + "Đề bài:\n"
        + "Viết chương trình chuyển đổi nhiệt độ với menu:\n"
        + "=== CHUYEN DOI NHIET DO ===\n"
        + "1. C sang F\n"
        + "2. F sang C\n"
        + "3. Thoat\n"
        + "\n"
        + "Ví dụ \n"
        + "Chon (1-3): 1\n"
        + "Nhap do C: 25\n"
        + "25.0 C = 77.0 F\n"
        + "Chon (1-3): 3\n"
        + "Tam biet!");
    System.out.print("Nhập lựa chọn: ");
    int lua_chon = sc.nextInt();
    switch(lua_chon){
      case 1:
        System.out.println("1. C sang F...");
        System.out.print("Nhập độ C: ");
        float do_C = sc.nextFloat();
        System.out.println(do_C + " C = " + do_C * 1.8 +32 + " F");
        break;
      case 2:
        System.out.println("2. F sang C...");
        float do_F = sc.nextFloat();
        System.out.println(do_F + " C = " + do_F * 1.8 +32 + " C");
        break;
      case 3:
        System.out.println("Thoát...");
        System.out.println("再见");
        break;
    }
  }
}
