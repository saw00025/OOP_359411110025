package lab_3;

import java.util.Scanner;

public class loop3 {
    public static void main (String[]args){
        //whle : ใชกรณีที่ไม่ทราบจำนวนครั้งหรือรอบที่แน่นอน ให้โปรแกรมทำซ้ำไปเรื่อยจนกว่าจะเจอเงื่อนไขที่เป็นเท็จ
        Scanner SC =new Scanner(System.in);
        int x=1;

        while (x !=0) {
            System.out.print("Enter integer:");
            x = SC.nextInt();
        }
        System.out.println("Good bye.");
    }//main
}//class
