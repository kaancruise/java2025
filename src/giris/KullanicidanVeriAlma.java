package giris;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("a sayisini giriniz:");
        a = input.nextInt();

        System.out.println("a: " + a);

        double b;

        System.out.print("b sayisini giriniz:");
        b = input.nextDouble();

        System.out.println("b:" + b);

        String str;
        System.out.print("str giriniz:");
        str = input.nextLine();

        System.out.println("str:" + str);
    }
}
