package giris;
import java.util.Scanner;
public class BurcBulmaProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month , day;

        System.out.print("Dogdunuz ayi giriniz : ");
        month = input.nextInt();

        System.out.print("\nDogdugunuz gunu giriniz : ");
        day = input.nextInt();

        if ((month > 0 && month <= 12) && (day > 0 && day <= 31)){

            switch (month){
                case 1:
                    if(day >= 21){
                        System.out.println("Kova burcu");
                    }
                    else{
                        System.out.println("Oglak burcu");
                    }
                    break;
                case 2:
                    if (day >= 20) {
                        System.out.println("Balik burcu");
                    }
                    else{
                        System.out.println("Kova burcu");
                    }
                    break;
                case 3:
                    if (day >= 21){
                        System.out.println("Koc burcu");
                    }
                    else{
                        System.out.println("Balik burcu");
                    }
                    break;
                case 4:
                    if (day >= 21){
                        System.out.println("Boga burcu");
                    }
                    else {
                        System.out.println("Balik burcu");
                    }
                    break;
                case 5:
                    if (day >= 21) {
                        System.out.println("Ikizler burcu");
                    }
                    else {
                        System.out.println("Boga burcu");
                    }
                    break;
                case 6:
                    if (day >= 22) {
                        System.out.println("Yengec burcu");
                    }
                    else {
                        System.out.println("Ikizler burcu");
                    }
                    break;
                case 7:
                    if (day >= 23){
                        System.out.println("Aslan burcu");
                    }
                    else {
                        System.out.println("Yengec burcu");
                    }
                    break;
                case 8:
                    if (day >= 24){
                        System.out.println("Basak burcu");
                    }
                    else {
                        System.out.println("Aslan burcu");
                    }
                    break;
                case 9:
                    if (day >= 24){
                        System.out.println("Terazi burcu");
                    }
                    else {
                        System.out.println("Basak burcu");
                    }
                    break;
                case 10:
                    if (day >= 24){
                        System.out.println("Akrep burcu");
                    }
                    else {
                        System.out.println("Terazi burcu");
                    }
                    break;
                case 11:
                     if (day >= 23) {
                         System.out.println("Yay burcu");
                     }
                     else {
                         System.out.println("Akrep burcu");
                     }
                     break;
                case 12:
                    if (day >= 22){
                        System.out.println("Oglak burcu");
                    }
                    else {
                        System.out.println("Yay burcu");
                    }
                    break;
                default:
                    System.out.println("Gecerli islemler yapiniz");
                    break;
            }
        }
        else {
            System.out.println("hatali ay veya gun girdiniz!");
        }
    }
}
