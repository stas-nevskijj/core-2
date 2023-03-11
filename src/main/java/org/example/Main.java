package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<NewPerson, Integer> map = new HashMap<>();
        System.out.println(map.size());
//        map.put(new Person("123"), 1);
//        map.put(new Person("456"), 1);
//        map.put(new Person("789"), 1);
//        map.put(new Person("135"), 1);
//        map.put(new Person("246"), 1);
//        map.put(new Person("680"), 1);
//        map.put(new Person("791"), 1);
//        map.put(new Person("247"), 1);
//        map.put(new Person("007"), 1);
//        map.put(new Person("111"), 1);
//        map.put(new Person("666"), 1);
//        map.put(new Person("765"), 1);

//        map.put(new NewPerson("test"), 1);
//        map.put(new NewPerson("test1"), 1);
//        map.put(new NewPerson("test2"), 1);
//        map.put(new NewPerson("test3"), 1);
        map.put(new NewPerson("1"), 1);
        map.put(new NewPerson("2"), 1);
        map.put(new NewPerson("3"), 1);
        map.put(new NewPerson("4"), 1);
        map.put(new NewPerson("5"), 1);
        map.put(new NewPerson("6"), 1);
        map.put(new NewPerson("7"), 1);
        map.put(new NewPerson("8"), 1);
        map.put(new NewPerson("9"), 1);
        System.out.println();
        map.put(new NewPerson("10"), 1);
        map.put(new NewPerson("11"), 1);
        map.put(new NewPerson("12"), 1);
        map.put(new NewPerson("13"), 1);
        map.put(new NewPerson("14"), 1);

        System.out.println(map.size());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
class NewPerson {
    private String name;

    public NewPerson(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewPerson newPerson = (NewPerson) o;
        return Objects.equals(name, newPerson.name);
    }

    @Override
    public int hashCode() {
        if (name.equals("test") || name.equals("test1") || (name.equals("test2")) || (name.equals("test3"))) {
            return 10;
        }

        return Objects.hash(name);
    }
}