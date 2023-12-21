package U01_java_collections;

public class Widget<T> {
    public static void main(String... args) {
        // Krijojmë një objekt të tipit Widget me tip të caktuar si String.
        Widget<String> widget = new Widget<>();
        widget.setType("hello"); // Vendosim vlerën e tipit të objektit si "hello".

        // Krijojmë dy objekte të tipit Widget pa specifikim të tipit.
        Widget widget2 = new Widget<>();
        Widget widget3 = new Widget();

        // Krijojmë një varg të tipit String me disa elemente.
        String[] strings = new String[]{"Hi", "There"};

        // Shfaqim elementin e parë të vargut duke përdorur metodën firstArrayElement të Widget.
        System.out.println(Widget.firstArrayElement(strings));
    }

    // Krijohet klasa Widget me një parametër generic T.
    private T type;

    // Metoda për të marrë vlerën e tipit T.
    public T getType() {
        return type;
    }

    // Metoda për të vendosur vlerën e tipit T.
    public void setType(T type) {
        this.type = type;
    }

    // Metoda statike për të marrë elementin e parë të një vargu të tipit T.
    public static <T> T firstArrayElement(T[] t) {
        // Nëse ka një element të parë, kthejen atë element.
        if (t.length > 0) {
            return t[0];
        }
        // Përndryshe, kthej null.
        return null;
    }

}
