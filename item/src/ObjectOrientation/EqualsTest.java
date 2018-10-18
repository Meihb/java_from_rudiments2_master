package ObjectOrientation;

public class EqualsTest {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        String st = "65";

        //primitive类型的==比较时只要皆为数值类型相同无需严格相等,则看值即可
        System.out.println("65和65.0f是否相等" + (it == fl));//true
        //System.out.println("65和字符串65是否相等" + (it == st));报错,非数值类型(byte short int long float double char)

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("s1和s2是否=="+(s1==s2));//false,引用类型==比较的是引用对象是否为一个堆对象
        System.out.println("s1和s2是否equals"+(s1.equals(s2)));//true,equals比较数值
    }
}
