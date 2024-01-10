package U01_java_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class U5_SetMain {
    public static void main(String... args) {
        // Krijimi i dy set-ve, njëri është HashSet dhe tjetri është TreeSet.
        Set<Integer> primeNumbers1 = new HashSet<>();
        Set<Integer> primeNumbers2 = new TreeSet<>();

        // Shtimi i disa numrave të plotë në set-in primeNumbers1.
        primeNumbers1.add(71);
        primeNumbers1.add(61);
        primeNumbers1.add(41);
        primeNumbers1.add(1);
        //primeNumbers1.add(null);// HashSet lejon null kurse TreeSet nuk lejon

        // Shtimi i disa numrave të plotë në set-in primeNumbers2.
        primeNumbers2.add(71);
        primeNumbers2.add(61);
        primeNumbers2.add(41);
        primeNumbers2.add(1);
        //primeNumbers2.add(null);
        System.out.println("*********************  1");
        // Shfaqja e të gjithë elementeve të set-it primeNumbers1.
        System.out.println(primeNumbers1);


        System.out.println("*********************  2");
        // Shfaqja e të gjithë elementeve të set-it primeNumbers2.
        System.out.println(primeNumbers2);

        System.out.println("*********************  3");
        // Shtimi i numrit 5 në set-in primeNumbers1 dhe shfaqja e rezultatit të shtimit.
        System.out.println(primeNumbers1.add(5));
        System.out.println("A gjendet nr 1 ne set: " + primeNumbers1.contains(1)); // Kontrollojme nese set-i ka numerin 41


        System.out.println("*********************  4");
        // Përpiqja për të shtuar përsëri numrin 5 në set-in primeNumbers1
        // dhe shfaqja e rezultatit të shtimit.
        // Këtu rezultati do të jetë 'false' pasi numri 5 është tashmë në set.
        System.out.println(primeNumbers1.add(5));


        System.out.println("*********************  5");
        // Heqja e numrit 5 nga set-i primeNumbers1.
        System.out.println(primeNumbers1);
        primeNumbers1.remove(5);
        System.out.println(primeNumbers1);


        System.out.println("*********************  6");
        // Kontrollon nëse set-i primeNumbers1 është bosh dhe shfaq rezultatin (true/false).
        System.out.println(primeNumbers1.isEmpty());


        System.out.println("*********************  7");
        // Shfaq numrin e elementeve në set-in primeNumbers1.
        System.out.println(primeNumbers1.size());
        System.out.println(primeNumbers1.iterator().next());// e lexon nr e par nga lista


        System.out.println("*********************  8");
        Set<String> studentetSet = new TreeSet<>();
        studentetSet.add("Basri");
        studentetSet.add("Uran");
        studentetSet.add("Armend");
        for (Object a: studentetSet) {
            System.out.print(a +": ");
            System.out.println(a.hashCode());
        }

        System.out.println("\n*******************\n ");
        Set<String> studentet = new HashSet<>();
        studentet.add("Basri");
        studentet.add("Uran");
        studentet.add("Armend");
        for (Object a: studentet) {
            System.out.print(a +": ");
            System.out.println(a.hashCode());
        }
    }

}
