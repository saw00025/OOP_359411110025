package lab_3;

import java.util.Scanner;

public class control3 {
    public  static void main (String[]args) {
        //if-else-if :
        //if-else-if

//            if (1) {
//                 1;
//    } else if (2){
//            2;
//
//        }else  if (3){
//            3;
//        }else if(n){
//            n;
//        }else {
//            ;
//        }
        //How old are? >50==old,>20==teenager, 20==young

        Scanner SC = new Scanner(System.in);
        System.out.print("How are old  ");
        int are =SC.nextInt();
        //test condition
        if (are>50) {
            System.out.println("you are old .");
        }else if (are>20) {
            System.out.println("you are teenager.");
        }else {
            System.out.println("you are young .");

        }
    }
    }

