package ObjectOrientation.Lambda;

/**
 * 只有一个抽象方法的接口,可以多个默认方法,类方法,但抽象方法只能一个--函数式接口(@FunctionalInterface)
 */
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

    //调用该方法需要Fly ble对象
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
        lq.eat(() -> System.out.println("苹果味道不错"));

        //匿名内部类
        lq.drive(
                new Flyable() {
                    @Override
                    public void fly(String weather) {
                        System.out.println("匿名天气是" + weather);
                    }
                }
        );
        lq.drive((String weather) -> {
            System.out.println("lambda天气是" + weather);
        });

        lq.test((int a, int b) ->
                a + b
        );
    }
}
