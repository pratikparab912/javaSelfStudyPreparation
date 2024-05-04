package com.company;

public class Manager implements Comparable<Manager>{
    int id;
    String name;
    int age;

    public Manager(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Manager manager) {
        if(age == manager.age) {
            return 0;
        } else if (age > manager.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
