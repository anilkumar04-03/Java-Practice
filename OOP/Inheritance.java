
class Base {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am now a constructor ");
    }
}

class Derived extends Base {

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal {

    String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}

class Dog extends Animal {

    String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Base base = new Base();

        base.setX(4);
        System.out.println(base.getX());

        Derived derived = new Derived();

        derived.setY(13);
        System.out.println(derived.getY());

        Animal animal = new Animal();

        animal.setX("I am an Animal");
        System.out.println(animal.getX());

        Dog dog = new Dog();
        dog.setX("The Dog Barks");
        System.out.println(dog.getX());
    }
}
