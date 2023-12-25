package U01_java_collections.Generice;

public class Box<T> {
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}