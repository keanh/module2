import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Năm nhuận");
        }else if (year % 100 == 0 && year % 400 == 0){
            System.out.println("Năm nhuận");
        }else{
            System.out.println("Không phải năm nhuận");
        }
    }
}
