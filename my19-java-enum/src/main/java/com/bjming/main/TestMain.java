package com.bjming.main;

import com.bjming.constant.ColorEnum;

import java.util.EnumMap;

public class TestMain {

    public static void main(String[] args) {
        ColorEnum black = ColorEnum.BLACK;
        System.out.println("black = " + black);

        ColorEnum black2 = ColorEnum.BLACK;
        /**
         * 枚举类型的比较可以直接使用双等号,
         * 也可以使用equals()方法, 但是这个equals()方法是Object中的equals()方法, 本身也是使用了双灯好来比较值
         */
        System.out.println("black==black2 = " + (black.equals(black2)));

        //使用switch, case
        switch (black) {
            case WHITE:
                System.out.println("白色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            case PINK:
                System.out.println("粉色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            default:
                System.out.println("未知");
        }

        System.out.println("========================================");
        ColorEnum[] values = ColorEnum.values();
        for (ColorEnum ce : values) {
            System.out.println("ce==" + ce.toString());
        }

        ColorEnum black1 = ColorEnum.valueOf("BLACK");
        System.out.println("black1 = " + black1);

        ColorEnum white = ColorEnum.valueOf(ColorEnum.class, "WHITE");
        System.out.println("white = " + white);
        int res = white.compareTo(ColorEnum.RED);
        System.out.println("res = " + res);

        EnumMap<ColorEnum, Object> map = new EnumMap<ColorEnum, Object>(ColorEnum.class);
        map.put(white, "zhangsan");
        map.put(ColorEnum.BLUE, "lisi");
        System.out.println(map);
    }
}
