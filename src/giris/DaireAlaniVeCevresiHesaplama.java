package giris;
import java.util.Scanner;
public class DaireAlaniVeCevresiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r,alan,cevre,pi = 3.14;

        System.out.print("dairenin yaricapini giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2* pi * r;

        System.out.print("yaricapi girilen dairenin alani : " + alan);
        System.out.print("\nyaricapi girilen dairenin cevresi : " + cevre);
    }
}
