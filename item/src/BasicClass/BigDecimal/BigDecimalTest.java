package BasicClass.BigDecimal;

import java.math.BigDecimal;

/**
 * 使用BigDecimal默认构造器创建对象时切记使用String参数, 若使用double类型参数,使用BigDecimal.valueOf()类方法创建对象
 * 盖:double传参构造器只会产生相似值
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        BigDecimal f3 = new BigDecimal(0.05);


        System.out.println("使用String作为BigDecimal构造器参数");
        System.out.println("0.05 + 0.01 = "+f1.add(f2));
        System.out.println("0.05 - 0.01 = "+f1.subtract(f2));
        System.out.println("0.05 * 0.01 = "+f1.multiply(f2));
        System.out.println("0.05 / 0.01 = "+f1.divide(f2));


        System.out.println("使用Double作为BigDecimal构造器参数");
        System.out.println("0.05 + 0.01 = "+f3.add(f2));
        System.out.println("0.05 - 0.01 = "+f3.subtract(f2));
        System.out.println("0.05 * 0.01 = "+f3.multiply(f2));
        System.out.println("0.05 / 0.01 = "+f3.divide(f2));

    }
}
