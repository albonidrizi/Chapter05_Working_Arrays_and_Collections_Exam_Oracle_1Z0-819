import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    private static void sortAndSearch(String... args) {
        var one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one);
        System.out.println(result);
    }

    public static void main(String[] args) {
        sortAndSearch("seed", "flower");
    }
}
