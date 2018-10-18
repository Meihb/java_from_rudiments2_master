package ObjectOrientation.AbstractClass;

import ObjectOrientation.AbstractClass.Shape;

public class Circle extends Shape {

    private double radius;//半径

    public Circle(String color, double radius) {
        super(color);
        if (radius < 0) {
            System.out.println("半径必须为正数");
        }
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //重写计算周长方法
    @Override
    public double calPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    //重写获取类型方法

    @Override
    public String getType() {
        return getColor() + "圆形";
    }

    public static void main(String[] args) {
        Shape s1 = new Triangle("黑色", 3, 4, 5);
        Shape s2 = new Circle("黄色", 3);

        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}



