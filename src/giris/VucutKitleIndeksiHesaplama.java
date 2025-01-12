package giris;
import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kilo;
        double boy,index;

        System.out.print("Lütfen boyunuzu metre(m) cinsinden giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu kilogram(kg) cinsinden giriniz : ");
        kilo = input.nextInt();

        index = kilo / (boy * boy);
        System.out.print("Vucut Kitle Indeksiniz : " + index);
    }
}
