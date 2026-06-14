public class VarArgs {

    static int sum(int x, int... arr) {

        int result = x;

        for (int a : arr) {
            result += a;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("The Sum of 1 is: " + sum(1));
        System.out.println("The Sum of 4 and 6 is: " + sum(4, 6));
        System.out.println("The Sum of 4, 2 and 6 is: " + sum(4, 2, 6));
        System.out.println("The Sum of 4, 6, 7 and 6 is: " + sum(4, 6, 7, 6));
    }
}
