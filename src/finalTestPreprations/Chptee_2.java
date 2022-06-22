package finalTestPreprations;

public class Chptee_2 {
    /**
   right rotation will take the rightest char  in a String and push it from the left.
     String .length will return the amount of chars of the string(starts from 1)

     String.charAt will return the char in a spcific index on the String , (starts from 0)

     the "==" chack if the memory adrreses is the same for two veriables

     the def .equals chak the String itself
     */

    public static String rightRotation(String s){
        char current = s.charAt(s.length()-1);
        s=s.substring(0,s.length()-1);
        return current+s;
    }

    public static boolean isRollingK(String s1,String s2, int k){

        for(int i=0;i<k;i++){
            s2=rightRotation(s2);
        }

        return s2.equals(s1);

    }
    public static  int whichKtoRoll(String s1,String s2){
        if (s1.length()!=s2.length())return -1;

        for(int i=0;i<s1.length()-1;i++){
            if(isRollingK(s1,s2,i)==true){
                return i;
            }
        }
        return -1;

    }



    public static void main(String[] args){
      String s1 ="acbbb";
      String s2="bcbba";
        System.out.println(s1.substring(2));

//        System.out.println(whichKtoRoll(s1,s2));

    }







}
