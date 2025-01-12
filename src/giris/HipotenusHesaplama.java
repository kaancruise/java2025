package giris;
import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {

        int a,b;
        double hip;
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarini giriniz : ");
        a = input.nextInt();

        System.out.print("b kenarini giriniz : ");
        b = input.nextInt();

        hip = Math.sqrt(a*a + b*b);

        System.out.print("hipotenus : " + hip);


    }
}
