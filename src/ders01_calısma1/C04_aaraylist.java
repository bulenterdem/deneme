package ders01_calısma1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_aaraylist {
    public static void main(String[] args) {
        // Verilen pozitif bir n tamsayisini alarak, bize ilk n tane  Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);



        System.out.println("Lutfen bir tamsayi giriniz");

        int girilensayi = scan.nextInt();

        System.out.println(fibonacciListe(girilensayi));


    }

    public static double fibonacciListe(int girilenSayi) {

        List<Integer> fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi = 0;
        int index = 3; // ilk 3 eleman 0 1 1 oldugu icin 3.index'e geldik

        while (yeniFibonacciSayisi < girilenSayi) {

            yeniFibonacciSayisi = fibonacciListesi.get(index - 2) + fibonacciListesi.get(index - 1);

            if (yeniFibonacciSayisi < girilenSayi) {
                fibonacciListesi.add(yeniFibonacciSayisi);

            }
            index++;


        }
        System.out.println(fibonacciListesi);


        return girilenSayi;
    }

}
