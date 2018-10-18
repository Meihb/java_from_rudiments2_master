package ObjectOrientation;


class Person {
    private String name;
    private String idStr;

    public Person() {
    }

    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public String getIdStr() {
        return idStr;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Person.class) {
            //还记得之前的变量从左,方法从右吗,一个对象内部即使存在某方法,若其编译时类型不支持则无法编译直接调用，需要使用强制转换
            Person personObj = (Person) obj;
            if (this.idStr.equals(personObj.getIdStr())) {
                return true;
            }
        }

        return false;
    }
}

public class OverrideEqualsRight {
    public static void main(String[] args) {
        Person p1 = new Person("孙行者", "11111");
        Person p2 = new Person("者行孙", "11111");
        Person p3 = new Person("行者孙", "22222");


        System.out.println("p1和p2是否相等?"+p1.equals(p2));//true
        System.out.println("p1和p3是否相等?"+p1.equals(p3));//false
    }
}
