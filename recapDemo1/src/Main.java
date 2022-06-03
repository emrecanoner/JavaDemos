public class Main {

    public static void main(String[] args) {
        int a=55;
        int b=25;
        int c=244;
        int enBuyuk=a;
        if(a>b){
            if(a>c){
                if(b>c){
                    System.out.println(a+">"+b+">"+c);

                }else{
                    System.out.println(a+">"+c+">"+b);
                }
            }else if(c>a){
                System.out.println(c+">"+a+">"+b);
            }
        }
        else if(b>a){
            if(b>c){
                if(a>c) {
                    System.out.println(b + ">" + a + ">" + c);
                }else {
                    System.out.println(b + ">" + c + ">" + a);
                }

            }
        }else if(c>a){
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }
            else{
                System.out.println(c+">"+b+">"+a);
            }
        }
        if(b>enBuyuk){
            enBuyuk=b;
        }
        if(c>enBuyuk){
            enBuyuk=c;
        }
        System.out.println("En Büyük : "+enBuyuk);

    }
}
