class Phone {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void on() {
        System.out.println("My name is Java");
    }
}

class SmartPhone extends Phone {
    public void welcome() {
        System.out.println("Welcome Sir");
    }

    @Override
    public void on() {
        System.out.println("Turning on Smartphone.....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone phone = new SmartPhone();
        SmartPhone smartPhone = new SmartPhone();

        phone.greet();
        phone.on();
        smartPhone.welcome();
    }
}
