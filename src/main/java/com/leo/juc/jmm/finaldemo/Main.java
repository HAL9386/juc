package com.leo.juc.jmm.finaldemo;

public class Main {

    public static void main(String[] args) {
        new Thread(Something::new).start();
        // new Thread(Something::create).start();

        new Thread(Something::print).start();
    }
}
