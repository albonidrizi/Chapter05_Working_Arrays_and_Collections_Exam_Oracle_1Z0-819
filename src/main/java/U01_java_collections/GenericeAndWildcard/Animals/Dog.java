package U01_java_collections.GenericeAndWildcard.Animals;

import U01_java_collections.GenericeAndWildcard.Animals.Animal;
import U01_java_collections.GenericeAndWildcard.Animals.BehaviorAnimal;

public class Dog extends Animal implements BehaviorAnimal {
    public Dog(String name,int age) {
        super(name, age);
    }

    @Override
    public void performBehavior() {
        System.out.println("The dog is barking...");
    }

    
}
