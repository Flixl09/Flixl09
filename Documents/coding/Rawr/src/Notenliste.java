/*
 * Notenliste
 * @author: Felix Schmid
 * @version: 15-12-2022
 */
public class Notenliste{
    // Attribute
    private int[] noten;

    /**
     * Instantiates a new Notenliste.
     *
     * @param anzahl the anzahl
     */
    public Notenliste(int anzahl){
        if(anzahl<3){
            anzahl = 3;
        }
        this.noten = new int[anzahl];
        for(int i = 0; i < this.noten.length; i++){
            this.noten[i] = 0;
        }
    }

    /**
     * Check note and returns boolean.
     *
     * @param note the note
     * @return the boolean
     */
    public static boolean checkNote(int note){
        if(note >= 1 && note <= 5)return true;
        return false;
    }

    /**
     * Set note boolean.
     *
     * @param index the index
     * @param note  the note
     * @return the boolean
     */
    public boolean setNote(int index, int note){
        if(index < 0 || index >= this.noten.length)return false;
        if(!checkNote(note))return false;
        this.noten[index] = note;
        return true;
    }

    /**
     * Add note boolean.
     *
     * @param note the note
     * @return the boolean
     */
    public boolean addNote(int note){
        if(!checkNote(note))return false;
        for(int i = 0; i < this.noten.length; i++){
            if(!checkNote(this.noten[i])){
                this.noten[i] = note;
                return true;
            }
        }
        return false;
    }

    /**
     * Delete note boolean.
     *
     * @param index the index
     * @return the boolean
     */
    public boolean deleteNote(int index){
        if(index < 0 || index >= this.noten.length)return false;
        this.noten[index] = 0;
        return true;
    }

    /**
     * Durchschnitt returns double.
     *
     * @return the double
     */
    public double durchschnitt(){
        double sum = 0;
        int count = 0;
        for(int i: this.noten){
            if(!checkNote(i))continue;
            else{
                sum += i;
                count++;
            }
        }
        return sum/count;
    }

    /**
     * Notenliste string.
     *
     * @return the string
     */
    public String notenliste(){
        String s = "";
        int last = getLastIndex(this.noten);
        for(int i = 0; i < this.noten.length; i++){
            if(!checkNote(this.noten[i]))continue;
            s += String.valueOf(this.noten[i]);
            if(i != last)s += ", ";
            else s += " - " + durchschnitt();
        }
        return s;
    }

    /**
     * Gets Last Index
     * @param array
     * @return last index
     */
    private static int getLastIndex(int[] arr){
        int ak = 0;
        for(int i = 1; i < arr.length; i++){
            if(!checkNote(arr[i]))continue;
            else ak = i;
        }
        return ak;
    }

}