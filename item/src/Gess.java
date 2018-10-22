public class Gess {
    public static void main(String[] args) {
        //字符型可以通过强转int获取unicode编码,反之亦然
        char word = 's';//''表示字符char(占位16两个字节),""表示字符串
        int p = 23045;
        int p2 = word;
        System.out.println((int) (char) p);
        System.out.println(p2);

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
