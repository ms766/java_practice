import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println(a+" "+b);
        b++;
        System.out.println(a+" "+b);

        int[] arrOne = new int[3];
        arrOne[0] = 1;
        System.out.println(Arrays.toString(arrOne));

        System.out.println(Integer.MAX_VALUE);
    }
}