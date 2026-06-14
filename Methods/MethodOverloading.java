
public class MethodOverloading {

    static void foo() {
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning bro " + a + " times");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning bro " + a + " times");
        System.out.println("Good morning bro " + b + " times");
    }

    public static void main(String[] args) {

        foo();
        foo(200);
        foo(2000, 3000); // Actual arguments
    }
}
