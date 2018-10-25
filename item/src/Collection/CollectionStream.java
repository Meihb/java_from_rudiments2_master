package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("语文一12");
        books.add("数学二3");
        books.add("英语一4444");
        books.add("化学三5");
        books.add("物理三64");

        Stream stream = books.stream();//用法和iteator()相似

        //filter(Predicate p)
        //筛选出包含"一"的子串
        System.out.println("包含字符一的数量:"+stream.filter(ele -> ((String) ele).contains("一")).count());

        books.stream().mapToInt(ele->((String)ele).length()).forEach(ele->System.out.println("包含字符数量:"+ele));


    }
}
