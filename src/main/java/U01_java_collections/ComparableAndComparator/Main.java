package U01_java_collections.Personat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************  1");

        List a = new ArrayList();
        a.add(2);
        a.add(21);
        a.add(321);
        a.add(22);
        Collections.sort(a);
        System.out.println(a);

        System.out.println("******************  2");

        // Krijimi i listës së personave
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Besnik", 20));
        personList.add(new Person("Saranda", 28));
        personList.add(new Person("Ana", 22));


        // Renditja e personave bazuar në moshë (përmes compareTo()) qe implementohet nga Comparable
        Collections.sort(personList);

        System.out.println("Sorted by age:");
        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("\n******************  3");
        // Renditja e personave bazuar në emër (përmes Comparator-it) nga NameComparator
        Collections.sort(personList, new NameComparator());

        System.out.println("Sorted by name:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
