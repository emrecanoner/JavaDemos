public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Emre";
        String ogrenci2 = "Can";
        String ogrenci3 = "Öner";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("----------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Emre";
        ogrenciler[1] = "Can";
        ogrenciler[2] = "Öner";

        for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------------");

        //arraylarin for için yaygın kullanımı
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
