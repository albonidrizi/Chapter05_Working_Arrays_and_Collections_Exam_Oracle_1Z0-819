package U01_java_collections;

import java.util.*;

public class U3_ListMain {

    public static void main(String... args) {


        ArrayList arrayList = new ArrayList(); // Krijon një ArrayList bosh
        ArrayList arrayList2 = new ArrayList(100); // Krijon një ArrayList me kapacitet fillestar prej 100 elementësh
        ArrayList arrayList3 = new ArrayList(arrayList2); // Krijon një ArrayList duke kopjuar elementët e arrayList2

        ArrayList<String> colors = new ArrayList<String>(); // Krijon një ArrayList për stringjet
        List arrayList4 = new ArrayList(); // Krijon një List të thjeshtë (pa specifikim të tipit)
        Collection arrayList5 = new ArrayList(); // Krijon një Collection të thjeshtë (pa specifikim të tipit)

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1, "orange"); // Shton ngjyrën "orange" në pozitën 1


        System.out.println("\n*********************  1");
        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i)); // Shfaq çdo ngjyrë nga ArrayList nëpërmjet indeksit
        }


        System.out.println("\n*********************  2");
        for(String color: colors) {
            System.out.println(color); // Shfaq çdo ngjyrë nga ArrayList përmes for-each loop
        }


        System.out.println("\n*********************  3");
        colors.remove("orange"); // Hiq ngjyrën "orange"
        colors.remove(0); // Hiq ngjyrën në pozitën 0

        colors.forEach(color -> {
            System.out.println(color); // Shfaq ngjyrat përmes metodes forEach
        });


        System.out.println("\n*********************  4");
        for(int i = 0; i < colors.size(); i++) {
            colors.remove(i); // Hiq të gjitha ngjyrat duke përdorur një for loop (kjo metodë nuk është e saktë)
        }
        System.out.println(colors); // Shfaq ArrayList pasi janë hequr të gjitha ngjyrat

        //metoda qe na ndimon ti fshim gjith elementet eshte clear();
        //colors.clear();

//        for(String color: colors) {
//            colors.remove(color);
//        }
//        System.out.println(colors);

        System.out.println("\n*********************  5");
        Object[] colorObjArray = colors.toArray(); // Kthe ArrayList në një array të thjeshtë
        String[] colorArray = colors.toArray(new String[0]); // Kthe ArrayList në një array String

        System.out.println("aaa " +Arrays.toString(colorArray));
        System.out.println("aaa " +Arrays.toString(colorObjArray));

        String[] shapes = new String[]{"square", "circle", "triangle"};
        // Krijon një LIST nga një array ekzistues
        List shapeList = Arrays.asList(shapes);
        System.out.println("ShapeList: " + shapeList);

        System.out.println("Emri i klases se listes shapeList: "+ shapeList.getClass().getName()); // Shfaq emrin e klasës së listës
        System.out.println("Emri i klases se listes colors: "+colors.getClass().getName()); // Shfaq emrin e klasës së ArrayList

        // System.out.println(shapes); nxjer adresen
        System.out.println(Arrays.toString(shapes));
        System.out.println(shapeList);


        System.out.println("\n*********************  6");

        //shapeList2 është një listë e përcaktuar me List.of(shapes), e cila krijohet si një listë e pa ndryshueshme
        // (immutable). Në këtë rast, nuk mund të shtoni ose ndryshoni elementet ekzistuese të kësaj liste.
        List shapeList2 = List.of(shapes);
        // shapeList2.add("rectangle"); // do të hasni një gabim gjatë ekzekutimit sepse listat immutable nuk lejojnë shtimin e elementeve.
        // shapeList2.add(1,"error");
        System.out.println(shapeList2);

        //krijojm nje list dhe e mbushim me elementet e shapes, kjo eshte nje array e ndryshushme mund te shtojm element dhe te heqim
        List<String> shapeList3 = new ArrayList<>();
        for(String shape: shapes) {
            shapeList3.add(shape); // Shto të gjitha shape në shapeList3
        }
        shapeList3.add("END");
        System.out.println(shapeList3);

        System.out.println("\n*********************  7");
        Object[] shapes2 = shapeList3.toArray(); // Kthe ArrayList në një array të thjeshtë
        System.out.println(Arrays.toString(shapes2));

        System.out.println("\n*********************  8");
        LinkedList<String> orders = new LinkedList<>(); // Krijo një LinkedList për porositë
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("fillimi"); // Shto porosinë e parë në fillim të listës
        orders.addLast("fundi"); // Shto porosinë e fundit në fund të listës
        System.out.println(orders);
        orders.removeFirst(); // Hiq porosinë e parë
        orders.removeLast(); // Hiq porosinë e fundit
        System.out.println(orders);


        System.out.println("\n*********************  9");
        List numberList = new ArrayList(); // Krijo një ArrayList të numrave
        numberList.add(10);
        numberList.add(5);
        numberList.add(1);
        numberList.add(3);
        numberList.add(9);

        System.out.println(numberList);
        Collections.sort(numberList); // Rendit numrat në rend rritës
        System.out.println(numberList);

        //MOS I BEJ KETO
//
        System.out.println("\n\n\n\n\n*********************  10");
        List<U3_Mountain> mountains = new ArrayList<>(); // Krijo një ArrayList për objekte të klasës Mountain
        mountains.add(new U3_Mountain("Everest", 8848));//Himal china
        mountains.add(new U3_Mountain("Matterhorn", 4478));//alpe matahornn
        mountains.add(new U3_Mountain("K2", 8611));// paksitan

        // Rendit mjetet në mënyrë që të përdorë compareTo të Mountain qe implementon Comparable
        Collections.sort(mountains);

        for (U3_Mountain mountain : mountains) {
            System.out.println(mountain.getName());
        }

//        System.out.println(mountains.stream().
//                map(U3_Mountain::getName).
//                collect(Collectors.toList()));


        System.out.println("*********************  11");
        Comparator<U3_Mountain> mountainComparator = new Comparator<U3_Mountain>() {
            @Override
            public int compare(U3_Mountain o1, U3_Mountain o2) {
                return o2.getHeight() - o1.getHeight();
            }
        };

        // Krijo një komparator për të renditur në mënyrë të kundërt
        Collections.sort(mountains, mountainComparator);
        for (U3_Mountain mountain : mountains) {
            System.out.println(mountain.getName());
        }

//        System.out.println(mountains.stream().
//                map(U3_Mountain::getName).
//                collect(Collectors.toList()));

//        Comparator<U3_Mountain> mountainComparator2 = (m1, m2) ->
//                m2.getHeight() - m1.getHeight();


    }

}
