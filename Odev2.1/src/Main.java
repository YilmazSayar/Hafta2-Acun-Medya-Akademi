import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] Sayilar = new int[10];

        for (int i = 0; i < Sayilar.length; i++) {
            System.out.println( (i+1) +". Sayıyı giriniz: ");
            Sayilar[i] = scanner.nextInt();

        }

        int Toplam = 0;

        for (int toplanacakSayi:Sayilar){
            Toplam+=toplanacakSayi;

        }
        double ortalama = (double) Toplam / Sayilar.length;
        System.out.println("Ortalama: "+ortalama);
        System.out.println("50 den büyük sayılar: ");

        for (int büyükSayi:Sayilar) {
            if (büyükSayi>50){

                System.out.println(büyükSayi);

            }


        }











    }
    }
