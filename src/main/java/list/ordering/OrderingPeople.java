package main.java.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingPeople {
    private List<People> orderingPeople ;

    public OrderingPeople() {
        this.orderingPeople = new ArrayList<>();
    }

    public void addPeople(String name, int age, double stature) {
        orderingPeople.add(new People(name, age, stature));
    }

    public List<People> orderingByAge() {
        List<People> peopleByAge = new ArrayList<>(orderingPeople);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<People> orderingByStature() {
        List<People> peopleByStature = new ArrayList<>(orderingPeople);
        Collections.sort(peopleByStature, new ComparatorByStature());
        return  peopleByStature;
    }

    public static void main(String[] args) {

        OrderingPeople listOrderingPeople = new OrderingPeople();
        listOrderingPeople.addPeople("Efraim", 40, 1.68);
        listOrderingPeople.addPeople("Efraim1", 20, 1.71);

        listOrderingPeople.addPeople("Efraim2", 30, 1.84);

        listOrderingPeople.addPeople("Efraim3", 18, 1.75);
        listOrderingPeople.addPeople("Efraim4", 49, 1.60);


        System.out.println(listOrderingPeople.orderingByAge());
        System.out.println(listOrderingPeople.orderingByStature());

    }
}
