package giris;
import java.util.Scanner;
public class BasitKullaniciAdiSifreKontrolu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password,answer;

        System.out.print("Lutfen kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("\nLutfen sifresinizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("icardi99") && password.equals("gs1905")) {
            System.out.println("Basariyla giris yaptiniz!");
        }
        else {
            System.out.println("Girdiginiz degerler hatalidir!");
            System.out.print("Sifrenizi sıfırlamak ister misiniz: ");
            answer = input.nextLine();

            if (answer.equals("evet")) {
                System.out.print("\nyeni sifrenizi giriniz : ");
                password = input.nextLine();
                System.out.println("sifreniz basariyla degistirildi!");
            }
            else {
                System.out.println("Tekrardan giris kismina yonlendiriliyorsunuz!");
            }
        }
    }
}
