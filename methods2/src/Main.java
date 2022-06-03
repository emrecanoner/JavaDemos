public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        System.out.println(topla2(3,3,2,3,4,5));
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int total=0;
        for(int sayi:sayilar){
            total+=sayi;
        }
        return total;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
