package other;

import java.lang.reflect.Array;
import java.util.*;

public class AllCollection {
    public static void main(String[] args) {

        //Collection eshte parent i list, set, queue

        List arrayList  = new ArrayList();
        Collection vector  = new Vector();
        List linkedList  = new LinkedList();

        Queue linkedListQueue  = new LinkedList();
        Collection arrayDeque  = new ArrayDeque();
        Queue priorityQueue    = new PriorityQueue();

        Set hashSet  = new HashSet();
        Collection treeSet  = new TreeSet();
        //Kjo trashigohet nga HashSet
        Collection linkedHashSet  = new LinkedHashSet();


        // Map nuk trashigohet nga Collecion
        Map treeMap  = new TreeMap();
        Map hashMap  = new HashMap();
        //Kjo trashigohet nga HashMap
        Map linkedHashMap  = new LinkedHashMap();


    }
}
