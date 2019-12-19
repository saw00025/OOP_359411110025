package lab_3;

public class loop1 {
    public static void main(String[] args) {
        //forใช้ในกรณีที่ทราบจำนวนรอบหรือจำครั้งที่ซ้ำ


        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            if ((i+1)%2==0)
                System.out.println("2");
            else
                System.out.println();
        }

    }
}