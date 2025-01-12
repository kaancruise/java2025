package giris;

import  java.util.Scanner;
public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, tarih, muzik;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("mat puanı giriniz: ");
        mat = input.nextInt();

        System.out.print("fizik puanı giriniz: ");
        fizik = input.nextInt();

        System.out.print("tarih puanı giriniz: ");
        tarih = input.nextInt();

        System.out.print("muzik puanı giriniz: ");
        muzik = input.nextInt();

        System.out.print("kimya puanı giriniz: ");
        kimya = input.nextInt();

        System.out.print("turkce puanı giriniz: ");
        turkce = input.nextInt();

        ort = (mat + fizik + tarih + muzik + kimya + turkce) / 6.0;
        System.out.println("ortalamanız: " + ort);

    }
}
