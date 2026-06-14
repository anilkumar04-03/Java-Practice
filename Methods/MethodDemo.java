
public class MethodDemo {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = (x + y) * 2;
        } else {
            z = x + y;
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 7;
        int b = 3;
        int c;
        // c = object.logic(a, b);
        c = logic(a, b);
        System.out.println(c);

        int a1 = 3;
        int b1 = 4;
        int c1;
        // c1 = object.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
