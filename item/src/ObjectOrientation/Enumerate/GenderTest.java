package ObjectOrientation.Enumerate;

interface GenderDesc {
    void info();
}

enum Gender implements GenderDesc {
    MALE("男")
            {//匿名内部类 实现接口
                public void info(){
                    System.out.println("这是MALE的描述");
                }
            }
    , FEMALE("女")           {
        public void info(){
            System.out.println("这是FEMALE的描述");
        }
    };

    //一定为枚举类定义了显示传参的构造器,那么列出枚举值时就必须传入对应参数
    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    private String name;
}

public class GenderTest {

    public static void main(String[] args) {
        Gender g = Enum.valueOf(Gender.class, "MALE");
//        g.name = "女";
        System.out.println(g + "代表:" + g.getName());

    }
}
