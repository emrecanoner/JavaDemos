public class Main {

    public static void main(String[] args) {
        char harf='y';
        char[] kalınHarfler = {'a','ı','o','u'};
        char[] inceHarfler = {'e','i','ö','ü'};
        for(char isHarf:kalınHarfler){
            if(isHarf==harf){
                System.out.println(harf+" kalın harftir");
                return;
            }
        }
        for(char isHarf:inceHarfler){
            if(isHarf==harf){
                System.out.println(harf+" ince harftir.");
                return;
            }
        }
        System.out.println("geçersiz harf");

        System.out.println("------------------------");

        char letter ='y';
        switch (letter){
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(letter+" kalın harfttir");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
                System.out.println(letter+" ince harftir");
                break;
            default:
                System.out.println("geçersiz harf");
        }
    }
}
