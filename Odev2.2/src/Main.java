import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
       /* Bir dizide tekrar eden elemanları bulan bir program yazın.
       (Örnek giriş: [5, 3, 8, 3, 1, 5, 8] → Çıktı: Tekrar eden sayılar: 3, 5, 8)
        */

    int[] sayilar = new int[10];
   sayilar[0] = 1;
   sayilar[1] = 6;
   sayilar[2] = 4;
   sayilar[3] = 5;
   sayilar[4] = 2;
   sayilar[5] = 1;
   sayilar[6] = 5;
   sayilar[7] = 1;
   sayilar[8] = 23;
   sayilar[9] = 4;

        System.out.println("Tekrar eden sayılar: ");

        HashSet<Integer> ilkSayilar = new HashSet<>();
        HashSet<Integer> tekrarSayilar = new HashSet<>();

        for (int i = 0; i < sayilar.length; i++) {
            if (!ilkSayilar.add(sayilar[i])) {

                tekrarSayilar.add(sayilar[i]);

            }
        }

        for (int sayi:tekrarSayilar) {
            System.out.println(sayi);
        }

    }

    }

