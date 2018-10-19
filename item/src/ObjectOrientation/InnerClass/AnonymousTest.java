package ObjectOrientation.InnerClass;


interface Product {
    public double getPrice();

    public String getName();
}

abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AnonymousTest {
    private int anid = 99;


    public void test(Product product) {
        System.out.println("购买了一个" + product.getName() + ",花费" + product.getPrice());
    }

    public void testDevice(Device device) {
        System.out.println(AnonymousTest.this.anid + "购买了一个" + device.getName() + ",花费" + device.getPrice());
    }

    public static void main(String[] args) {
        int age = 12;
//        age = 13;
        AnonymousTest anonymousTest = new AnonymousTest();

        anonymousTest.test(new Product() {//匿名内部类 ,new Interface || extends Abstract Class
            @Override
            public double getPrice() {
                return 378.2;
            }

            @Override
            public String getName() {
                return "长毛象";
            }
        });

        anonymousTest.testDevice(new Device("鼠标") {
            {
                System.out.println("这是内部初始化块");
            }

            @Override
            public double getPrice() {
                return age;
            }

            public String getName() {
                return "新鼠标";
            }
        });


    }
}
