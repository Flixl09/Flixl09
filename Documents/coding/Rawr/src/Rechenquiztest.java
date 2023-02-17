/**
 * Tests class Rechenquiz
 * @author Felix Schmid
 * @version 2022-01-12
 */

public class Rechenquiztest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Rechenquiz quiz = new Rechenquiz(10);
        quiz.neueRechnung(new Rechenaufgabe("1+1", 2, 0.2, 1));
        quiz.neueRechnung(new Rechenaufgabe("1+2", 3, 0.3, 1));
        quiz.neueRechnung(new Rechenaufgabe("1+3", 4, 0.4, 1));
        quiz.checkErgebnis("1+1", 2);
        quiz.checkErgebnis("1+2", 600);
        System.out.println("Erreichte Punkte: " + quiz.getErreichtePunkte());
        System.out.println("Erreichbare Punkte: " + quiz.getErreichbarePunkte());
    }

}
