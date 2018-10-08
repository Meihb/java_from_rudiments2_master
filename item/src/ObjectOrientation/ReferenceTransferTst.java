package ObjectOrientation;

class DataWrap {
    int a;
    int b;
}

/**
 * java之引用传参与C中指针一样,知识java封装了指针的操作方式,其读取按照@指针操作而已
 */
public class ReferenceTransferTst {
    /**
     * @param dataWrap
     */
    public void wrap(DataWrap dataWrap) {
        int temp = dataWrap.a;
        dataWrap.a = dataWrap.b;
        dataWrap.b = temp;
        //调试引用传参值效果
//        dataWrap = null;
//        System.out.println("in wrap:a is " + dataWrap.a + ",b is " + dataWrap.b);

    }

    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;

        System.out.println("a is " + dataWrap.a + ",b is " + dataWrap.b);
        ReferenceTransferTst referenceTransferTst = new ReferenceTransferTst();
        referenceTransferTst.wrap(dataWrap);
        System.out.println("a is " + dataWrap.a + ",b is " + dataWrap.b);
    }
}
