package ObjectOrientation.Enumerate;

public class SeasonEnumTest {
    public void test(SeasonEnum seasonEnum) {
        switch (seasonEnum) {
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("夏日炎炎");
            case AUTUMN:
                System.out.println("秋月无边");
                break;
            case WINTER:
                System.out.println("白雪皑皑");
                break;


        }
    }

    static public void main(String[] args) {
        //构造器是private
//        SeasonEnum seasonEnum = new SeasonEnum();

        SeasonEnumTest  seasonEnumTest= new SeasonEnumTest();
        //Enum.values()默认方法,获取枚举类所有实例
        for (SeasonEnum s : SeasonEnum.values()) {
            seasonEnumTest.test(s);
            System.out.println(s.ordinal());//下标值
        }
    }
}
