package lecture4;

public class charTOasci {
    char a;


    public static void main (String args[]){
        // 32 ---->256

        // דרך אחת לאתחל משתנה char היא פשוט להכניס לו char
        char a= 'a';
        // על מנת להדפיס את הערך האסקי המרנו אותו לתרגיל בכך שהוספנו 0 ולא שינינו את ערך האסקי דרך נוספת היא לאתחל משתנה חדש מסוג int ולהשוות אותו ל'a'"
        System.out.println(a+0);

        // דרך שניה לאתחל char היא להכניס לו ערך מספרי
        char b = 40;

        System.out.println( b);

        // לולאה שמדפיסה את הchar בהתאם לערך האסקי
        // במידה וערך האסקי זוגי הלולאה תדפיס את התו אחרת היא תדפיס את ערך האסקי
        for(int i=0;i<256;i++){

            char temp = (char) i;

            if(i%2==0){
                System.out.println(temp);
            }

            switch(i%2){

                case 0:
                    System.out.println(temp);
                    break;

                default:
                    System.out.println(i);

            }
        }





    }

}
