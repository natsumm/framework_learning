package com.bjming.constant;

public enum ColorEnum {
    /**
     * 如果打算定义自己的方法, 必须在最后一个枚举的后面添加一个分号,
     * 而且java规定了必须先定义枚举类的实例;
     * <p>
     * 这里列出的每一个枚举类, 都是一个ColorEnum枚举类的实例(对象),
     * 如果枚举类中定义了成员变量, 那么这个枚举类实例也都具有这些属性
     */
    RED("红色", 1),
    BLUE("蓝色", 2),
    GREEN("绿色", 3),
    BLACK("黑色", 4),
    PINK("粉色", 5),
    WHITE("白色", 6);

    private String name;
    private Integer id;

    /**
     * Modifier 'private' is redundant for enum constructors
     * 会提示 修饰符private在枚举类的构造方法上是多余的, 使用非私有的构造方法会报错
     * <p>
     * 原因: 枚举类被设计成是单例模式, 即枚举类型会由JVM在类加载的时候, 实例化枚举类对象,
     * JVM为了保证每个元素的唯一实例, 不允许外部进行new的, 所以会把构造函数设计成private,
     * 防止用户new出实例, 破坏唯一性, 枚举类型的构造方法默认是private, 可以省略不写
     */
    private ColorEnum(String name, Integer id) {
        this.name = name;
        this.id = id;
    }


    ColorEnum() {
    }

    public static String getNameById(Integer id) {
        for (ColorEnum ce : ColorEnum.values()) {
            //使用了包装类型, integer, 比较两个包装类应当使用equals()方法, 而不是双等号;
            //if(ce.id==id){
            if (ce.id.equals(id)) {
                return ce.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

/*    @Override
    public String toString() {
        return "ColorEnum{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }*/
}
