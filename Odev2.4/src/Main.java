import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sayilar = new Scanner(System.in);
        ArrayList<Integer> sayilarList = new ArrayList<>();
        System.out.println("10 adet tam sayı giriniz: ");
        for (int i = 0; i < 10; i++) {
            int sayi = sayilar.nextInt();
            sayilarList.add(sayi);
        }

        System.out.println("Sayılar: "+sayilarList);
        Collections.sort(sayilarList);
        Collections.reverse(sayilarList);
        System.out.println("Büyükten küçüğe sıralanmış: "+sayilarList);




    }
}