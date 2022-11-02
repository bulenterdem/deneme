package ders01_calısma1;

import java.util.Scanner;

public class C05_foreach {
    public static void main(String[] args) {





        /*
        Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa "harf cumlede kullanilmamis" yazdirin.
         */

                cumledeHarfArama();

            }
            public static void cumledeHarfArama() {
                Scanner scan = new Scanner(System.in);

                System.out.println("Lutfen bir cumle giriniz : ");
                String cumle = scan.nextLine();
                System.out.print("Lutfen bir harf giriniz : ");
                String harf = scan.next();

                int sayac =0;

                String[] tumKarakterler= cumle.split("");

                for (String each: tumKarakterler
                ) {
                    if (each.equals(harf)){
                        sayac ++;

                    }

                }if (sayac==0){
                    System.out.println("Girdiginiz cumlede " + harf + " hic kullanilmaistir.");
                }else{
                    System.out.println("Girdiginiz cumlede " + harf + " toplam " +
                            sayac + " kere kullanilmistir.");
                }
            }

        }
