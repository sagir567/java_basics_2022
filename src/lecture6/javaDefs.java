package lecture6;

import java.util.Arrays;

public class javaDefs {



        public static void arrSwapIndex(int[] arr , int i,int j){

            int temp = arr [i];
            arr[i]=arr[j];
            arr[j]=temp;

//            System.out.println(Arrays.toString(arr));
        }



        public static void allPrimeBefore(int n){
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }

        }



    public static boolean isPrime(int n){

        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
//        System.out.println(n +" is prime!!!");
        return true;
    }

public static void swap(int i,int j){
            int temp =i;
            i=j;
            j=i;


}

    public static void main (String [] args){
//        System.out.println(isPrime(9));


//        allPrimeBefore(1000000000);

        int [] arr = {1,3,45,5345,345,43,63,123,6547,8978,123,231};

        System.out.println(Arrays.toString(arr));

        arrSwapIndex(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int i = 10;
        int j = 15;

        System.out.println("before using- swap def :i= "+i+" and j = "  +j);
        swap(i,j);
        System.out.println("after using- swap def :i= "+i+" and j = "+j );


    }



}
