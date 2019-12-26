package lab4;

import java.util.Scanner;

public class Method2 {
    public static void  main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an number 1:");
        double x=sc.nextInt();
        System.out.print("Enter an number 2:");
        double y = sc.nextDouble();


        double Z= plus (x,y);
        System.out.println(x+"+"+y+"="+Z);

        double a = minus(x,y);
        System.out.println(x+"-"+y+"="+a);

        double b= times (x,y);
        System.out.println(x+"*"+y+"="+b);

        double c= devided (x,y);
        System.out.println(x+"/"+y+"="+c);
    }

    private static double devided(double x, double y) {
        return x / y;
    }

    private static double times(double x, double y) {
        return x * y;
    }
            private static double minus(double x, double y) {
                return  x-y;
    }
    private static double plus(double x, double y) {
        return x + y;
    }
}
