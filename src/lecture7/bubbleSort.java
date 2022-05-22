package lecture7;

import java.util.Arrays;

public class bubbleSort {

    public static void  swap( int i, int j , int[] arr ){

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;

    }


    public static void bubbleSort(int [] arr){

        boolean changed = true;

        for ( int i= 0; i<arr.length-1&& changed;i++){
            changed =false;
           for (int j=0;j<arr.length-1-i;j++){
               if(arr[j]>arr[j+1]){
                   swap(j,j+1,arr);
                   changed = true;
               }

            }


        }

    }




    public static void main (String [] args){
         int[] arr = {4,7,1,2,8,9,0,46,80};
         bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
