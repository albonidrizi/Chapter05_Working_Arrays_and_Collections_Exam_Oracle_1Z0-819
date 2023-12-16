public class test1 {
    public static void main(String[] args) {
        int[] a = new int[40];
        a[3] = 22;
        System.out.println(a[39]); // Printon vlerën 22 në pozicionin 39 të array-it a

// Fusja e vlerave në të njëjtën array duke përdorur një cikël for dhe indeksin
        for (int i = 0; i < a.length; i++) {
            // Fus vlerën e dëshiruar në çdo pozicion të array-it
            a[i] = a[i] + 1; // Këtu jam përdorur një formulë e cila ndryshon vlerën në bazë të indeksit
        }

// Përdorimi i një cikli for për të printuar vlerat e ndryshuara të array-it a
        for (int aa : a) {
            System.out.println(aa);
        }

        System.out.println(a);
    }
}
