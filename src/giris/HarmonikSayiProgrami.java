package giris;
import java.util.Scanner;
public class HarmonikSayiProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        double result = 0;
        System.out.print("harmonik sayisini ogrenmek istediginiz sayiyi giriniz: ");
        n = input.nextInt();


        for(double i = 1; i <= n; i++){

            result += 1 / i;
        }

        System.out.print("Sonuc : " + result) ;
    }
}
