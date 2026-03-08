package com.leo.juc.immutable.performance;

public class Sync {
    public final String name = "Sync";

    @Override
    public synchronized String toString() {
        return "[ " + name + " ]";
    }
}
