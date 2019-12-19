package lab_3;

import java.util.Scanner;

public class Exercise1_lab3 {
    //
    //
public static void main (String[]args){
    Scanner SC =new Scanner(System.in);
    System.out.print("Enter a real number x:");
    double x =SC .nextDouble();
    System.out.print("Enter a real number y:");
    double y=SC.nextDouble();

    //test condition
    if (x>y)
        System.out.println(x+"more than "+y);
    else
        System.out.println(y+"more than"+x);

}
}
