package ObjectOrientation;

/**
 * 常量池和Integer创建-128-127内外数字一样,其都是为了cache提升效率,区别一个是在范围内使用cache,一个在编译时可确定使用cache
 * 当然可以理解,Integer本事可以确定的范围,String则不确定
 */
public class StringCompareTest {
    static public void main(String[] args) {
        String s1 = "疯狂JAVA";
        String s2 = "疯狂";
        String s3 = "JAVA";

        //一下两个虽不是直接复赋值,但是在编译的时候可以确定
        String s4 = "疯狂" + "JAVA";
        String s5 = "疯" + "狂" + "JAVA";
        //以下在编译的时候无法确定
        String s6 = s2 + s3;

        //new String和""直接赋值的区别是,其不仅使用了常量池(constant pool)
        String s7 = new String("疯狂JAVA");

        System.out.println(s1==s4);//true
        System.out.println(s1==s5);//true
        System.out.println(s1==s6);//false
        System.out.println(s1==s7);//false


    }
}
