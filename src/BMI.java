import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao");
        height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);

        if (bmi < 18)
            System.out.printf("%f %s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%f %s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%f %s", bmi, "Overweight");
        else
            System.out.printf("%f %s", bmi, "Obese");
    }
}
