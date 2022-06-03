public class Main {

    public static void main(String[] args) {
/*      int[] sayilar = new int[6];
        sayilar[0] = 1;
        sayilar[1] = 2;
        sayilar[2] = 5;
        sayilar[3] = 7;
        sayilar[4] = 9;
        sayilar[5] = 0;
        int[] sayilar1 = new int[]{1, 2, 5, 7, 9, 0};*/
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int willFind = 12;

        for (int sayi:sayilar){
            if(willFind==sayi){
                System.out.println("Sayı Bulundu.");
                return;
            }
        }
        System.out.println("Sayı Bulunamadı");

    }
}
