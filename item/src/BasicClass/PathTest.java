package BasicClass;

public class PathTest {
    public static void main(String[] args) throws  Exception {
        //一下都是out目录
        //当前目录
        System.out.println(PathTest.class.getResource(""));
        //文件路径
        System.out.println(PathTest.class.getResource("PathTest.class"));
        //上级目录
        System.out.println(PathTest.class.getResource("/"));

        //获取当前目录
        System.out.println(System.getProperty("user.dir"));
    }
}
