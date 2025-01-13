package giris;
import java.util.Scanner;
public class HavayaGoreEtkinlikOnerme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int havaDurumu;

        System.out.print("bulundugunuz bolgedeki hava durumunu giriniz: ");
        havaDurumu = input.nextInt();

        if (havaDurumu > -50 && havaDurumu < 70) {
            if (havaDurumu <= 5) {
                System.out.println("Kayak yapmaya gidebilirsiniz");
            } else if (havaDurumu > 5 && havaDurumu < 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            } else if (havaDurumu >= 15 && havaDurumu <= 25) {
                System.out.println("Piknige gidebilirsiniz");
            } else {
                System.out.println("Yuzmeye gidebilirsiniz");
            }
        } else {
            System.out.println("lutfen gecerli bir hava durumu giriniz!");
        }
    }
}
