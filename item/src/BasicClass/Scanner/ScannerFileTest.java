package BasicClass.Scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {

    public static void main(String[] args) throws Exception {
        //将File对象作为scanner构造器传参,从而读取文件
        ScannerFileTest sf = new ScannerFileTest();
        //一下是尝试出来的 路径解析方法
        System.out.println(ScannerFileTest.class.getResource("ScannerFileTest.class").getPath());
        Scanner sc = new Scanner(new File("D:\\version_control\\git\\java_from_rudiments2_master\\item\\src\\BasicClass\\Scanner/ScannerFileTest.java"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
