package lecture3;

import java.util.Scanner;

public class loops {

    //find all prime numbers to given integer



    public static void main(String args[]){
        int n = 100;
        String res ="2,";
        String input = "java is a new coding method im learning ";
        boolean notprime =false;

        for(int i=3;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    notprime = true;
                }
            }
            if(!notprime){
                res+=Integer.toString(i);
                res+=",";

            }
            notprime=false;
        }
        System.out.println(res);

        boolean contains = false;

        int index = 0;
        while (contains!= true){
            // char =''
            //string ""
            if (input.charAt(index) == 'k'){
                contains = true;
            }
                index ++;
            if(index==input.length())break;
        }
        System.out.println(contains );
        System.out.println(index);



        int a=10;
        int b=17;
        int result =0;

        int p  =10;
        System.out.println(p++);

        for(int k=b;k>0;k--){
            result += a;
        }
        System.out.println(result);

        String output = "this is a nice workout";
        int len = output.length();
        System.out.println(output);
        for(int i=0;i<len;i++){
            if(output.charAt(i)==' ') System.out.print("\n");
            System.out.print(output.charAt(i));
        }



    }





}
