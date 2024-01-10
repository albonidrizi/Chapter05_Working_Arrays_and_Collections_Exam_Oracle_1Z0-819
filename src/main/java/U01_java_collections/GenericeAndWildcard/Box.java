package U01_java_collections.GenericeAndWildcard;

import U01_java_collections.GenericeAndWildcard.Animals.Animal;
import U01_java_collections.GenericeAndWildcard.Animals.BehaviorAnimal;



// Definimi i një klase të përgjithshme të quajtur "Box" me një tip generic "T"

// Ne kete rast T është një parameter gjenerik i cili është i kufizuar (extends) për të qenë një lloj i Dog
// dhe një lloj i një "BehaviorAnimal" (në këtë rast për një interfajs). Kjo do të thotë se T mund të jetë një
// klasë që trashëgon nga Dog dhe implementon një interface të caktuar.
public class Box<T /* extends Animal & BehaviorAnimal */> {
    private T obj; // Deklarimi i një variabël private të tipit generic T


    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}