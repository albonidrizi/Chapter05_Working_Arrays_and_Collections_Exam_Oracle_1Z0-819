import java.util.*;

public class linkedin {

    public static void main(String[] args) {
        List[] a ={
                new ArrayList<>(),
                new LinkedList<>(),
                new Stack<>(),
                new Vector<>()
        };

        // Vendosja e vlerave në secilën prej strukturave të listës a
        a[0].add("Vlera 1"); // ArrayList
        a[1].add(42); // LinkedList
        a[2].add(3.14); // Stack
        a[3].add(true); // Vector

        a[0].add(42);
        a[0].add(3.14);
        a[0].add(true);


        System.out.println(a[0].get(2));

    }
}
