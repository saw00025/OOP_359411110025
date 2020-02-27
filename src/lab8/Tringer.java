package lab8;

class Triangle extends GraphicObjec {
    private double width;
    private double height;

    public Triangle(double base, double height) {
        this.width = base;
        this.height = height;
    }

    @Override
    public void findArea() {
        double area = 0.5 * width* height;
        System.out.println("The area of Triangle with width  "+width+"and height ="+height+ "="+area);

    }
    //getter and setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
