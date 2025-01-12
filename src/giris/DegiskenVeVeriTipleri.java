package giris;

public class DegiskenVeVeriTipleri {
    public static void main(String[] args) {

        int numberOne = 10;
        numberOne = 5;
        int numberTwo = 20;
        int numberThree;
        numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        //dikdörtgen çevresi hesaplama:

        int kisaKenar = 10, uzunKenar = 20, cevre;
        cevre = 2*kisaKenar + 2*uzunKenar;
        System.out.println(cevre);

        //byte,short,int,long

        byte vByte = 101;
        System.out.println(vByte);

        short vShort = 1000;
        System.out.println(vShort);

        int vInt = 10000;
        System.out.println(vInt);

        long vLong = 1000000000;
        System.out.println(vLong);

        //float ve double:

        float vFloat = 1.2f;
        System.out.println(vFloat);

        double vDouble = 3.212312312124;
        System.out.println(vDouble);

        //char ve boolean:

        char vChar = 'a';
        System.out.println(vChar);

        char vChar2 = 98;     //ASCII tablosu
        System.out.println(vChar2);

        char vChar3 = 'j';
        char vChar4 = 'a';
        char vChar5 = 'v';
        char vChar6 = 'a';

        System.out.println(vChar3 + vChar4 + vChar5 + vChar6); //ASCII tablosuna göre değerlerini toplar
        System.out.println("" + vChar3 + vChar4 + vChar5 + vChar6);  //kelimeleri birleştirir bu şekilde


        //boolean:

        boolean vBool = true;
        boolean vBool2 = false;

        System.out.println(vBool);
        System.out.println(vBool2);

        //String

        String vString = "Mauro Icardi";
        System.out.println(vString);
    }
}
