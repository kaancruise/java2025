package giris;
import java.util.Scanner;
public class MinVeMaksDegerBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,sayi, enBuyuk = 0, enKucuk = 0;

        System.out.print("Ne kadar sayi gireceksiniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.println("Sayi giriniz : ");
            sayi = input.nextInt();

            if(i == 1){
                enBuyuk = sayi;
                enKucuk = sayi;
            }

            if(sayi > enBuyuk){
                enBuyuk = sayi;
            }

            if (sayi < enKucuk){
                enKucuk = sayi;
            }


        }
        System.out.println("En buyuk sayi : " + enBuyuk);
        System.out.println("En kucuk sayi : " + enKucuk);
    }
}
