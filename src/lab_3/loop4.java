package lab_3;

import java.util.Scanner;

public class loop4 {
    public static void main(String[]args){
        //do-while: ใช้ในกรณีที่ไม่ทราบจำนวนครั้งหรือแน่นอน
        Scanner SC =new Scanner(System.in);
        int x =1;
        do {
            System.out.print("Enter integer:");
            x=SC.nextInt();
        }while (x!=0);
        System.out.println("Good bye.");
    }
}
