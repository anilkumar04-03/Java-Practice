import java.util.*;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you're going to be an adult!");
                break;
            case 25:
                System.out.println("you're going to getting a job!");
                break;
            case 30:
                System.out.println("you're going to marry!");
                break;
            case 50:
                System.out.println("you're going to retire!");
                break;
            default:
                System.out.println("enjoy your life");

        }
        System.out.println("Thankyou for using our Service");
        sc.close();
    }
}
