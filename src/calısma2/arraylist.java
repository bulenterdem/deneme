package calısma2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {

        List<Integer>tamsayiliste=new ArrayList<>();


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir pozitif tam sayi giriniz");

        int girilensayi=scan.nextInt();

        for (int i = 1; i <= girilensayi; i++)



        if (girilensayi%i==0){

            tamsayiliste.add(i);


            System.out.println(tamsayiliste);



        }

    }

    }

