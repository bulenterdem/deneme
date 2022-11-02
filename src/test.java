import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        // parametre olarak bir String kabul edip
        // String'in terse cevrilmis halini döndüren   bir method olusturun

        {
            System.out.println( "lütfen ters cevrilecek metni giriniz");
            Scanner scan=new Scanner(System.in);
            String input=scan.nextLine();
            System.out.println(stringiTerseCevir(input));
        }



        }
    public static String stringiTerseCevir(String input){
        String tersStr="";
        int uzun=input.length();
        while (uzun!=0){
            tersStr= tersStr+input.substring(uzun-1,uzun);
            uzun--;
        }
        return tersStr;



        }

        }











