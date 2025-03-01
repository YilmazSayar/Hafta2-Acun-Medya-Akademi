import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*Kullanıcıdan 10 adet kelime alarak bir ArrayList<String> içine ekleyin.
        Girilen kelimeleri alfabetik sıraya göre sıralayan bir Java programı yazın.
         */

        Scanner kullanicikelimeler = new Scanner(System.in);

        ArrayList<String> kelimeler = new ArrayList<>();
        System.out.println("10 adet kelime giriniz: ");
        for (int i = 0; i < 10; i++) {
        String giris = kullanicikelimeler.nextLine();
            kelimeler.add(giris);
        }

        Collections.sort(kelimeler);

        System.out.println("Alfabetik sıralanmış kelimeler: ");

        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }





    }
    }
