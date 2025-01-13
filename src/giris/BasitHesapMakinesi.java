package giris;
import java.util.Scanner;
public class BasitHesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select,a,b;
        System.out.print("islem yapacaginiz ilk sayiyi giriniz:");
        a = input.nextInt();
        System.out.print("\nislem yapacaginiz ikinci sayiyi giriniz:");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapacaginiz islemi seciniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("girdiniz sayilarin toplami : " + (a + b));
                break;
            case 2:
                System.out.println("girdiginiz sayilarin farki : " + (a - b));
                break;
            case 3:
                System.out.println("girdiginiz sayilarin carpimi : " + (a * b));
                break;
            case 4 :
                System.out.println("girdiginiz sayilarin bolumu : " + (a / b));
                break;
            default:
                System.out.println("hatali tuslama yaptiniz.");
                break;
        }


    }
}
