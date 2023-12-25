package U01_java_collections;
import java.util.*;

public class QueueMain {
    public static void main(String[] args) {

         arrayDequeOperations();  // Thirrja e funksionit arrayDeque() për të demonstruar përdorimin e ArrayDeque.
         priorityQueueOperations();
         linkedListOperations();

        //  queue();
        //  list();
    }


    private static void arrayDequeOperations() {
        ArrayDeque arrayDeque = new ArrayDeque(); // Krijimi i një instance të ArrayDeque.

        // Shtimi i elementeve në radhë (queue).
        arrayDeque.add("E1");
        arrayDeque.add("E2");
        arrayDeque.add("E3");
        arrayDeque.add("E4");
        arrayDeque.add("E5");
        arrayDeque.add("E6");

        System.out.println("************************  1");
        System.out.println(arrayDeque);
        arrayDeque.offerFirst("fillimi"); // Shtimi i elementit në fillim të deque.
        arrayDeque.offer("22"); // Shtimi i elementit në fund të deque.
        arrayDeque.offerLast("fundi"); // Shtimi i elementit në fund të deque.
        System.out.println(arrayDeque);

        System.out.println("************************  2");
        System.out.println(arrayDeque.element()); // Marrja e elementit të parë pa e larguar nga radha.
        System.out.println(arrayDeque.getFirst()); // Marrja e elementit të parë.
        System.out.println(arrayDeque.getLast()); // Marrja e elementit të fundit.

        System.out.println("************************  3");
        System.out.println(arrayDeque.peek()); // Marrja e elementit të parë pa e larguar nga radha.
        System.out.println(arrayDeque.peekFirst()); // Marrja e elementit të parë.
        System.out.println(arrayDeque.peekLast()); // Marrja e elementit të fundit.

        System.out.println("************************  4");
        Object largimi = arrayDeque.poll(); // Largimi i elementit të parë nga radha.
        Object largim1 = arrayDeque.pop(); //  Largimi i elementit të parë nga radha.
        System.out.println(largimi);
        System.out.println(largim1);

        System.out.println("************************  5");
        int madhesiaQueue = arrayDeque.size(); // Verifikimi i madhësisë së deque.
        System.out.println(madhesiaQueue); // Shfaqja e madhësisë së deque pas veprimeve të tjera.

        System.out.println(arrayDeque); // Shfaqja e gjendjes së ArrayDeque në fund të funksionit.

        System.out.println("*********************************************************************");
    }

    private static void priorityQueueOperations() {
        // Krijimi i një instance të PriorityQueue.
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Shtimi i elementeve në PriorityQueue.
        priorityQueue.add("E1");
        priorityQueue.add("E2");
        priorityQueue.add("E3");
        priorityQueue.add("E4");
        priorityQueue.add("E5");
        priorityQueue.add("E6");

        System.out.println("************************  1");
        System.out.println(priorityQueue); // Shfaqja e gjendjes së PriorityQueue pas shtimit të elementeve.

        // Marrja dhe largimi i elementit të parë nga radha.
        System.out.println("************************  2");
        String firstElement = priorityQueue.poll();
        System.out.println("Elementi i parë: " + firstElement);
        System.out.println(priorityQueue); // Shfaqja pas largimit të elementit të parë.

        // Marrja e elementit të parë pa e larguar nga radha.
        System.out.println("************************  3");
        String peekedElement = priorityQueue.peek();
        System.out.println("Elementi i parë (peek): " + peekedElement);
        System.out.println(priorityQueue); // Shfaqja e gjendjes pas marrjes së elementit pa e larguar atë.

        // Verifikimi i madhësisë së PriorityQueue.
        System.out.println("************************  4");
        int size = priorityQueue.size();
        System.out.println("Madhësia e PriorityQueue: " + size);

        // Konvertimi i PriorityQueue në një array.
        System.out.println("************************  5");
        Object[] arrayFromQueue = priorityQueue.toArray();
        System.out.println("Array nga PriorityQueue: ");
        for (Object element : arrayFromQueue) {
            System.out.println(element);
        }

        arrayFromQueue[3]=22;
        //arrayFromQueue.add("E5");
        priorityQueue.add("E5");
        System.out.println(Arrays.toString(arrayFromQueue));
        System.out.println(priorityQueue);

        System.out.println("*********************************************************************");

    }

    private static void linkedListOperations() {
        LinkedList linkedList = new LinkedList();
        // Shtimi i elementeve në fund të listës
        linkedList.add("E1");
        linkedList.add("E2");
        linkedList.add("E3");
        linkedList.add("E4");
        linkedList.add("E5");
        linkedList.add("E6");

        System.out.println("************************  1");
        // Shtimi i elementeve në fillim të listës
        linkedList.addFirst("E fillim");
        linkedList.addLast("E fundit");
        System.out.println(linkedList);
        // Shfaqja e listës pas shtimit të elementeve në fillim dhe në fund

        System.out.println("************************  2");
        // Fshirja e elementit të parë dhe të fundit
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        // Shfaqja e listës pas fshirjes së elementit të parë dhe të fundit

        System.out.println("************************  3");
        // Fshirja e elementit në një pozicion të caktuar
        linkedList.remove(1);
        System.out.println(linkedList);
        // Shfaqja e listës pas fshirjes së elementit në pozicionin 1

        System.out.println("************************  4");
        // Gjetja e madhësisë së listës
        System.out.println("linked list ka: " + linkedList.size() + " elemente");
        // Shfaqja e madhësisë së listës

        System.out.println("************************  5");
        // Përdorimi i iteratorit për të lëvizur nëpër elemente
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Për shfaqje të gjithë elementeve të listës duke përdorur iteratorin

        System.out.println("*********************************************************************");

    }



    private static void queue() {
        Queue queue = new LinkedList();

        // Shtimi i elementeve në radhë (queue)
        queue.add("E1");
        queue.add("E2");
        queue.add("E3");
        queue.add("E4");
        queue.add("E5");
        queue.add("E6");

        // Marrja e elementit të parë pa e larguar nga radha
        Object prani = queue.peek();

        // Largimi i elementit të parë nga radha
        Object largimi = queue.poll();

        // Verifikimi i madhësisë së queues
        int madhesiaQueue = queue.size();
    }
    private static void list() {
        List list = new LinkedList();

        // Shtimi i elementeve në listë
        list.add("E1");
        list.add("E2");
        list.add("E3");
        list.add("E4");
        list.add("E5");
        list.add("E6");

        // Fshirja e elementit nga lista
        list.remove(0);
        System.out.println(list);

        // Marrja e elementit në një pozicion të caktuar
        Object elementi = list.get(0);
        System.out.println(elementi);

        // Verifikimi i madhësisë së listës
        int madhesiaLista = list.size();
        System.out.println(madhesiaLista);
    }
}
