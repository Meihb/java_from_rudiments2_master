package StringTst;

public class Jerque {
    public static void main(String[] args) {
        String str = "";
        //定义对字符串执行的操作起始时间
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        Long endTime = System.currentTimeMillis();
        Long time = endTime - startTime;
        System.out.println("+法耗时" + time.toString());

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int j=0;j<10000;j++){
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        System.out.println(builder);
        System.out.println("生成器方法耗时"+(endTime-startTime));


    }
}
