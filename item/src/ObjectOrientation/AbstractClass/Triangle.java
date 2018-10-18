package ObjectOrientation.AbstractClass;

import ObjectOrientation.AbstractClass.Shape;

public class Triangle extends Shape {

    //定义三角形三条边
    private double a, b, c;

    {
        System.out.println("Triangled初始化块,color is " + this.getColor());
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    @Override
    /**计算周长
     *
     */
    public double calPerimeter() {
        return (this.a + this.b + this.c);
    }

    @Override
    public String getType() {
        return this.getClass().toString();
    }

    public void setSides(double a, double b, double c) {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("三角形两边之和大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


}
