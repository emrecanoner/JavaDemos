public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        //Aynı method ismi ile hem ikili hem de üçlü toplama yapabildik(Overloading)
        System.out.println(dortIslem.topla(5, 8));
        System.out.println(dortIslem.topla(5,6,6));
    }
}
