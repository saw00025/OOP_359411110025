package lab8_2;

public class pofice extends person{
    public String workCountry;


    public pofice(String name, String dateOfBirth,String workCountry) {
        super(name, dateOfBirth);
        this.workCountry = workCountry;


    }
    public void introduce(){
        super.introduce();
        System.out.println("I wore at "+this.workCountry);
    }
    //getter and setter

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }

    //toString

    @Override
    public String toString() {
        return "poficee{" +
                "workCountry='" + workCountry + '\'' +
                "} " + super.toString();
    }
}
