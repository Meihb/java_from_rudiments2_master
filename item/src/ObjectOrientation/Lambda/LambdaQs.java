package ObjectOrientation.Lambda;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    //调用该方法需要Eatable对象
    public void eat(Eatable e) {
        System.out.println(e.toString());
        e.taste();
    }

    //调用该方法需要Flyable对象
    public void drive(Flyable f) {
        System.out.println("我正在驾驶" + f);
        f.fly("【碧空如洗的晴天】");
    }

    //调用该方法需要Addable对象
    public void test(Addable a) {
        System.out.println("5与3的和是:" + a.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat(()->System.out.println("苹果味道不错"));
    }
}
