package U01_java_collections;

public class Mountain implements Comparable<Mountain> {
    private String name;  // Variabla private për të mbajtur emrin e malit.
    private int height;   // Variabla private për të mbajtur lartësinë e malit.

    public Mountain(String n, int h){
        this.name = n;   // Konstruktori i klasës që inicializon vlerën e emrit dhe lartësisë së malit.
        this.height = h;
    }

    public int compareTo(Mountain o) {
        return this.height - o.height;  // Metoda për të krahasuar dy male sipas lartësisë së tyre.
    }

    public String getName() {
        return name;   // Metoda për të marrë emrin e malit.
    }

    public void setName(String name) {
        this.name = name;   // Metoda për të ndryshuar emrin e malit.
    }

    public int getHeight() {
        return height;   // Metoda për të marrë lartësinë e malit.
    }

    public void setHeight(int height) {
        this.height = height;   // Metoda për të ndryshuar lartësinë e malit.
    }

}