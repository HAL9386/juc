package com.leo.juc.immutable.performance;

public class Main {
    private static final long COUNT = 1000000000L;
    public static void main(String[] args) {
        trial("NotSync", COUNT, new NotSync());
        trial("Sync",    COUNT, new Sync());
    }

    private static void trial(String name, long count, Object obj) {
        System.out.println("Start " + name);
        long start = System.currentTimeMillis();
        for (long i = 0; i < count; i++) {
            obj.toString();
        }
        long end = System.currentTimeMillis();
        System.out.println("End " + name);
        System.out.println(name + " : " + (end - start) + " ms");
    }
}
