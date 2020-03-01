package lab9;

public class student {

    //attributed
    private int sid;
    private String nama;
    private String major;
    private  double gpa;
    //contructor

    public student(int sid, String nama, String major, double gpa) {
        this.sid = sid;
        this.nama = nama;
        this.major = major;
        this.gpa = gpa;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
