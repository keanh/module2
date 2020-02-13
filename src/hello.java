import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String say = scanner.nextLine();
        System.out.println("Hello " + say);
    }
}
