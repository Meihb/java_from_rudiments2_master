package StringTst;

import java.util.Date;

public class CreateString {
    public static void main(String[] args) {
        char[] chars = {'g', 'o', 'o', 'd'};
        String s1 = new String(chars, 0, chars.length);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf(""));
        System.out.println(s1.charAt(2));
        String s2 = new String("192.168.0.1");
        String[] firstArray = s2.split("\\.");
        for (String s_temp:firstArray){
            System.out.println(s_temp);
        }
        Date s3 = new Date();
        System.out.println(String.format("%tF",s3  ));
    }
}
