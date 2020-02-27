package lab8_2;

public class sheriff extends person{
    private String workState;

    public sheriff(String name, String dateOfBirth,String workState) {
        super(name, dateOfBirth);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I wore at "+this.workState);
    }
    //getter and setter

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }

    //toString


    @Override
    public String toString() {
        return "Sheriff{" +
                "workState='" + workState + '\'' +
                "} " + super.toString();
    }
}
