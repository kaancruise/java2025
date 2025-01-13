package giris;
import java.util.Scanner;
public class SinifGecmeDurumu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, biyoloji;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("\nFizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("\nTurkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("\nKimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("\nBiyoloji notunuzu giriniz: ");
        biyoloji = input.nextInt();

        double average;
        average = (mat + turkce + fizik + kimya + biyoloji) / 5;

        if (average > 55) {
            System.out.println("Sinifi basariyla gectiniz!" + average);
        }
        else {
            System.out.println("Sinifta kaldiniz!" + average);
        }
    }
}
