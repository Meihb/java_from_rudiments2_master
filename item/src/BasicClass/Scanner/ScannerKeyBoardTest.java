package BasicClass.Scanner;

import java.util.Scanner;

public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        //System.in代表  标准输入
        Scanner sc = new Scanner(System.in);
        //指定回车作为分隔符,默认 空格 tab 回车 都是分割符
        sc.useDelimiter("\n");

        while (sc.hasNext()) {
            String msg = (String) sc.next();
            if (msg.equals("exit")) break;
            System.out.println("输入的内容是:"+msg);
        }
    }
}
