public class C04_array {
    public static void main(String[] args) {

        // - Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        int [] arr= {4,5,6,7};
        int [] tersarr= {0,0,0,0};
        arrayterscevir(arr,tersarr);

    }

    public static void arrayterscevir(int []arr,int []tersarr){

        for (int i = 0; i < arr.length; i--) {

           tersarr [i]=arr[i]-1;

        }



        }
    }

