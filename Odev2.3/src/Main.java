import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Bir dizide bulunan pozitif ve negatif sayıların toplamını ayrı ayrı hesaplayan bir Java programı yazın.*/


        int[] sayilar = new int[5];
        sayilar[0] = -4;
        sayilar[1] = 7;
        sayilar[2] = -9;
        sayilar[3] = 5;
        sayilar[4] = 8;

        int pozitiftoplam = 0;
        int negatiftoplam = 0;

        for (int sayi: sayilar) {

            if (sayi > 0){
                pozitiftoplam+=sayi;

            }
            else {
                negatiftoplam+=sayi;

            }
        }

        System.out.println("Pozitif sayılar toplamı: "+pozitiftoplam);
        System.out.println("Negatif sayılar toplamı: "+negatiftoplam);

        }
    }
