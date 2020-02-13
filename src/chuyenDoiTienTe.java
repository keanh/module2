import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi sang VNĐ");
        USD = scanner.nextDouble();
        double charge = USD *VND;
        System.out.println("Số tiền đổi là: " + charge);
    }
}
