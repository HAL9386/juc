package com.leo.juc.immutable.symmetry.person;

public class ImmutablePerson {
    private final String name;
    private final String address;

    public ImmutablePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ImmutablePerson(MutablePerson person) {
//        synchronized (person) {  // synchronize to ensure thread safety when reading mutable person's data
            this.name = person.getName();
            this.address = person.getAddress();
//        }
    }

    public MutablePerson toMutablePerson() {
        return new MutablePerson(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "[ ImmutablePerson name: " + name + ", address: " + address + " ]";
    }
}
