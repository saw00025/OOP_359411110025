package lab9;

public class casestudy {
    //
    private int id;
    private String brabd;
    private String gen;
    private double price;
    private String version;

    public casestudy(int id, String brabd, String gen, double price, String version) {
        this.id = id;
        this.brabd = brabd;
        this.gen = gen;
        this.price = price;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrabd() {
        return brabd;
    }

    public void setBrabd(String brabd) {
        this.brabd = brabd;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
