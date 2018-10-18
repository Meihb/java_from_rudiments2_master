package ObjectOrientation.AbstractClass;

abstract public class Shape {
    private String color;

    {
        System.out.println("执行Shape初始化块");
    }

    public abstract double calPerimeter();

    public abstract String getType();//抽象方法不是空方法体,{}加上以后就不能用abstract修饰了

    public Shape() {
    }

    public Shape(String color) {
        System.out.println("执行Shape的构造器...");
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }


    public static void main(String[] args) {
//        Shape shape = new Shape();//抽象类无法被实例化,只能在重写玩其抽象方法后实例化子类
    }
}
