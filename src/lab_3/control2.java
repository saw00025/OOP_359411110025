package lab_3;

import java.util.Scanner;

public class control2 {

    public static void main (String[]args){
        //if-else :
        // if-else
//        if(){
//            if;
//        }else {
//            if;
//        }
        int x=10;
        if (x/2>5){
            System.out.println("x more than 5.");
        }else {
            System.out.println("x less than 5.");
        }
        //Are Old or young? >50==old,<50==young
        Scanner SC =new Scanner(System.in);
        int age =SC.nextInt();
        //test condition
        if (age>50){
            System.out.println("You are old");
        }else {
            System.out.println("You are young");
        }
    }//main


}

