package U01_java_collections.GenericeAndWildcard.Animals;

public class Cat extends Animal implements  BehaviorAnimal {
    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void performBehavior() {
        System.out.println("The cat is purring..."); //macja parink gervisht
    }

}
