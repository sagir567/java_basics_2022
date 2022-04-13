package lecture4;

import java.util.Scanner;

public class switchCase {

    public static void main(String args[]) {

        // סקאנר הינו אובייקט שמאפשר לנו לקרוא ערכים מהמשתמש בהתאם להגדרתו
        // ראשית אני יוצרים את האובייקט
        // לאחר מכן ניתן לאתחל משתנים באמצעות הפקודה name.next כפי שנראה בדוגמא למטה
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 1  for power\nenter 2 for sum \nand 3 for divide");
//        int num = sc.nextInt();
//        double current = sc.nextDouble();

        // מערך של ציונים
        // מערך הינו מבנה נתונים המאפשר לנו לאחסן מידע בצורה ליניארית כאשר לכל תא יש אינדקס אליו נוכל לגשת באופן ספציפי
        int[] grades = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("please give me the next grade");
            grades[i] = sc.nextInt();
        }
            // לולאת for Each
        // קיימת במספר שפות תכנות , נותנת לנו את האפשרות לעבור בצורה לינארית על כל הערכים הקיימים במאגר מסויים
        for (int grade : grades) {


            //  גאם יש תוכן בתוך הcase
            // נצתרך להוסיף בסוף שורת break
            // נוכל להגדיר קייס דיפולטיבי למקרה ואף אחד מהקייסים לא התאים אותו נוסיף בסוף ונקרא default
            switch (grade/10) {

                case 10:
                    System.out.println("perfect ");
                    break;

                case 9:
                    System.out.println("very good ");
                    break;


                case 8:
                    System.out.println("good ");
                    break;


                case 7:
                    System.out.println("good enough  ");
                    break;



                case 6:
                    System.out.println("not  enough ");
                    break;


                default:
                    System.out.println(" you have failed in the test");
            }
        }

    }
}
