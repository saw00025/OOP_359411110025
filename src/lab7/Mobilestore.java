package lab7;

public class Mobilestore {
    public static void main(String[] args) {
        Mobile m1=new Mobile("1001","wiko","Sunny 4plus",2090.00,"Android 9 Go");
        System.out.println(m1.toString());
        //change price
        m1.setPrice(1500.00);
        System.out.println(m1.toString());

    }
}
