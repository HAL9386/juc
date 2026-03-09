package com.leo.juc.immutable.symmetry;

import com.leo.juc.immutable.symmetry.person.MutablePerson;

public class Main {
    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson("Leo", "Leo");

        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();

        for (int i = 0; true; i++) {
            mutablePerson.setPerson("" + i, "" + i);
        }
    }
}
