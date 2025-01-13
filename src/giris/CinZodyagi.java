package giris;
import java.util.Scanner;
public class CinZodyagi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogumYili, kalan;

        System.out.print("Lutfen dogum yilinizi giriniz : ");
        dogumYili = input.nextInt();

        if (dogumYili <= 0 || dogumYili > 2025){
            System.out.println("lutfen gecerli bir dogum yili giriniz!");
        }
        else {

            kalan = dogumYili % 12;

            switch (kalan){

                case 0:
                    System.out.println("MAYMUN");
                    break;
                case 1:
                    System.out.println("HOROZ");
                    break;
                case 2:
                    System.out.println("KOPEK");
                    break;
                case 3:
                    System.out.println("DOMUZ");
                    break;
                case 4:
                    System.out.println("FARE");
                    break;
                case 5:
                    System.out.println("OKUZ");
                    break;
                case 6:
                    System.out.println("KAPLAN");
                    break;
                case 7:
                    System.out.println("TAVSAN");
                    break;
                case 8:
                    System.out.println("EJDERHA");
                    break;
                case 9:
                    System.out.println("YILAN");
                    break;
                case 10:
                    System.out.println("AT");
                    break;
                case 11:
                    System.out.println("KOYUN");
                    break;
                default:
                    System.out.println("!!!!!!!");
                    break;
            }
        }



    }
}
