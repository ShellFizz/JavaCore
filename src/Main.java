import java.sql.SQLOutput;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Chọn bài tập số từ 1 đến 10: ");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
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
        break;
      case 2:
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
        break;
      case 3:
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
        break;
      case 4:
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
        break;
      case 5:
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
        break;
      case 6:
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
        break;
      case 7:
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
            if(nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
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
        break;
      case 8:
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
        break;
      case 9:
        System.out.println("Bài 9 – Kiểm tra số Armstrong \n"
            + "Yêu cầu:\n"
            + "Nhập d (100 ≤ d ≤ 999).\n"
            + "Kiểm tra số Armstrong: tổng lập phương các chữ số = chính nó.\n"
            + "153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 → Là số Armstrong");
        System.out.print("Nhập số d: ");
        int d = sc.nextInt();
        int sum_armstrong = 0;
        for(int i = d; i > 0; i/=10){
          int digit = i%10;
          sum_armstrong+=digit*digit*digit;
        }
        if(sum_armstrong == d){
          System.out.println("Là số Armstrong.");
        } else{
          System.out.println("Chưa tài đâu..!");
        }
        break;
      case 10:
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
        System.out.println("Bội chung nhỏ nhất của e " + e + " và f " + f + " là: " + BCNN);
        break;
      default:
        System.out.println("Không có bài nào phù hợp");
    }
  }
}