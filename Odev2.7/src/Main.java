import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    /*Bir ArrayList<String> içerisine 5 farklı şehir ekleyin.
	•	Kullanıcıdan alınan bir şehrin listede olup olmadığını bulan bir Java programı yazın.
	•	Eğer şehir listede varsa, indeksini yazdırın*/

        Scanner kullaniciSehir = new Scanner(System.in);
        ArrayList<String> Sehirler = new ArrayList<>();
        Sehirler.add("konya");
        Sehirler.add("osmaniye");
        Sehirler.add("eskisehir");
        Sehirler.add("trabzon");
        Sehirler.add("edirne");

        System.out.println("Hepsi küçük olacak şekilde, Türkiye'den bir şehir giriniz: ");
        for (int i = 0; i < 80; i++) {

            String sehir = kullaniciSehir.nextLine();
            if (Sehirler.contains(sehir)) {
                System.out.println(sehir + " şehri listede mevcut.");
                System.out.println("index[" + Sehirler.indexOf(sehir)+"]");
            } else {
                System.out.println(sehir + " şehri listede mevcut değil. Tekrar deneyiniz");
            }
        }


        }
    }
