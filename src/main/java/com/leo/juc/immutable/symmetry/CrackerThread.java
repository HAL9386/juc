package com.leo.juc.immutable.symmetry;

import com.leo.juc.immutable.symmetry.person.ImmutablePerson;
import com.leo.juc.immutable.symmetry.person.MutablePerson;

public class CrackerThread extends Thread {
    private final MutablePerson mutablePerson;

    public CrackerThread(MutablePerson mutablePerson) {
        this.mutablePerson = mutablePerson;
    }

    @Override
    public void run() {
        while (true) {
            ImmutablePerson immutablePerson = new ImmutablePerson(mutablePerson);
            if (!immutablePerson.getName().equals(immutablePerson.getAddress())) {
                System.out.println("Cracked! " + immutablePerson);
            }
        }
    }
}
