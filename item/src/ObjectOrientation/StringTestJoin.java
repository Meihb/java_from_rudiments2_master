package ObjectOrientation;

public class StringTestJoin {
    public static void main(String[] args) {
        String s1 = "疯狂JAVA";//常量池
        String s2 = "疯狂" + "JAVA";//常量池

        System.out.println(s1 == s2);//true

        String s3 = new String("疯狂JAVA");
        String s4 = new String("疯狂") + new String("JAVA");
        System.out.println(s3 == s4);//false

        String s5 = "疯狂";
        String s6 = "JAVA";
        String s7 = s5 + s6;

        System.out.println(s1 == s7);//false

        final String s8 = "疯狂";//对于final而言,只有在定义时指定初始值才会作为宏变量
        final String s9 = "JAVA";
        String s0 = s8 + s9;//true

        System.out.println(s1 == s0);//true

        String s11 = new String("aaa");//不可变对象,String 和包装类
        s11 = new String("bbb");
        System.out.println(s11);

    }


}
