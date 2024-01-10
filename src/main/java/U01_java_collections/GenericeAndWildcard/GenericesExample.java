package U01_java_collections.GenericeAndWildcard;
import U01_java_collections.GenericeAndWildcard.Animals.Cat;
import U01_java_collections.GenericeAndWildcard.Animals.Dog;

// Klasa që demonstron përdorimin e klases Box
public class GenericesExample {
    public static void main(String[] args) {
        // Krijojmë një instancë të klases Box specifike për integer (Box<Integer>)

        Box<Integer> boxForInt = new Box<>();
        boxForInt.setObj(10); // Vendosja e numrit 10 në kutinë për integer
        System.out.println("Objekti në kuti: " + boxForInt.getObj());

        // Krijojmë një instancë të klases Box specifike për string (Box<String>)
        Box<String> boxForString = new Box<>();
        boxForString.setObj("Java"); // Vendosja e stringut "Java" në kutinë për string
        System.out.println("Objekti në kuti: " + boxForString.getObj());


        Box<Cat> cats = new Box<>();
        cats.setObj(new Cat("Simba",3));
        System.out.println(cats.getObj());

        Box<Dog> dogs = new Box<>();
        dogs.setObj(new Dog("Reks",1));
        System.out.println(dogs.getObj());

    }
}

