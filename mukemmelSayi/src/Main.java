public class Main {

    public static void main(String[] args) {
        int number = 6, total = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }


        int num = 1000, tot = 0;
        for (int i = 6; i <= num; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    tot += j;
                }
            }
            if (i == tot) {
                System.out.println(i + " mükemmel sayıdır.");
            }
            tot = 0;
        }
    }
}
