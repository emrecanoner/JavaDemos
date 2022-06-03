public class Main {

    public static void main(String[] args) {
        int sayi = 1;
        int counter = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(sayi + " asal değildir");
        } else {
            System.out.println(sayi + " asaldır");
        }

        System.out.println("---------------------");

        int number = -1;
        boolean isPrime = true;
        if (number == 1) {
            System.out.println(number + " asal değildir.");
            return;
        }

        if (number < 1) {
            System.out.println("geçersiz sayı.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(number + " asal değildir.");
                break;
            }
        }


        if (isPrime) {
            System.out.println(number + " asaldır.");
        }

    }
    //the first program has some bugs but second one is a good application for calculating prime number.
}
