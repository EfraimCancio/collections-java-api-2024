package main.java.list.ordering;

import java.util.Comparator;

public class People implements Comparable<People> {
    private String name;
    private int age;
    private double stature;

    public People(String name, int age, double stature) {
        this.name = name;
        this.age = age;
        this.stature = stature;
    }

    @Override
    public int compareTo(People p) {
        return Integer.compare(age, p.getAge());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stature=" + stature +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getStature() {
        return stature;
    }

    public void setStature(double stature) {
        this.stature = stature;
    }

}

class ComparatorByStature implements Comparator<People> {

    @Override
    public int compare(People p1, People p2) {
        return Double.compare(p1.getStature(), p2.getStature());
    }
}
