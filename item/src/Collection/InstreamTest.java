package Collection;

import java.util.stream.IntStream;

public class InstreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        //聚焦方法,大多数对一个Stream对象而言只能调用一次
//        System.out.println("is 所有元素的最大值:"+is.max().getAsInt());
//        System.out.println("is 所有元素的最小值:"+is.min().getAsInt());
//        System.out.println("is 所有元素的和:"+is.sum());
//        System.out.println("is 的所有元素的总数:"+is.count());
//        System.out.println("is 的所有元素的平均值:"+is.average().getAsDouble());
//    System.out.println("is 所有元素的平方是否都大于20:"+is.allMatch(ele->ele*ele>20));
//        System.out.println("is 所有元素的平方是否存在至少一个大于20:"+is.anyMatch(ele->ele*ele>20));
        IntStream newis = is.map(ele -> ele * 2 + 1);
        newis.forEach(ele->System.out.println(ele));



    }
}
