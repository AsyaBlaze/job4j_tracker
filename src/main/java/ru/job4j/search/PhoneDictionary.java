package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /*public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAddress().contains(key) || person.getName().contains(key)
                    || person.getSurname().contains(key) || person.getPhone().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }*/

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = p -> p.getName().contains(key)
                || p.getSurname().contains(key)
                || p.getAddress().contains(key)
                || p.getPhone().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}