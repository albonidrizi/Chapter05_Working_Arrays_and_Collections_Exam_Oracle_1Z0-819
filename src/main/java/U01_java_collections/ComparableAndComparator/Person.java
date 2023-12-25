package U01_java_collections.Personat;

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

        // Renditja do të jetë: 20, 22, 28, duke filluar nga numri më i vogël deri te numri më i madh.
        return this.age -person.age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
