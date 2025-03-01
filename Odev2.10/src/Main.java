import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        

        System.out.println("Dizimizin orijinal hali: ");
        int[] sayilar = {52,43,67,42,87,12,23,48,6,0};
        System.out.println(Arrays.toString(sayilar));
        System.out.println("-------------------------");


        /*Arrays.copyOfRange() metodu bir dizinin elemanlarından kopyalanması istenen
         elemanların indeks aralığını belirterek yeni bir dizi kopyalamayı sağlar.*/
        System.out.println("Arrays.copyOfRange() metodu kullanarak dizimizin 2, 3 ve 4. indekslerindeki elemanlarından " +
                "oluşan yeni bir dizi oluşturalım.");
        int[] kopyaDizi = Arrays.copyOfRange(sayilar, 2, 5);
        System.out.println(Arrays.toString(kopyaDizi));
        System.out.println("-------------------------");

        //Arrays.equals() metodu iki dizinin elemanlarını karşılaştırır. Elemanları eşitse true, değilse false döner.
        int [] yeniDizi1 = {2,4,5,6,7,8,9,0};
        int[] yeniDizi2 = {52,43,67,42,87,12,23,48,6,0};
        System.out.println("Yeni 1. dizimiz: "+Arrays.toString(yeniDizi1));
        System.out.println("ilk dizimiz ile eşit mi? "+Arrays.equals(sayilar, yeniDizi1));
        System.out.println("");
        System.out.println("Yeni 2. dizimiz: "+Arrays.toString(yeniDizi2));
        System.out.println("2. dizimiz ile eşit mi? "+Arrays.equals(sayilar, yeniDizi2));
        System.out.println("-------------------------");

        //Arrays.sort() metodu dizi elemanlarını küçükten büyüğe doğru sıralar.
        System.out.println("Arrays.sort metodu kullanarak küçükten büyüğe sıralama yapıyoruz. ");
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("-------------------------");

        //Arrays.binarySearch() metodu sıralı bir dizide girdiğiniz sayının indeksini bulmanıza yarar.
        System.out.println("Arrays.binerySearch() metodu kullanarak sıralanmış olan dizimizde 48 sayımızın indeksini buluyoruz. ");
        int indeksBul = Arrays.binarySearch(sayilar, 48);
        System.out.println(indeksBul);
        System.out.println("-------------------------");

        /*Arrays.fill() metodu ister belirli indeks aralığındaki elemanları, ister dizinin tamamını belirlenen öğe ile
        doldurur*/
        System.out.println("Arrays.fill() metodu kullanarak ilk dizimizin 4, 5, ve 6. indeksindeki öğeleri 100 ile dolduralım");
        Arrays.fill(sayilar, 4,7,100);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("");
        System.out.println("Arays.fill() metodu kullanrak dizimizin tamamını 0 ile dolduralım");
        Arrays.fill(sayilar,0);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("-------------------------");

    }
    }
