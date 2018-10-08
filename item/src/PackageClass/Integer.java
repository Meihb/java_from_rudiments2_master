package PackageClass;

public class Integer {
    static {
        System.out.println("this is static area");
    }

    public Integer() {
        System.out.println("here lies the construction");
    }

    public static void main(String[] args) {
        String[] strs = {"89", "12", "10", "18", "35"};
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            sum += java.lang.Integer.parseInt(strs[i]);
        }
        byte s1 = 127;
        Byte by1 = new Byte(s1);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(sum);
    }
}
