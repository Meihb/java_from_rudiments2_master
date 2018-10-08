package NumberProcedure;


import java.util.Arrays;

public class ReturnTst {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
//                if (i == 2) {
//                    return;// 直接退出当前function
//                }
                System.out.println("i is " + i + " , j is " + j);
            }
        }

        String[][] str1 = new String[][]{
                {"12", "13"}, {"ss", "sa"}
        };
        for (String[] str2 : str1
        ) {

        }
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        System.out.println("here is the result "+ Arrays.equals(a,b));


    }
}
