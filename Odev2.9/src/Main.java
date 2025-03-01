import java.sql.SQLOutput;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /* Java’daki ArrayList metodlarını araştırın ve her biri için ne işe yaradığını, nasıl kullanıldığını ve örnek kod yazın:
	•	get()
	•	set()
	•	remove()
	•	clear()
	•	size()
*/

        ArrayList<String> Kelimeler = new ArrayList<>();
        Kelimeler.add("İstanbul");
        Kelimeler.add("Sivas");
        Kelimeler.add("Bursa");
        Kelimeler.add("Trabzon");
        Kelimeler.add("Antalya");
        System.out.println("Listedeki kelimeler :"+Kelimeler);
        System.out.println("---------------------------");

        // get() metodu ArrrayList içerisindeki indeksini yazdığımız değeri döndürür.
        System.out.println("get() metodunu kullanarak 3. indeksteki şehrimizi çağırıyoruz.");
        String getMetodu = Kelimeler.get(3);
        System.out.println(getMetodu);
        System.out.println("---------------------------");

        // set() metodu belirli bir indeksteki değeri başka bir değerle değiştirmeyi sağlar.
        System.out.println("set() metodunu kullanarak Bursa şehrini Kastamonu şehri ile değiştiriyoruz.");
        Kelimeler.set(2, "Kastamonu");
        System.out.println(Kelimeler);
        System.out.println("---------------------------");

        //remove() metodu değerin indeksini veya değerin kendisini kullanarak listeden kaldırır.
        System.out.println("remove() metodu kullanarak Trabzon şehrini kaldırıyoruz.");
        Kelimeler.remove(3); //Kelimeler.remove("Trabzon"); olarak da kullanılabilir.
        System.out.println(Kelimeler);
        System.out.println("---------------------------");

        //size() metodu listenin kaç değerden oluştuğunu gösterir.
        System.out.println("size() metodu kullanarak listemizde kaç tane değer olduğunu görüyoruz.");
        int degerSayisi = Kelimeler.size();
        System.out.println(degerSayisi);
        System.out.println("---------------------------");


        //clear() metodu listedeki bütün elemanları siler.
        System.out.println("clear() metodu kullanarak listedeki bütün elemanları siliyoruz.");
        Kelimeler.clear();
        System.out.println(Kelimeler);
        System.out.println("---------------------------");





    }
    }
