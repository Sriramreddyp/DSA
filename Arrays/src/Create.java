import java.util.*;

public class Create {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(array));
        s.close();

        // All together

        String[] sArray = { "a", "b", "c" };
        System.out.println(Arrays.toString(sArray));
    }
}
