import java.util.Arrays;
import java.util.Random;

/**
 * The type Array methoden.
 */
public class ArrayMethoden {
    /**
     * Zufalls array int [ ].
     *
     * @param anzahlstellen the anzahlstellen
     * @return the int [ ]
     */
    public static int[] zufallsArray(int anzahlstellen){
        int[] zufallsarray = new int[anzahlstellen];
        for (int i = 0; i < zufallsarray.length; i++) {
            zufallsarray[i] = new Random().nextInt(anzahlstellen * 2)+1;
        }
        return zufallsarray;
    }

    /**
     * Array to text string.
     *
     * @param array the array
     * @return the string
     */
    public static String arrayToText(int[] array){
        StringBuilder text = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            text.append(array[i]);
            if(i < array.length - 1){
                text.append(",");
            }
        }
        return text.toString();
    }

    /**
     * Array füllen int [ ].
     *
     * @param array the array
     * @param zahl  the zahl
     * @return the int [ ]
     */
    public static void fillArray(int[] array, int zahl) {
        Arrays.fill(array, zahl);
        //return array;
    }

    /**
     * Array füllen mit zufallszahlen int [ ].
     *
     * @param array the array
     * @param min   the min
     * @param max   the max
     * @return the int [ ]
     */
    public static int[] fillZufallArray(int[] array, int min, int max) {
        Arrays.fill(array, new Random().nextInt(max - min + 1) + min);
        return array;
    }

    /**
     * Swap int [ ].
     *
     * @param array  the array
     * @param index1 the first index
     * @param index2 the second index
     * @return the int [ ]
     */
    public static int[] vertausche(int[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            return array;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    /**
     * Kopiere int [ ].
     * @param array the array
     * @return the int [ ]
     */
    public static int[] kopiere(int[] array) {
        int[] kopie = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            kopie[i] = array[i];
        }
        return kopie;
    }

    /**
     * Kopiere 2 d int [ ] [ ].
     *
     * @param array the array
     * @return the int [ ] [ ]
     */

    public static int[][] kopiere2D(int[][] array) {
        int[][] kopie = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                kopie[i][j] = array[i][j];
            }
        }
        return kopie;
    }
}

