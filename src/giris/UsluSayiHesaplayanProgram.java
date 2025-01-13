package giris;
import java.util.Scanner;
public class UsluSayiHesaplayanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b, result = 1;
        System.out.print("üs alınacak sayiyi girin : ");
        a = input.nextInt();

        System.out.print("üs sayiyi yazin : ");
        b = input.nextInt();

        for (int i = 0; i < b; i++){

            result *= a;
        }

        System.out.println(a + "^" + b + ":" + result);
    }
}
