package finalTestPreprations;

import java.util.Random;

public class Chapter_1 {
    /**
     generate 39 3 digits random numbers
      for each even number print the sum of his digits,
     print the average of all the generated numbers.
        X
     */
    public static void Q1(){
        double average = 0,sum=0;
        int current;
        Random random = new Random();
        for(int i=0;i<39;i++){
            current =(int)( Math.random()*(900)+100);
            sum+=current;
           System.out.println("the next random num is: "+current);
            if(current%2==0){
                double evenSum =0;
                for(int k=0;k<2;k++){
                    evenSum+= current%10;
                    current/=10;
                }
                evenSum+=current;
                System.out.println(evenSum+" is the sum of digits of the last even number");
            }
            System.out.println("creates new random num \n-----------------------------------\n\n\n");
        }
        average= sum/39;
        System.out.println("the average is : "+average);

    }


    /**
         in this Q we are going to create a method that will receive a 100 size arr who contains another arr in each slot.
     each iner arr contains two parameters that indicates the number of errors that clients had in the month
     the method will  print 3 answers
     1) if the amunt of error for evry clients is smaller in the second month compares to the first month.
     2) how many clients had more errors in the second month then the first month.
     3) the ID's of the clients that have the smallest difference between the second and the first month.
     */
    public static void Q2(int[][] clients){
        boolean improved = true;
        int min =Integer.MAX_VALUE, counter =0;
        String collection  = "the clients who had the smallest differences is";

        for (int i=0;i<clients.length;i++){
            int current = clients[i][2]-clients[i][1];
            if(current>0){
                improved =false;
            }
            if (current>=0){

                counter++;
                if(current<=min){
                    collection += Integer.toString(clients[i][0])+",";
                    if(current<min){
                        collection = "the clients who had the smallest differences is :";
                        collection+= Integer.toString(clients[i][0])+",";
                    }
                }
                System.out.println("all clients improved quality: "+improved);
                System.out.println(collection);
                System.out.println(counter+ "had more problems in the second month");

            }







        }



    }

    public static void main(String[] args){
            Q1();

    }

}
