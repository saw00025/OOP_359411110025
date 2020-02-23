package lab8;

public class Person {
    //Attributes
    private String pid;
    private String name;
    private String dateOFBirth;
    //constructor

    public Person(String pid, String name, String dateOFBirth) {
        this.pid = pid;
        this.name = name;
        this.dateOFBirth = dateOFBirth;

    }
    //getter and setter

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }
    //tosting

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", dateOFBirth='" + dateOFBirth + '\'' +
                '}';
    }
}

