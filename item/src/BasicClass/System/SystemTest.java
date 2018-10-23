package BasicClass.System;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception {
        //获取系统环境变量
        Map<String, String> env = System.getenv();

        for (String name : env.keySet()) {
            System.out.println(name + "--->" + env.get(name));
        }
        //获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有的系统属性
        Properties props = System.getProperties();
        //存储到props.txt文件中
        String filePath = System.getProperty("user.dir")+"/src/BasicClass/System/props.txt";
        System.out.println(filePath);
        props.store(new FileOutputStream(filePath),"System Properties");

    }
}
