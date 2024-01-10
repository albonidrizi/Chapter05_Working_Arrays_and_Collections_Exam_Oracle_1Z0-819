package U01_java_collections.ComparableAndComparator;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {

        // Renditja do të jetë: 28, 22, 20, duke filluar nga numri më i madh deri te numri më i vogël.
        // return  person.age -this.age;
        // 28 - 20 =  8  kt rast meret   person.age  28
        // 20 - 22 = -2  kete rast meret this.age    22
        // pastaj vjen nr                            20

        // Renditja do të jetë: 20, 22, 28, duke filluar nga numri më i vogël deri te numri më i madh.
        return this.age -person.age;
        // nese del zbritja e 2 numrave me nje rezultat me minus psh -2,-3,-22 ateher do e mar nr THIS.AGE nese del me plus atehr mer PERSON.AGE
        // 20 - 28 = -8  kt rast meret this.person   20
        // 28 - 22 =  6  kete rast meret person.age  28
        // pastaj vjen nr                            28

        // 28 - 20 =  8  kt rast meret person.age    20
        // 28 - 28 =  0  kt rast nuk ka dallim cila shkon para
        // 28 - 22 =  6
        // 28 - 22 =  6
        // 20,  22, 28,28
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}
