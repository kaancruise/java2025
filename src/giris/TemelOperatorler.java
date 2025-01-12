package giris;

public class TemelOperatorler {
    public static void main(String[] args) {

        int a  = 5, b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //b = b + a
        b += a;
        System.out.println(b);

        //karşılaştırma
        boolean sonuc = (1 == 5);
        System.out.println(sonuc);

        boolean sonuc2 = !(a == b);
        System.out.println(sonuc2);

        String str = (sonuc) ? "Dogru" : "Yanlis";
        System.out.println(str);

        int result = (sonuc) ? 1 : 0;
        System.out.println(result);

    }
}
