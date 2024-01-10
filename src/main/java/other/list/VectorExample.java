package other.list;

import java.util.*;

public class VectorExample {

    /**
     * @Vector() trashigohet nga
     * @List dhe List trashigohet nga
     * @Collection
     * */
    public static void main(String[] args) {
        Collection vector = new Vector();
        List vector1 = new Vector();
        Vector vector2 = new Vector();


        // Krijo një Vector të stringjeve
        Vector<String> lista = new Vector<>();

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

        // Përdor indexOf për të gjetur indeksin e një elementi
        int index = lista.indexOf("Python");
        System.out.println("Indeksi i 'Python' në listë: " + index);

        // Përdor get për të marrë një element nga indeksi
        String elementNePozicion = lista.get(0);
        System.out.println("Elementi në pozicionin 0: " + elementNePozicion);

        // Përdor set për të ndryshuar një element në pozicion të caktuar
        lista.set(1, "JavaScript");
        System.out.println("Elementi i ndryshuar në pozicionin 1: " + lista.get(1));

        // Përdor remove për të larguar një element nga lista
        lista.remove("C++");
        System.out.println("Lista pasi është larguar 'C++': " + lista);

        // Përdor clear për të fshirë të gjithë elementet nga lista
        lista.clear();
        System.out.println("Lista pasi është fshirë: " + lista);
    }


}
