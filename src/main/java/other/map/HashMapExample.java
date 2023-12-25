package map;

import java.util.*;

public class HashMapExample {

    /**
     * @HashMap() trashigohet nga
     * @Map
     * */
    public static void main(String[] args) {

        Map hashMap  = new HashMap();
        HashMap hashMap1  = new HashMap();


        // Krijo një HashMap të stringjeve
        HashMap<Integer,String> lista = new HashMap<>();

        // Shto disa elemente në listë
        lista.put(0,"Java");
        lista.put(2,"Python");
        lista.put(3,"C++");

        // Shfaq numrin e elementeve në listë
        System.out.println("Numri i elementeve në listë: " + lista.size());


        // Kontrollo nëse lista është bosh
        System.out.println("Lista është bosh? " + lista.isEmpty());

        // Përdor indexOf për të gjetur indeksin e një elementi
        //int index = lista.indexOf("Python");
        //System.out.println("Indeksi i 'Python' në listë: " + index);

        // Përdor get për të marrë një element nga indeksi
        String elementNePozicion = lista.get(0);
        System.out.println("Elementi në pozicionin 0: " + elementNePozicion);

        // Përdor set për të ndryshuar një element në pozicion të caktuar
        //lista.set(1, "JavaScript");
        //System.out.println("Elementi i ndryshuar në pozicionin 1: " + lista.get(1));

        // Përdor remove për të larguar një element nga lista
        lista.remove("C++");
        System.out.println("Lista pasi është larguar 'C++': " + lista);

        // Përdor clear për të fshirë të gjithë elementet nga lista
        lista.clear();
        System.out.println("Lista pasi është fshirë: " + lista);
    }
}
