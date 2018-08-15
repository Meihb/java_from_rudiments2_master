package ArrTst;

public class CreateArr {
    public static void main(String args[]) {
        System.out.println((byte) 'S');
        int month1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] month2 = new String[]{"1", "2", "3", "4", "5"};
        for (int month : month1
        ) {
            System.out.println(month);
        }
        int b[][] = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println("____________________");
        for (int key[]:b
             ) {
            for (int value:key){
                System.out.println(value);
            }

        }
    }
}
