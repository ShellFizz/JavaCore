import java.util.Scanner;

public class B1_bai6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bài 6: In hình chữ nhật rỗng \n"
        + "Đề bài:\n"
        + "Nhập 2 số nguyên h (chiều cao), w (chiều rộng), 3 ≤ h,w ≤ 20.\n"
        + "In hình chữ nhật rỗng bằng dấu *.\n"
        + "Ví dụ: h = 4, w = 6\n"
        + "******\n"
        + "*    *\n"
        + "*    *\n"
        + "******");
    System.out.print("Nhập chiều cao: ");
    int h = sc.nextInt();
    System.out.print("Nhập chiều rộng: ");
    int w = sc.nextInt();
    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        if(i == 0 || (j == 0 || j == w - 1) || i == h - 1){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
