package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //添加元素
        collection.add("孙悟空");
        //自动装箱
        collection.add(6);
        System.out.println(collection.size());
        collection.remove(6);
        System.out.println(collection.size());
        System.out.println(collection.contains("孙悟空"));
        collection.add("java");
        System.out.println(collection);


        Collection books = new HashSet();
        books.add("java");
        books.add("讲义");
        System.out.println("collection是否包含books集合" + collection.containsAll(books));

        collection.removeAll(books);
        System.out.println("collection去除books集合之后为:" + collection);

        collection.clear();
        System.out.println(collection);

        //取交集
        books.retainAll(collection);
        System.out.println("books当前集合的元素:" + books);


//        public interface Collection<E> extends Iterable<E>
        //Collection 接口继承了Iterable接口 forEach(Consumer action)(Python好像也有类似方法)
        // Consumer(T t)::void accept()
        books = new HashSet();
        books.add(1);
        books.add(2);
        books.add(3);
        books.forEach(obj -> System.out.println("迭代元素是:" + obj));


        //从Iterable可迭代对象获取迭代器Iterator
        Iterator it = books.iterator();
        while (it.hasNext()) {
            //it.next()返回的数据类型是Object,需要强制转换
            String book = it.next().toString();
            System.out.println(book);
            if (book.equals("2")) {
                it.remove();//删除最近一次next()元素
            }
            //在迭代内部不可以操作Collection对象,ConcurrentModificationException 并发修改异常
//            books.remove(2);
            book = "测试";
        }
        System.out.println(it);
        //千万莫以为iterator对象与Collection无关,在Iterator中remove元素,Collection一样删除元素,两个应用相同
        System.out.println(books);

        //Itreator forEachRemaining
        Iterator it2 = books.iterator();
        it2.forEachRemaining(obj -> System.out.println("迭代对象是:" + obj));


//        Predicate
        Collection books2 = new HashSet();
        books2.add(1);
        books2.add(2);
        books2.add(3);
        books2.removeIf(elm -> ((Integer) elm).intValue() > 2);//去除满足函数式接口的对象
        System.out.println(books2);

        Collection book3s = new HashSet();
        book3s.add("Java EE企业应用实战");
        book3s.add("疯狂Java讲义");
        book3s.add("疯狂IOS讲义");
        book3s.add("疯狂AJAX讲义");
        book3s.add("疯狂Android讲义");


        System.out.println(calAll(book3s,ele->((String)ele).contains("疯狂")));

        System.out.println(calAll(book3s,ele->((String)ele).contains("Java")));

        System.out.println(calAll(book3s,ele->((String)ele).length()>10));
        System.out.println(book3s);




    }

    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for (Object book : books) {
            if (p.test(book)) {
                total += 1;
            }
        }
        return total;
    }
}
