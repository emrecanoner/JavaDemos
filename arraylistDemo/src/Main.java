import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*	    int[] sayilar = new int[]{1,2,3};
	    sayilar=new int[];
        System.out.println(sayilar[0]);*/

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(0));
        sayilar.set(1,45);
        System.out.println(sayilar);
        sayilar.remove(0);//indexi siler elemanı değil
        System.out.println(sayilar);
        for (Object sayi:sayilar){
            System.out.println(sayi);
        }
        sayilar.clear();
        System.out.println(sayilar);
    }
}
