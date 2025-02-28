import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        /*Bir ArrayList<Integer> oluşturun ve içine rastgele 20 sayı ekleyin.
	•	Sadece çift sayıları ayrı bir listeye ekleyin ve yazdırın.*/

        ArrayList<Integer> sayilar = new ArrayList<>();
        Random random = new Random();

        // 20 adet rastgele sayı ekleme
        for (int i = 0; i < 20; i++) {
            int rastgeleSayi = random.nextInt(100); // 0 ile 99 arasında rastgele sayı üretir
            sayilar.add(rastgeleSayi);

        }
        System.out.println("Rastgele oluşturulan sayılar: " + sayilar);
int ciftSayi;
        System.out.println("Çift oluşturulan sayılar:");
for (int sayi : sayilar) {

    if (sayi % 2 == 0) {
        ciftSayi = sayi ;
        System.out.println(ciftSayi);
    }
}


    }
    }
