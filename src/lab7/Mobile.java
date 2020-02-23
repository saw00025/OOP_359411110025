package lab7;

public class Mobile {
    //Attributes
    private String id;
    private String brand;
    private String Model;
    private double price;
    private String os;
    //constructor


    public Mobile(String id, String brand, String model, double price, String os) {
        this.id = id;
        this.brand = brand;
        Model = model;
        this.price = price;
        this.os = os;
    }
    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", Model='" + Model + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                '}';
    }
}


