package U01_java_collections;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] a = {1,2,6,8,3,2,223};
        int[] b = {1,2,6,8,3,2,223};
        int[] c = new int[]{3,3,3,3,3,2,223,3,3,3};
        int[] d = new int[2];


        //Arrays.sort(): Kjo metodë i rendit elementet e vargut në një rend që është në rritje.
        Arrays.sort(a);
        for (int s: a){
            System.out.print(s);
        }

        //Arrays.copyOf(): Krijon një kopje të vargut me gjatësi të caktuar.

        //Arrays.copyOfRange(): Krijon një kopje të vargut vetëm me një gamë të caktuar të elementeve.

        //Arrays.fill(): Plotëson të gjithë elementet e vargut me një vlerë të caktuar.

        //Arrays.equals(): Krahason përmbajtjen e dy vargjeve për të parë nëse janë të njëjta.

        //Arrays.toString(): Kthen vargun në formën e një stringu, duke paraqitur vlerat e vargut.

        //Arrays.asList(): Kthen vargun si një listë të thjeshtë.

        //Arrays.asList(T... a): Një version tjetër i Arrays.asList() që pranon një varg të caktuar të elementeve të tipit T dhe kthen një listë të përgjithshme.

        //Arrays.binarySearch(): Kërkon një vlerë të caktuar në varg duke përdorur kërkimin binar. Kjo metodë kërkon
        // vlerën në varg dhe kthen indeksin e saj nëse gjendet. Në rast të kundërt, kthen një numer negativ që tregon se vlera nuk është gjetur.

        //Arrays.toString(): Kjo metodë e konverton vargun në një string duke paraqitur elementet e tij. Kjo është e njëjta metodë si ajo që është përmendur më sipër.

        //Arrays.deepToString(): Për vargjet multidimensionale, kjo metodë e konverton vargun në një string duke paraqitur elementet e tij në mënyrë të thellë.

        //Arrays.hashCode(): Kthen një vlerë hash për vargun, e cila mund të përdoret për identifikimin e shpejtë të vargut në strukturat e të dhënave si tabela hash.

        //Arrays.parallelSort(): E njëjta si Arrays.sort(), por e përshtatur për të ekzekutuar renditjen në mënyrë paralele në vargje të mëdha në një ambient me disa threada.

        //Arrays.stream(): Kthen një stream të elementeve të vargut, duke e lejuar përpunimin e elementeve nëpërmjet operacioneve të stream-ave në Java 8 dhe më lart.

        //Arrays.mismatch(): Kthehet indeksi i parë ku dy vargje ndryshojnë. Nëse nuk gjendet asnjë ndryshim midis tyre, kthehet -1.



    }

    public static void arrays(){

        int[] a = {3,3,3,3,3,2,223,3,3,3};
        int[] b = {3,3,3,3,3,2,223,3,3,3};

        //a.equals(b) – Kthehet false. Në Java, kur krahasohen dy vargje me .equals(), ajo krahason referencat e objekteve, jo përmbajtjen e tyre.
        // Edhe pse a dhe b kanë të njëjta vlera, ato janë dy objekte të ndryshme, prandaj kthehet false.
        System.out.println(a.equals(b)); // false

        //a.length – Kthehet 10. length është një atribut i vargut në Java që tregon numrin e elementeve të vargut.
        System.out.println(a.length); // 10

        //a.toString() – Kthehet një string që përfaqëson adresën e vargut në memorie.
        // Formati i kthyer është kategoria@adresa, ku kategoria është tipi i objektit dhe adresa është adresa në memorie e objektit.
        System.out.println(a.toString());//[I@43a25848

        //a.clone() – Kthehet një kopje e re e vargut a. Metoda clone() e vargut në Java krijon dhe kthen një kopje të thellë të vargut.
        System.out.println(a.clone()); //[I@3ac3fd8b

        //Arrays.stream(a).toArray() – Kthehet një array i ri me të njëjtat vlera si a, por shfaqet si adresa në memorie e array të ri.
        System.out.println(Arrays.stream(a).toArray());//[I@71be98f5

        //a.hashCode() – Kthehet vlera e hashit e vargut a. Ky është një numer i caktuar nga Java që përdoret
        // për identifikim të shpejtë të objektit në një strukturë të dhënash si tabela hash.
        System.out.println(a.hashCode()); //1134712904

        //Arrays.stream(a).max() – Kthehet vlera maksimale në vargun a, përdorur si një OptionalInt. Në këtë rast, vlera maksimale është 223.
        System.out.println(Arrays.stream(a).max());//OptionalInt[223]

        //a.getClass() – Kthehet tipi i klasës së objektit a, që në këtë rast është class [I. Ky tip tregon për një array të tipit int.
        System.out.println(a.getClass());//class [I
    }
}
