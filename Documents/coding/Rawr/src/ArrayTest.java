import java.util.Arrays;

/**
 * The type Array test.
 */
public class ArrayTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = ArrayMethoden.kopiere(arr);
        arr2[3] = 34;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println();


        int[][] arr3 = new int[][]{arr, arr2};
        int[][] arr4 = ArrayMethoden.kopiere2D(arr3);
        arr3[1][5] = 2384723;
        for(int[] i: arr3) System.out.println(Arrays.toString(i));
        System.out.println();

        for(int[] i: arr4) System.out.println(Arrays.toString(i));
    }
}
