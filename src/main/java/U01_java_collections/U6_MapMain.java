package U01_java_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String... args) {
        // Krijimi i dy objekteve të tipit HashMap me njëzet elemente fillestare (kapacitet default)
        HashMap countries = new HashMap();
        HashMap<Integer, String> countries2 = new HashMap<>();
        // Krijimi i dy objekteve të tipit Map, i cili është një interfacing i përgjithshëm për strukturat e të dhënave në Java
        Map languages = new HashMap();
        Map<String, String> languages2 = new HashMap<>();

        // Shtimi i disa çifteve çelës-vlerë në countries2 (që është një HashMap me çelës integer dhe vlerë string)
        countries2.put(840, "ALB");
        countries2.put(484, "KS");
        countries2.put(124, "NMK");

        System.out.println(countries2.get(840)); // Shfaq vlerën për çelësin 840

        countries2.remove(840); // Hiqni elementin me çelësin 840 nga HashMap

        countries2.keySet(); // Kthehet një set me të gjitha çelësat në countries2

        countries2.put(124, "NMK"); // Përpjekje për të rindërtuar vlerën për çelësin 124 (mbivendos vlerën ekzistuese)
        countries2.put(124, "ABC"); // Përpjekje për të rindërtuar vlerën për çelësin 124 (mbivendos vlerën ekzistuese)

        countries2.values(); // Kthehet një koleksion me të gjitha vlerat në countries2

        countries2.containsKey(840); // Kontrollon nëse countries2 përmban çelës 840 (kthehet true ose false)
        countries2.containsValue("ALB"); // Kontrollon nëse countries2 përmban vlerën "USA" (kthehet true ose false)

        countries2.put(-1, null); // Shtimi i një çifti me çelës -1 dhe vlerën null
        countries2.put(null, null); // Shtimi i një çifti me çelës null dhe vlerën null

        // Krijimi i një TreeMap (që është një lloj i strukturës së të dhënave TreeMap në Java)
        TreeMap<Integer, String> planets = new TreeMap<>();
        // Krijimi i një TreeMap me çelës string dhe vlerë string
        Map<String, String> englishSpanish = new TreeMap<>();

        // Shtimi i disa çifteve çelës-vlerë në TreeMap planets
        planets.put(3, "Earth");
        planets.put(2, "Venus");
        planets.put(4, "Mars");

        planets.put(Integer.valueOf(3), "Earth"); // Përpjekje për të shtuar vlerën e një çelësi që ekziston në TreeMap

        // Shtimi i disa çifteve çelës-vlerë në TreeMap english-shqip
        englishSpanish.put("dog", "qeni");
        englishSpanish.put("cat", "macja");
        englishSpanish.put("fish", "peshki");

        System.out.println(planets.keySet().toString()); // Shfaqja e çelësave të TreeMap planets në formë të stringut
        System.out.println(englishSpanish.keySet().toString()); // Shfaqja e çelësave të TreeMap englishSpanish në formë të stringut

        planets.put(20, null); // Shtimi i një çifti me çelës 20 dhe vlerën null në TreeMap planets
        planets.put(null, null); // Shtimi i një çifti me çelës null dhe vlerën null në TreeMap planets
    }

}
