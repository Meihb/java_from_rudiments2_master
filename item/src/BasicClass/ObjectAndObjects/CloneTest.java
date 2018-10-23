package BasicClass.ObjectAndObjects;


class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("上海浦东");
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}

/**
 * 实现 Cloneable接口
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(25);
        User user2 = user1.clone();
        System.out.println(user1==user2);

        System.out.println(user1.address == user2.address);
    }
}
