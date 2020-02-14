import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đọc");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number < 10) {
            System.out.println(hangDonVi(number));
        }else if (number < 20 && number >= 10){
            System.out.println(hangChuc1(number));
        }else if (number >= 20 && number < 100){
            System.out.println(hangChuc2(number));
        }else if (number>=200 && number < 1000){
            System.out.println(hangTram1(number));
        }else if (number>=100 && number<110){
            System.out.println(hangTram2(number));
        }else if (number>= 110 && number<220){
            System.out.println(hangTram3(number));
        }
    }
        public static String hangDonVi(int number) {
            switch (number) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
            }
            return "";
        }

        public static String hangChuc1(int number){
        int hangDonVi = number % 10;

            if(number == 10){
                return "ten";
            }
            switch (hangDonVi){
                case 1:
                    return "eleven";
                case 2:
                    return "twelve";
                case 3:
                    return "thirteen";
                case 4:
                    return "fourteen";
                case 5:
                    return "fifteen";
                case 6:
                    return "sixteen";
                case 7:
                    return "seventeen";
                case 8:
                    return "eighteen";
                case 9:
                    return "nineteen";
            }
            return "";
        }

        public static String hangChuc2(int number) {
            int donVi = number % 10;
            int hangChuc = number / 10;
            switch (number) {
                case 20:
                    return "twenty";
                case 30:
                    return "thirty";
                case 40:
                    return "fourty";
                case 50:
                    return "fifty";
                case 60:
                    return "sixty";
                case 70:
                    return "seventy";
                case 80:
                    return "eighty";
                case 90:
                    return "ninety";
            }

            switch (hangChuc){
                case 2:
                    return "Twenty " + hangDonVi(donVi);
                case 3:
                    return "Thirty " + hangDonVi(donVi);
                case 4:
                    return "Fourty " + hangDonVi(donVi);
                case 5:
                    return "Fifty " + hangDonVi(donVi);
                case 6:
                    return "Sixty " + hangDonVi(donVi);
                case 7:
                    return "Seventy " + hangDonVi(donVi);
                case 8:
                    return "Eighty " + hangDonVi(donVi);
                case 9:
                    return "Ninety " + hangDonVi(donVi);
            }

            return "";
        }

        public static String hangTram1(int number) {
            int hangTram = number / 100;
            int hangChuc = number % 100;
            switch (number) {
                case 200:
                    return "Two hundred";
                case 300:
                    return "Three hundred";
                case 400:
                    return "Four hundred";
                case 500:
                    return "Five hundred";
                case 600:
                    return "Six hundred";
                case 700:
                    return "Seven hundred";
                case 800:
                    return "Eight hundred";
                case 900:
                    return "Nine hundred";
            }

            switch (hangTram) {
                case 1:
                    return "One hundred and " + hangChuc2(hangChuc);
                case 2:
                    return "Two hundred and " + hangChuc2(hangChuc);
                case 3:
                    return "Three hundred and " + hangChuc2(hangChuc);
                case 4:
                    return "Four hundred and " + hangChuc2(hangChuc);
                case 5:
                    return "Five hundred and " + hangChuc2(hangChuc);
                case 6:
                    return "Six hundred and " + hangChuc2(hangChuc);
                case 7:
                    return "Seven hundred and " + hangChuc2(hangChuc);
                case 8:
                    return "Eight hundred and " + hangChuc2(hangChuc);
                case 9:
                    return "Nine hundred and " + hangChuc2(hangChuc);
            }
            return "";
        }

        public static String hangTram2(int number){
        int hangTram = number / 100;
        int hangChuc = number % 100;
        int donVi = hangChuc % 10;
        if (number == 100){
            return "One hundred";
        }
        switch (hangTram){
            case 1:
                return "One hundred and " + hangDonVi(donVi);
            case 2:
                return "Two hundred and " + hangDonVi(donVi);
            case 3:
                return "Three hundred and " + hangDonVi(donVi);
            case 4:
                return "Four hundred and " + hangDonVi(donVi);
            case 5:
                return "Five hundred and " + hangDonVi(donVi);
            case 6:
                return "Six hundred and " + hangDonVi(donVi);
            case 7:
                return "Seven hundred and " + hangDonVi(donVi);
            case 8:
                return "Eight hundred and " + hangDonVi(donVi);
            case 9:
                return "Nine hundred and " + hangDonVi(donVi);
        }
        return "";
    }

    public static String hangTram3(int number){
        int hangTram = number / 100;
        int hangChuc = number % 100;
        switch (hangTram){
            case 1:
                return "One hundred and " + hangChuc1(hangChuc);
            case 2:
                return "Two hundred and " + hangChuc1(hangChuc);
            case 3:
                return "Three hundred and " + hangChuc1(hangChuc);
            case 4:
                return "Four hundred and " + hangChuc1(hangChuc);
            case 5:
                return "Five hundred and " + hangChuc1(hangChuc);
            case 6:
                return "Six hundred and " + hangChuc1(hangChuc);
            case 7:
                return "Seven hundred and " + hangChuc1(hangChuc);
            case 8:
                return "Eight hundred and " + hangChuc1(hangChuc);
            case 9:
                return "Nine hundred and " + hangChuc1(hangChuc);
        }
        return "";
    }
}

