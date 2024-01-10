package U01_java_collections;

//S05_Arrays_and_Collections

import java.util.Arrays;

public class U1_ArrayMain {
    public static void main(String... args) {

            // Deklarimi dhe inicializimi i një vargu të tipit int me gjatësi 10
            int[] ids = new int[10];
            // Shfaqja e vlerës së elementit të parë të vargut, i cili është 0 (vlera default për int)
            System.out.println(ids[0]);


            // Deklarimi dhe inicializimi i një vargu të tipit String me disa stringje
            String[] instruments = new String[]{"guitar", "drums", "bass"};
            // Shfaqja e vlerës së elementit të parë të vargut të stringjeve, që është "guitar"
            System.out.println(instruments[0]);


            // Deklarime të ndryshme të vargjeve dhe matricave për demonstrim
            int [] ids2;
            int []ids3;
            int ids4[];
            int ids5 [];
            int[] ids6, ids7, ids8[];
            // []int error;

            // Shfaq gjatësinë e vargut instruments
            System.out.println(instruments.length);


            // Fillon një for loop për të inicializuar vlerat e vargut ids me vlerat i*i
            System.out.println("******************  1");
            for(int i = 0; i < ids.length; i++) {
                ids[i] = i * i;
                System.out.print(ids[i]); // Shfaq vlerat e vargut ids
            }
            System.out.println();


            // Shfaq vlerat e vargut instruments duke përdorur for-each loop
            System.out.println("******************  2");
            for(String instrument: instruments) {
                System.out.println(instrument);
            }


            // Rendit vargun e stringjeve në rend rritës duke përdorur Arrays.sort
            System.out.println("******************  3");
            Arrays.sort(instruments);
            // Shfaq vargun e renditur të stringjeve
            System.out.println(Arrays.toString(instruments));


            // Deklarimi dhe inicializimi i një vargu të tipit int me vlera të caktuara
            int[] fibArray = new int[] {0, 1, 5, 2, 3, 1, 8, 13};
            // Rendit vargun e numrave në rend rritës
            Arrays.sort(fibArray);


            System.out.println("******************  4");
            // Kërkon për vlerën 3 në varg dhe shfaq pozitën ku gjendet (në këtë rast, pozita 4)
            System.out.println(Arrays.binarySearch(fibArray, 3));


            System.out.println("******************  5");
            // Inicializimi i një matrice 3x3 dhe një matrice tjetër 3x10 për demonstrim
            int[][] multiArray = new int[3][3];
            String[][] multiArray2 = new String[3][10];

            // Inicializimi i një matrice me stringje për qytetet e Maqedonis
            String[][] macedoniaCitiesGrouped = new String[][]{
                    {"Shkupi", "Tetova", "Gostivari"},
                    {"Kumanova", "Kercova"},
                    {"Struga", "Dibra"},
            };


            // Shfaq qytetet duke përdorur for loop për të shkuar nëpër të dy dimensionet e matricës
            System.out.println("******************  6");
            for(int i = 0; i < macedoniaCitiesGrouped.length; i++) {
                for(int ii = 0; ii < macedoniaCitiesGrouped[i].length; ii++) {
                    System.out.println(macedoniaCitiesGrouped[i][ii]);
                }
            }


            // Shfaq qytetet përsëri duke përdorur for-each loop
        // për secilën rreshtë në matricë
            System.out.println("******************  7");
            for(String[] row : macedoniaCitiesGrouped) {
                for(String city : row) {
                    System.out.println(city);
                }
            }


            // Shfaq matricën e qytetet e maqedonis si string
            System.out.println("******************  8");
            System.out.println(Arrays.toString(macedoniaCitiesGrouped));
            System.out.println(Arrays.deepToString(macedoniaCitiesGrouped));


        System.out.println("******************  9");
            int[] array1 = new int[]{1,2,3,3};
            int[] array2 = new int[]{1,2,3,3};

        // A.equals(B) - ben krahasimin e adreses ne memory
        System.out.println(array1.equals(array2));//false

        //Arrays.equals(A,B) - ben krahasimin e elementeve te array
        System.out.println(Arrays.equals(array1,array2));//true

        /**
         * @Arrays.compare
         * array1 <  array2 output: -1
         * array1 == array2 output:  0
         * array1 >  array2 output:  1
         * **/
        System.out.println(Arrays.compare(array1,array2));//0

        /**
         * @Arrays.mismatch
         * array1 == array2 output: -1
         * array1 >  array2 output:  kthen index prej ku ndryshojn arayt mes njera tjetres
         * array1 <  array2 output:  kthen index prej ku ndryshojn arayt mes njera tjetres
         * **/
        System.out.println(Arrays.mismatch(array1,array2));//-1

        System.out.println("******************  10");
        //args perdoret per te mar inpute nga jasht njejt si scanner
        System.out.println(args[0]); //Bmw

        // Shfaq argumentet e dhëna në komandën e thirrjes së programit në formën e një stringu.
        System.out.println(Arrays.toString(args)); //[Bmw, Mercedes, Opel, Ferrari, Porsche, Masarati]


    }

}
