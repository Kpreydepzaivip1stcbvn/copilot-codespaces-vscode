import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        // Kiểm tra xem n có phải là số nguyên dương không
        if (n < 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
            return; // Kết thúc chương trình
        }

        long giaiThua = 1; // Biến để lưu giai thừa
        for (int i = 1; i <= n; i++) {
            giaiThua *= i; // Tính giai thừa
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        
        scanner.close(); // Đóng scanner
    }
}
