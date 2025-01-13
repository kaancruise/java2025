package giris;
import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km, yas ,yolculukTipi;
        double biletTutar, yasIndirimi,gidisDonusIndirimi;

        System.out.print("Lutfen yasinizi giriniz : ");
        yas = input.nextInt();

        System.out.print("\nLutfen gidiceginiz kmyi giriniz : ");
        km = input.nextInt();

        System.out.print("\nLutfen biletiniz sadece gidis ise (1) tuslayiniz, Gidis-Donus ise (2) tuslayiniz");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            if (yas < 12){

                if (yolculukTipi == 1) {
                    yasIndirimi = (km * 0.10) / 2;
                    biletTutar = (km * 0.10) - yasIndirimi;
                    System.out.print("bilet icin toplam tutar : " + biletTutar);
                }
                else {
                    gidisDonusIndirimi = (km * 0.10) / 5;
                    yasIndirimi = (km * 0.10) / 2;
                    biletTutar = (km * 0.10) - (yasIndirimi + gidisDonusIndirimi) ;
                    System.out.print("bilet icin toplam tutar : " + biletTutar);
                }

            }
            else if (yas >= 12 && yas < 24) {

                if (yolculukTipi == 1){
                    yasIndirimi = (km * 0.10) / 10;
                    biletTutar = (km * 0.10) - yasIndirimi;
                    System.out.print("bilet icin toplam tutar : " + biletTutar);
                }
                else {
                    gidisDonusIndirimi = (km * 0.10) / 5;
                    yasIndirimi = (km * 0.10) / 10;
                    biletTutar = (km * 0.10) - (yasIndirimi + gidisDonusIndirimi);
                    System.out.print("bilet icin toplam tutar : " + biletTutar);

                }
            }
            else if(yas >65){

                if (yolculukTipi == 1){
                    yasIndirimi = (km * 0.10) / 5;
                    biletTutar = (km * 0.10) - yasIndirimi;
                    System.out.print("bilet icin toplam tutar : " + biletTutar);
                }
                else {
                    gidisDonusIndirimi = (km * 0.10) / 5;
                    yasIndirimi = (km * 0.10) / 5;
                    biletTutar = (km * 0.10) - (yasIndirimi + gidisDonusIndirimi);
                    System.out.print("bilet icin toplam tutar : " + biletTutar);
                }
            }
            else {

               if (yolculukTipi == 1){
                   biletTutar = km * 0.10;
                   System.out.print("bilet icin toplam tutar : " + biletTutar);
               }
               else {
                   gidisDonusIndirimi = (km * 0.10) / 5;
                   biletTutar = (km * 0.10) - gidisDonusIndirimi;
                   System.out.print("bilet icin toplam tutar : " + biletTutar);
               }
            }
        }
        else {
            System.out.println("Lutfen gecerli degerler giriniz.");
        }
    }
}
