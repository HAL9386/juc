package com.leo.juc.jmm.finaldemo;

public class Something {
    private final int x;
    private static Something last = null;

    public Something() {
        x = 123;
        last = this;
    }
//    private Something() {
//        x = 123;
//    }

    public static Something create() {
        last = new Something();
        return last;
    }

    public static void print() {
        if (last != null) {
            System.out.println(last.x);
        }
    }

}
