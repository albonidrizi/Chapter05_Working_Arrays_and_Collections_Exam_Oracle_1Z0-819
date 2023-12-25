package U01_java_collections.GenericeAndWildcard;


// Klasa që demonstron përdorimin e klases Box
public class GenericesExemple {
    public static void main(String[] args) {
        // Krijojmë një instancë të klases Box specifike për integer (Box<Integer>)
        Box<Integer> boxForInt = new Box<>(); // Përdorimi i diamantit për shkurtim
        boxForInt.setObj(10); // Vendosja e numrit 10 në kutinë për integer
        System.out.println("Objekti në kuti: " + boxForInt.getObj()); // Afishon: Objekti në kuti: 10

        // Krijojmë një instancë të klases Box specifike për string (Box<String>)
        Box<String> boxForString = new Box<>(); // Përdorimi i diamantit për shkurtim
        boxForString.setObj("Java"); // Vendosja e stringut "Java" në kutinë për string
        System.out.println("Objekti në kuti: " + boxForString.getObj()); // Afishon: Objekti në kuti: Java
    }
}

