package giris;
import java.util.Scanner;
public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, total = 1;

        System.out.print("faktoriyelini alacaginiz sayiyi giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            total = total * i;
        }

        System.out.print(n + "! : " + total);
    }
}
