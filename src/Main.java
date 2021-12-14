import java.util.Scanner;

public class Main {

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {

        if (b == 0) {
            System.out.println("İkinci sayıyı 0 girdiğiniz için işleminiz tanımsız.");
            return 0;
        } else
            return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }

        return result;

    }

    static int mod(int a, int b) {

        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Dikdörtgenin çevresi :" + 2 * (a + b));
        System.out.println("Dikdörtgenin alanı :" + (a * b));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        int select;

        String menu =
                "1- Toplama \n"
                        + "2 - Çıkarma \n"
                        + "3 - Çarpma\n"
                        + "4 - Bölme\n"
                        + "5 - Üs Alma\n"
                        + "6 - Mod Alma\n"
                        + "7 - Dikdörtgenin alanı ve çevresini hesaplama\n"
                        + "0 - Çıkış yap";

        System.out.println(menu);


        while (true) {
            System.out.println("Menuden yapmak istediğiniz işlemi seçiniz :");
            select = scan.nextInt();

            if (select == 0) {
                System.out.println("Sistemden çıkış yapılıyor !");
                break;
            }

            System.out.println("İlk sayı :");
            a = scan.nextInt();

            System.out.println("İkinci sayı :");
            b = scan.nextInt();

            switch (select) {

                case 1:
                    System.out.println("Toplama işlemi :" + plus(a, b));
                    break;

                case 2:
                    System.out.println("Çıkarma işlemi :" + minus(a, b));
                    break;

                case 3:
                    System.out.println("Çarpma işlemi :" + times(a, b));
                    break;

                case 4:
                    System.out.println("Bölme işlemi :" + divided(a, b));
                    break;

                case 5:
                    System.out.println("Üs alma işlemi :" + power(a, b));
                    break;

                case 6:
                    System.out.println("Mod alma işlemi :" + mod(a, b));
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz !");

            }
        }


    }
}
