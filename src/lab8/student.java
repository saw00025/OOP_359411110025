package lab8;

public class student extends  Person {
    private String sid;
    private String program;

    public student(String pid, String name, String dateOFBirth, String sid, String program) {
        super(pid, name, dateOFBirth);
        this.sid = sid;
        this.program = program;
    }
    //tosting

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }
}
