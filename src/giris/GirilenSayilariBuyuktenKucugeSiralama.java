package giris;
import java.util.Scanner;
public class GirilenSayilariBuyuktenKucugeSiralama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("1. sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("\n2.sayiyi giriniz : ");
        b = input.nextInt();
        System.out.print("\n3.sayiyi giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("siralama : a > b > c");
            }
            else {
                System.out.println("siralama : a > c > b");
            }
        }
        else if((b > a) && (b > c)){
            if (a > c){
                System.out.println("siralama : b > a > c");
            }
            else {
                System.out.println("siralama : b > c > a");
            }
        }
        else {
            if (a > b){
                System.out.println("siralama : c > a > b");
            }
            else {
                System.out.println("siralama : c > b > a");
            }
        }
    }
}
