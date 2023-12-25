package list;

import java.util.*;

public class ArrayListExample {

    /**
     * @ArrayList() trashigohet nga
     * @AbstractList dhe AbstractList trashigohet nga
     * @List dhe List trashigohet nga
     * @Collection
     * */
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        List arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList<>();

        // Krijo një ArrayList të stringjeve
        ArrayList<String> lista = new ArrayList<>();

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
