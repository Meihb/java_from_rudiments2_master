package BasicClass.ObjectAndObjects;

import java.util.Objects;

/**
 * Objects是Object的紧耦合代替品,为了出力对应目标非Object的异常情况
 * java s后缀是工具类的文法规则,如Arrays是操作数组的工具类,Collections是操作集合的工具类
 */
public class ObjectsTest {
    static ObjectsTest objectsTest;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(ObjectsTest.objectsTest));//0
        System.out.println(Objects.toString(objectsTest));//null
        System.out.println(Objects.requireNonNull(objectsTest,"不可为空"));
    }
}
