package other.queue;

import java.util.*;

public class ArrayDequeExample {

    /**
     * @ArrayDeque() trashigohet nga
     * @Queue dhe queue trashigohet nga
     * @Collection
     * */
    public static void main(String[] args) {
        Collection arrayDeque  = new ArrayDeque();
        Queue arrayDeque1  = new ArrayDeque();
        ArrayDeque arrayDeque2  = new ArrayDeque();

        // Krijo një ArrayDeque të stringjeve
        ArrayDeque<String> lista = new ArrayDeque<>();

        // Shto disa elemente në listë
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Shfaq numrin e elementeve në listë
        System.out.println("Numri i elementeve në listë: " + lista.size());

        // Shfaq elementet e listës
        System.out.println("Elementet e listës:");
        for (String element : lista) {
            System.out.println(element);
        }

        // Kontrollo nëse lista është bosh
        System.out.println("Lista është bosh? " + lista.isEmpty());

        // Nuk mund te perdorim indexOf për të gjetur indeksin e një elementi
        //  int index = lista.indexOf("Python");

        //  Nuk mund te perdorim  get për të marrë një element nga indeksi
        //  String elementNePozicion = lista.get(0);

        //  Nuk mund te perdorim  set për të ndryshuar një element në pozicion të caktuar
        //  lista.set(1, "JavaScript");

        // Përdor remove për të larguar një element nga lista
        lista.remove("C++");
        System.out.println("Lista pasi është larguar 'C++': " + lista);

        // Përdor clear për të fshirë të gjithë elementet nga lista
        lista.clear();
        System.out.println("Lista pasi është fshirë: " + lista);

    }
}
