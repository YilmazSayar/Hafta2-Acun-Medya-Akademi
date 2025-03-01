import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(15);
        sayilar.add(54);
        sayilar.add(23);
        sayilar.add(12);
        sayilar.add(22);

        int enBuyuk = Collections.max(sayilar);
        System.out.println("Listenin en büyük sayısı: "+enBuyuk);


        int enKucuk = Collections.min(sayilar);
        System.out.println("Listenin en küçük sayısı: "+enKucuk);







    }
}