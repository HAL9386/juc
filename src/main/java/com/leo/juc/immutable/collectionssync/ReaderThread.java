package com.leo.juc.immutable.collectionssync;

import java.util.List;

public class ReaderThread extends Thread {
    private final List<Integer> list;

    public ReaderThread(List<Integer> list) {
        super("ReaderThread");
        this.list = list;
    }

    @Override
    public void run() {
        for (;;) {
            synchronized (list) {
                for (Integer i : list) {
                    System.out.println(i);
                }
            }
        }
    }
}
