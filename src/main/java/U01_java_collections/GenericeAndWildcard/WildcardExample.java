package U01_java_collections.GenericeAndWildcard;

import java.util.ArrayList;

public class WildcardExample {
    // Metoda që printon elementet e një ArrayList-i të përgjithshëm
    public static void printElements(ArrayList<?> lista) {
        for (Object obj : lista) { // Për çdo objekt në listë
            System.out.println(obj); // Printo objektin
        }
    }

    public static void main(String[] args) {
        // Krijimi i një ArrayList për numra të plotë
        ArrayList<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(5);
        listaInteger.add(10);

        // Krijimi i një ArrayList për stringje
        ArrayList<String> listaStringje = new ArrayList<>();
        listaStringje.add("Java");
        listaStringje.add("Python");

        System.out.println("Elementet e listës së numrave të plotë:");
        printElements(listaInteger); // Printo elementet e listës së numrave të plotë: 5, 10

        System.out.println("Elementet e listës së stringjeve:");
        printElements(listaStringje); // Printo elementet e listës së stringjeve: Java, Python
    }
}

