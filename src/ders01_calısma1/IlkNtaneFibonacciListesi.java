package ders01_calısma1;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IlkNtaneFibonacciListesi {
    /*
    Verilen (kullanicidan) pozitif bir n tamsayisini alarak,
    -Bize ilk n tane Fibonacci sayisini bir list olarak donduren ve yazdiran bir method olusturun.
    0,1,1,2,3,5,8,13,21,34,55,89,144,233,....
     */

    public static void main(String[] args) {

        ilkNtaneFibonacciSayisi();

    }

    public static void ilkNtaneFibonacciSayisi(){

        Scanner scan = new Scanner(System.in);
        System.out.print("İlk kac tane Fibonacci sayisini yazdirmak istersiniz : ");
        int sayi = scan.nextInt();

        List<Integer> fibonacciListesi= new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi;
        int index = 2;

        while (index<sayi){

            yeniFibonacciSayisi= fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);
            fibonacciListesi.add(yeniFibonacciSayisi);

            index++;

        }

        System.out.println("Ilk " + sayi + " tane Fibonacci sayisi : " +
                "\n" + fibonacciListesi);

    }

}


