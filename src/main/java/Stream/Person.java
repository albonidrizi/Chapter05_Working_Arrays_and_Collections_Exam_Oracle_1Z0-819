package Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Stream.Gender.*;

class Mainn{
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Albon", MALE),
                new Person("Bera", FEMALE),
                new Person("Anila", FEMALE),
                new Person("Samir", MALE),
                new Person("Ana", FEMALE),
                new Person("Anita", FEMALE)
        );

        System.out.println("\n// Inperativ programming");
        List<Person> female = new ArrayList<>();

        for (Person p: people) {
            if (FEMALE.equals(p.getGender())){
                female.add(p);
            }
        }
        for (Person p: female){
            System.out.println(p);
        }

        System.out.println("\n// Declarativ programming");
        List<Person> female2 = people.stream().
                filter(p->FEMALE.equals(p.getGender())).
                collect(Collectors.toList());

        female2.forEach(System.out::println);

    }
}

public class Person {
    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " - " + gender;
    }
}

enum Gender{
    MALE, FEMALE
}
