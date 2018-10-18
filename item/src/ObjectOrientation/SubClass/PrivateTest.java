package ObjectOrientation.SubClass;

/**
 * protected修饰的变量或方法可以被子类继承,但是无法access,若子类定义同名变量或方法,非为覆盖,单纯新建
 */
class Father {
    private int age = 23;
    protected int gender = 1;
    private final String name = "father";

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }
}

class Son extends Father {

    public void test() {
        System.out.println("age is " +getName());
    }
}

public class PrivateTest {
    public static void main(String[] args){
        Son son = new Son();
        son.test();

    }
}
