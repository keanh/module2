import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                    isLeapYear = true;
            }
        }

        if (isLeapYear == true){
            System.out.printf("%d is a leap year", year);
        }else{
            System.out.printf("%d is not a leap year",year);
        }
    }
}
