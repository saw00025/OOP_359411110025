package lab8;

public class PersonApp {
    public static void main(String[] args) {
        //create objects
        Person P1 = new Person("1111111111111",
                "Nudchanad Sansom",
                "09/09/1997");
        System.out.println(P1.toString());

        student S1 = new student("2222222222222",
                "Montira Kliengtapong",
                "15/03/1997",
                "STD025", "Information System");

        //S1.();
        //S1.addSubject();
        //P1.addSubject();
        // object ของ super-class ไม่สามารถเรียกใช้ method ของ sub-class
    }
}


