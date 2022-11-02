public class C02_whileloop {

    public static void main(String[] args) {
         // While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str="Java herzaman guzel";




        System.out.println(str.length()-1);
        System.out.println(str.charAt(0));
        System.out.println(stringiTerseCevir(str));


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




