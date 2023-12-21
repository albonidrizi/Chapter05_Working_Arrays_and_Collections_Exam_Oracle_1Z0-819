package U01_java_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String... args) {
        // Krijimi i dy set-ve, njëri është HashSet dhe tjetri është TreeSet.
        Set<Integer> primeNumbers1 = new HashSet<>();
        Set<Integer> primeNumbers2 = new TreeSet<>();

        // Shtimi i disa numrave të plotë në set-in primeNumbers1.
        primeNumbers1.add(71);
        primeNumbers1.add(61);
        primeNumbers1.add(41);
        primeNumbers1.add(1);

        // Shtimi i tych numrave të plotë në set-in primeNumbers2.
        primeNumbers2.add(71);
        primeNumbers2.add(61);
        primeNumbers2.add(41);
        primeNumbers2.add(1);

        // Shfaqja e të gjithë elementeve të set-it primeNumbers1.
        primeNumbers1.forEach(System.out::println);
        System.out.println("");

        // Shfaqja e të gjithë elementeve të set-it primeNumbers2.
        primeNumbers2.forEach(System.out::println);

        // Shtimi i numrit 5 në set-in primeNumbers1 dhe shfaqja e rezultatit të shtimit.
        System.out.println(primeNumbers1.add(5));

        // Përpiqja për të shtuar përsëri numrin 5 në set-in primeNumbers1 dhe shfaqja e rezultatit të shtimit.
        // Këtu rezultati do të jetë 'false' pasi numri 5 është tashmë në set.
        System.out.println(primeNumbers1.add(5));

        // Heqja e numrit 5 nga set-i primeNumbers1.
        primeNumbers1.remove(5);

        // Kontrollon nëse set-i primeNumbers1 është bosh dhe shfaq rezultatin (true/false).
        System.out.println(primeNumbers1.isEmpty());

        // Shfaq numrin e elementeve në set-in primeNumbers1.
        System.out.println(primeNumbers1.size());
    }

}
