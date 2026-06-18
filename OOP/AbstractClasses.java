abstract class Parent {

    public void parent() {
        System.out.println("I am a method of Parent class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public abstract void greet();

    public abstract void greet2();
}

class Child extends Parent {

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class AnotherChild extends Parent {

    public void display() {
        System.out.println("I am good");
    }
}

public class AbstractClasses {

    public static void main(String[] args) {

        Child child = new Child();

        child.parent();
        child.sayHello();
        child.greet();
        child.greet2();
    }
}