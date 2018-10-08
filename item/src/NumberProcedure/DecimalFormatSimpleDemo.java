package NumberProcedure;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
    //构造方法使用pattern
    public static String SimpleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(output);
        return output;
    }

    //apply使用pattern
    public static String ApplyPatternFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat();
        myFormat.applyPattern(pattern);
        String output = myFormat.format(value);
        System.out.println(output);
        return output;
    }

    void tstParams(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum is " + sum);
    }

    public static void main(String[] args) {
        SimpleFormat("###,###,###", 123456.789);
        SimpleFormat("###,###,###kg", 123456.789);
        SimpleFormat("000,000.000", 123);
        SimpleFormat("#####.##%", 6.789);

        ApplyPatternFormat("0.##\u2030", 0.789);
        ApplyPatternFormat("###.0000", 123456.7890);

        System.out.println(Math.round(3.4));
        DecimalFormatSimpleDemo myDecimalFormatSimpleDemo = new DecimalFormatSimpleDemo();
        myDecimalFormatSimpleDemo.tstParams(1, 3, 2);

    }
}
