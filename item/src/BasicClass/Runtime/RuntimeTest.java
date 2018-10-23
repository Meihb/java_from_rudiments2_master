package BasicClass.Runtime;

/**
 * 获取运行时环境
 */
public class RuntimeTest {
    public static void main(String[] args) throws  Exception {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量:" + rt.availableProcessors());
        System.out.println("空闲内存数:" + rt.freeMemory());

        System.out.println("总内存数:" + rt.totalMemory() + ";最大内存数:" + rt.maxMemory());

        //单独启动程序
        rt.exec("notepad.exe");
    }
}
