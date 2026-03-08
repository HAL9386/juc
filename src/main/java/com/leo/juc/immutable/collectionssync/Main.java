package com.leo.juc.immutable.collectionssync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        new ReaderThread(list).start();
        new WriterThread(list).start();
    }
}
