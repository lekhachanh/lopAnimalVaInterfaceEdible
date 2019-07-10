import Animal.Animal;
import Animal.Chicken;
import Animal.Tiger;
import Edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals [0] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
