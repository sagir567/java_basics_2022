package lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class nestedLoop {

    // "nested for loop" is a condition where we put another for loop inside the braces of a existed for loop


    //Q1) write a methood who gets an binary arrays (1 or 0) and returns a new sorted array where all the 0 are at the first index's
    // Q2) using nested for loop create a method who multiply to given integer


    public static void main(String args[]){


        int current=0;

//       for(int i=0;i<32;i++){
//
//            for(int j=0;j<32;j++){
//                current ++;
//            }
//
//
//        }
//        System.out.println(current);



        // first opportunity;
        int[] arr = {0,1,0,0,0,1,1,0,1,1,1,0};
        int [] res = new int [arr.length];
        int counter = 0;


//        for(int i =0;i<arr.length;i++){
//            if(arr[i]==0)counter++;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(i<6) {
//                res[i] = 0;
//            }
//            else{
//                res[i]=1;
//            }
//        }
//        System.out.println(Arrays.toString(res));

        // better opportunity

//        int index =arr.length-1;
//        for(int i = 0;i<arr.length;i++){
//           if(arr[i]==1){
//               res[index]=1;
//               index --;
//           }
//        }
//        System.out.println(Arrays.toString(res));

        int a = 12;
        int b= 22;
        int temp = 0;
        int result=0;


        for (int i =0; i<a;i++){


            for (int j=0;j<b;j++){
                temp++;
            }
            result+=temp;
            temp=0;


        }

        System.out.println(result);


    }








}
