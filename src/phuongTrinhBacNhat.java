import java.util.Scanner;

public class phuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a= scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b= scanner.nextDouble();

        if (a != 0) {
            double answer = - b / a;
            System.out.printf("Equation pass with x = %f", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
