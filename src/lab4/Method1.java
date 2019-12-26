package lab4;

public class Method1 {
    public static void main(String[]args){
        System.out.println("Hello from Main method");
        //calling method
        A();
        System.out.println("Hello from Main method 2");
        A();
        A();
        B("saw");
        String myName =C("nudchanad","sensom");
        System.out.println(myName);
        System.out.println(C("nudchanad","sensom"));

    }

    //Method type 1: no parameter , no return value
    public static  void  A (){
        System.out.println("Hello From A method.");
    }
    //Method type2: 1 or more parameters,no return value
    public static void B(String msg){
        System.out.println("Hello A method."+msg);

    }
    public static String C(String fNam,String Lname){
        System.out.println("Hello form C method.");
        String myNane = fNam+" "+Lname;
        return myNane;

    }
}
