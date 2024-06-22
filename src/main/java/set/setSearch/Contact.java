package main.java.set.setSearch;

import java.util.Objects;

public class Contact {

    private String name;
    private int celNumber;

    public String getName() {
        return name;
    }

    public int getCelNumber() {
        return celNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public Contact(String name, int celNumber) {
        this.name = name;
        this.celNumber = celNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", celNumber=" + celNumber +
                '}';
    }

    public void setCelNumber(int celNumber) {
        this.celNumber = celNumber;
    }
}
