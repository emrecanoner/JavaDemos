public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int willFind = 12;
        boolean isExisted = false;

        for (int sayi : sayilar) {
            if (willFind == sayi) {
                isExisted = true;
                break;
            }
        }
        if (isExisted) {
            System.out.println("Sayı Mevcut.");
        } else {
            System.out.println("Sayı Mevcut Değil.");
        }

    }

    public static void mesajVer() {
        

    }
}
