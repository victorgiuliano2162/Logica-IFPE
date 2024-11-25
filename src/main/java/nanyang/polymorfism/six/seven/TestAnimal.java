package nanyang.polymorfism.six.seven;

public class TestAnimal {
    public static void main(String[] args) {

        // Using the subclasses
        Cat cat1 = new Cat("Homero");
        cat1.greets();
        Dog dog1 = new Dog("Spike");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Luke");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("Esmeralda");
        animal1.greets();
        Animal animal2 = new Dog("Caramelo");
        animal2.greets();
        Animal animal3 = new BigDog("Brutus");
        animal3.greets();
        //Animal animal4 = new Animal("Vultre");
        //abstract class can't be instantiated

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);

    }
}
