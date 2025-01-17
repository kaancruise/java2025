package giris;
import java.util.Scanner;
public class EbobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N1 sayisini giriniz : ");
        int n1 = input.nextInt();
        System.out.print("N2 sayisini giriniz : ");
        int n2 = input.nextInt();
        int ebob,ekok;

        for(int i = n1; i >= 1; i--){

            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println("EBOB : " + ebob);
                break;
            }
        }

        //ekok  = (n1 * n2) / ebob aslinda ama döngüyle tekrar yapalim.

        for (int k = 1; k <= (n1 * n2); k++){

            if(k % n1 == 0 && k % n2 == 0){
                ekok = k;
                System.out.println("EKOK : " + ekok);
                break;
            }
        }
    }
}
