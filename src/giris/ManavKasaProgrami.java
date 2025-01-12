package giris;

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kg, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, armutTutar, elmaTutar, domatesTutar,
                muzTutar, patlicanTutar, toplamTutar;

        System.out.println("armut kaç kg : ");
        armutKg = input.nextDouble();
        System.out.println("elma kaç kg : ");
        elmaKg = input.nextDouble();
        System.out.println("domates kaç kg : ");
        domatesKg = input.nextDouble();
        System.out.println("muz kaç kg : ");
        muzKg = input.nextDouble();
        System.out.println("patlican kaç kg : ");
        patlicanKg = input.nextDouble();

        armutTutar = armutKg * armut;
        elmaTutar = elmaKg * elma;
        domatesTutar = domatesKg * domates;
        muzTutar = muzKg * muz;
        patlicanTutar = patlicanKg * patlican;
        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.print("armut tutar : " +  armutTutar);
        System.out.print("\nelma tutar : " +  elmaTutar);
        System.out.print("\ndomates tutar : " +  domatesTutar);
        System.out.print("\nmuz tutar : " +  muzTutar);
        System.out.print("\npatlican tutar : " +  patlicanTutar);
        System.out.print("\ntoplam tutar : " +  toplamTutar);

    }
}
