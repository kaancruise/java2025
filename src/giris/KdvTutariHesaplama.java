package giris;

import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args) {

        double para, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen paranızı giriniz: ");
        para = input.nextDouble();

        System.out.print("paranızın kdvsiz tutari: " + para + "\n");
        System.out.print("kdv orani: " + kdvOran + "\n");
        System.out.println("paranizin kdvli tutari: " + (para + (para * kdvOran)));
    }
}
