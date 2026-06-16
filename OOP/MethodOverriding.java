
class Animal {

    public void makeSound() {
        System.out.println("Animals make sounds");
    }

    public void eat() {
        System.out.println("Animals eat food");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.makeSound();
        animal.eat();

        Dog dog = new Dog();

        dog.makeSound();
        dog.eat();
    }
}
