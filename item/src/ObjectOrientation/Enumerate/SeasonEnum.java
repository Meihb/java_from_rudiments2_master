package ObjectOrientation.Enumerate;

public enum SeasonEnum {//隐式的extends了java.lang.Enum,故不能显示继承其它父类，同时修饰符是且只能是final,因此无法派生子类
    //构造器只能是private，即不可在类外部创建实例
    //第一行定义四个枚举实例
    SPRING, SUMMER, AUTUMN, WINTER;

}
