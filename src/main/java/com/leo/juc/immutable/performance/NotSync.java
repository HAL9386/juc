package com.leo.juc.immutable.performance;

public class NotSync {
    public final String name = "NotSync";

    @Override
    public String toString() {
        return "[ " + name + " ]";
    }
}
