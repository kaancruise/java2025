package giris;
import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minTutar = 20, acilisTutar = 10;
        double km,toplamTutar;

        System.out.print("gidilecek km giriniz: ");
        km = input.nextDouble();

        toplamTutar = (km * 2.20) + acilisTutar;

        if (toplamTutar <= minTutar) {
            toplamTutar = minTutar + acilisTutar;
            System.out.print("toplam tutar : " + toplamTutar);
        }
        else {
            System.out.println("toplam tutar : " + toplamTutar);
        }
    }
}
