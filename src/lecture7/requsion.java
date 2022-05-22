package lecture7;

public class requsion {
    // factorial (3)= 3* factorial (2)
    // factorial (2) = 2 *factorial (1)
    // factorial (1) = factorial (0)
    // factorial (0) =1


    // factorial (3)= 3* 2 *1
    // factorial (2) = 2 *1
    // factorial (1) = 1
    // factorial (0) =1


    public static int  factorial (int n){

        if(n==0)return 1;
        else return n*factorial(n-1);
    }

    public static int  pow(int x , int power ){
        if (power ==1 ) return x;
        else return x* pow(x,power-1);

    }



    public static void main(String [] args){


        int temp = 3;
        System.out.println(pow (2,4));


    }


}
