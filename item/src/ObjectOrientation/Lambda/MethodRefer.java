package ObjectOrientation.Lambda;

import javax.swing.*;

@FunctionalInterface
interface Convert {
    Integer convert(String from);
}

@FunctionalInterface
interface ConstructTest {
    JFrame win(String title);
}

/**
 * lambda 方法引用--代码块只有一条代码--->方法引用和构造器引用
 * --函数接口中被实现的方法的参数全部传给该方法-->::符
 */
public class MethodRefer {
    public static void main(String[] args) {
        //普通写法
        Convert convert1 = (String from) -> {
            return Integer.valueOf(from);
        };

        System.out.println(convert1.convert("123"));
        //lambda一阶写法,引用方法,隐藏{}
        Convert convert2 = from -> Integer.valueOf(from);
        System.out.println(convert2.convert("345"));

        //lambda二阶写法,使用::
        Convert convert3 = Integer::valueOf;
        System.out.println(convert3.convert("456"));

        //lambda引用构造器
        //一阶写法
        ConstructTest ct1 = title -> new JFrame(title);
        //二阶写法
        ConstructTest ct2 = JFrame::new;
    }
}
