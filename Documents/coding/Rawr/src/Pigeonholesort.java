import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pigeonholesort {
    private int[] arr;
    private int range;
    private int max;
    private int min;

    private int[] sorted;
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int[] getSorted() {
        return Arrays.stream(sorted).filter(num -> num != 0).toArray();
    }

    private int getmin(){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private int getmax(){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public Pigeonholesort(int[] arr){
        this.arr = arr;
        this.max = getmax();
        this.min = getmin();
        this.range = max - min + 1;
        this.sorted = sortArr();
    }

    private int[] sortArr(){
        int[] sorted = new int[max-min+1];
        for (int i = 0; i < this.arr.length; i++) {
            sorted[this.arr[i] - this.min] = this.arr[i];
        }
        return sorted;
    }

    public static int[] randomArray(){
        int[] arr = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        //ein Array mit durchgemischten Zahlen
        int[] arr = randomArray();
        System.out.println(Arrays.toString(arr));
        Pigeonholesort pigeonholesort = new Pigeonholesort(arr);
        System.out.println(Arrays.toString(pigeonholesort.getSorted()));

    }
}

