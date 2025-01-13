package giris;
import jdk.jshell.Snippet;

import java.util.Scanner;
public class TekSayilarinToplaminiBulanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1, sum = 0;

        while(i > 0){
            System.out.print("sayi giriniz:");
            i = input.nextInt();

            if(i % 2 != 0 && i > 0){
                sum += i;
            }
        }
        System.out.print("tek sayilarin toplami : " + sum);
    }
}
