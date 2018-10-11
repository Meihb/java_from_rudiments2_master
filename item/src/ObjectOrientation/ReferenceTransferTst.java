package ObjectOrientation;

class DataWrap {
    int a;
    int b;
    int c;

    public DataWrap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public DataWrap() {
        this(1, 5);
         this.c = 10;
    }

}

/**
 * java之引用传参与C中指针一样,知识java封装了指针的操作方式,其读取按照@指针操作而已
 */
public class ReferenceTransferTst {
    /**
     * @param dataWrap DataWrap
     */
    private void wrap(DataWrap dataWrap) {
        int temp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = temp;
        //调试引用传参值效果
//        dataWrap = null;
//        System.out.println("in wrap:a is " + dataWrap.a + ",b is " + dataWrap.b);

    }


    private void testFlexiableParams(int a, String[] book1s, String... book2s) {
        System.out.println(a);
        for (String book1 : book1s
        ) {
            System.out.println("book1: " + book1);

        }
        for (String book2 : book2s
        ) {
            System.out.println("book2: " + book2);

        }
    }

    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;

        System.out.println("a is " + dataWrap.a + ",b is " + dataWrap.b);
        ReferenceTransferTst referenceTransferTst = new ReferenceTransferTst();
        referenceTransferTst.wrap(dataWrap);
        System.out.println("a is " + dataWrap.a + ",b is " + dataWrap.b);

        String[] st2 = new String[]{"xinhua", "东北"};
        int a = 2;
        //可变传参
        referenceTransferTst.testFlexiableParams(a, st2, "新1", "新2");
        //变长形参可以直接通过数组传递,此处与python中传参*list相似
        referenceTransferTst.testFlexiableParams(a, st2, new String[]{"数组1", "数组2"});
    }
}
