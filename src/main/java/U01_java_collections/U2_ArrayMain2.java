package U01_java_collections;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] a = {1,2,6,8,3,2,223};
        int[] b = {1,2,6,8,3,2,223};
        int[] c = new int[]{3,3,3,3,3,2,223,3,3,3};
        int[] d = new int[2];

        System.out.println("*************************  1");
// Arrays.sort(): Rendit elementet e vargut 'a' në rritje.

        Arrays.sort(a);
        for (int s: a){
            System.out.print(s); // Shfaq vargun e renditur 'a'.
        }

        System.out.println();
        System.out.println("*************************  2");
// Arrays.copyOf(): Krijon një kopje të vargut 'b' me gjatësi të caktuar.
        int[] copyOfB = Arrays.copyOf(b, b.length);
        System.out.println(Arrays.toString(copyOfB));

        System.out.println("*************************  3");
// Arrays.copyOfRange(): Krijon një kopje të vargut 'c' duke përzgjedhur një gamë të caktuar të elementeve.
        int[] copyOfRangeC = Arrays.copyOfRange(c, 2, 7);
        System.out.println(Arrays.toString(copyOfRangeC));

        System.out.println("*************************  4");
// Arrays.fill(): Plotëson të gjithë elementet e vargut 'd' me një vlerë të caktuar.
        System.out.println(Arrays.toString(d));
        Arrays.fill(d, 5);
        System.out.println(Arrays.toString(d));

        System.out.println("*************************  5");
// Arrays.toString(): Konverton vargun 'c' në një string dhe paraqet vlerat e tij.
        String stringC = Arrays.toString(c);
        System.out.println(stringC);

        System.out.println("*************************  6");
// Arrays.deepToString(): Për vargjet multidimensionale, konverton vargun 'c' në një string duke paraqitur elementet e tij në mënyrë të thellë.
        String deepStringC = Arrays.deepToString(new int[][]{c});
        System.out.println(deepStringC);

        System.out.println("*************************  7");
// Arrays.hashCode(): Kthen një vlerë hash për vargun 'd'.
        int hashCodeD = Arrays.hashCode(d);
        System.out.println(hashCodeD);

    }
}
