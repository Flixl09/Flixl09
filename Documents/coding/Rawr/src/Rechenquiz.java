import java.util.Arrays;
import java.util.Random;

/**
 * The type Rechenquiz.
 */
public class Rechenquiz {
    private int erreichtePunkte;
    private int erreichbarePunkte;
    /**
     * The Rechenaufgaben.
     */
    public Rechenaufgabe[] rechenaufgaben;

    /**
     * Instantiates a new Rechenquiz.
     */
    public Rechenquiz() {
        this(10);
    }

    /**
     * Instantiates a new Rechenquiz.
     *
     * @param anzahlAufgaben the anzahl aufgaben
     */
    public Rechenquiz(int anzahlAufgaben) {
        erreichtePunkte = 0;
        erreichbarePunkte = 0;
        rechenaufgaben = new Rechenaufgabe[anzahlAufgaben];
    }

    /**
     * Gets erreichte punkte.
     *
     * @return the erreichte punkte
     */
    public int getErreichtePunkte() {
        return erreichtePunkte;
    }

    /**
     * Gets erreichbare punkte.
     *
     * @return the erreichbare punkte
     */
    public int getErreichbarePunkte() {
        return erreichbarePunkte;
    }

    /**
     * Reset.
     */
    public void reset() {
        erreichtePunkte = 0;
        erreichbarePunkte = 0;
    }

    /**
     * Neue rechnung boolean.
     *
     * @param rechenaufgabe the rechenaufgabe
     * @return the boolean
     */
    public boolean neueRechnung(Rechenaufgabe rechenaufgabe) {
        for (int i = 0; i < rechenaufgaben.length && rechenaufgabe == null; i++) {
            if (rechenaufgaben[i] == null) {
                rechenaufgaben[i] = rechenaufgabe;
                return true;
            }
        }
        return false;
    }

    /**
     * Neue rechnung boolean.
     *
     * @param rechnung the rechnung
     * @param antwort  the antwort
     * @param toleranz the toleranz
     * @param punkte   the punkte
     * @return the boolean
     */
    public boolean neueRechnung(String rechnung, int antwort, int toleranz, int punkte) {
        return neueRechnung(new Rechenaufgabe(rechnung, antwort, toleranz, punkte));
    }

    /**
     * Zufalls rechnung string.
     *
     * @return the string
     */
    public String zufallsRechnung() {
        Random random = new Random();
        int index = random.nextInt(rechenaufgaben.length);
        if (rechenaufgaben[index].getRechnung() == null) {
            return "KEINE RECHENAUFGABE DA LOL";
        }
        return rechenaufgaben[index].getRechnung();
    }

    /**
     * Check ergebnis boolean.
     *
     * @param rechnung the rechnung
     * @param antwort  the antwort
     * @return the boolean
     */
    public boolean checkErgebnis(String rechnung, int antwort) {
        for (Rechenaufgabe rechenaufgabe : rechenaufgaben) {
            if (rechenaufgabe != null && rechenaufgabe.getRechnung().equals(rechnung)) {
                if (rechenaufgabe.checkAntwort(antwort)) {
                    erreichtePunkte += rechenaufgabe.getPunkte();
                    erreichbarePunkte += rechenaufgabe.getPunkte();
                    return true;
                } else {
                    erreichbarePunkte += rechenaufgabe.getPunkte();
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Delete.
     *
     * @param rechnung the rechnung
     */
    public void delete(String rechnung) {
        for (int i = 0; i < rechenaufgaben.length; i++) {
            if (rechenaufgaben[i] != null && rechenaufgaben[i].getRechnung().equals(rechnung)) {
                rechenaufgaben[i] = null;
            }
        }
    }

    /**
     * Sets minimum toleranz.
     *
     * @param toleranz the toleranz
     */
    public void setMinimumToleranz(int toleranz) {
        for (Rechenaufgabe rechenaufgabe : rechenaufgaben) {
            if (rechenaufgabe != null && rechenaufgabe.getToleranz() > toleranz) {
                rechenaufgabe.setToleranz(toleranz);
            }
        }
    }

    /**
     * Punkte stand string.
     *
     * @return the string
     */
    public String punkteStand() {
        return "Erreichte Punkte: " + erreichtePunkte + " von " + erreichbarePunkte;
    }

    /**
     * Quiz text string.
     *
     * @return the string
     */
    public String quizText() {
        String text = punkteStand() + " ";
        for (Rechenaufgabe rechenaufgabe : rechenaufgaben) {
            if (rechenaufgabe != null) {
                text += rechenaufgabe.getRechnung() + " = " + rechenaufgabe.getAnswer() + " (" + rechenaufgabe.getPunkte() + " Punkte); ";
            }
        }
        return text;
    }

    /**
     * Equals
     *
     * @param o Object to compare
     * @return true if equals
     */
    public boolean equals(Object o) {
        if (o instanceof Rechenquiz) {
            Rechenquiz r = (Rechenquiz) o;
            return (Arrays.equals(this.rechenaufgaben, r.rechenaufgaben)) && (this.erreichbarePunkte == r.getErreichbarePunkte()) && (this.erreichtePunkte == r.getErreichtePunkte());
        }
        return false;
    }

    /**
     * Clone
     *
     * @return Cloned
     */
    public Rechenquiz clone() {
        Rechenquiz neu = new Rechenquiz(this.rechenaufgaben.length);
        return neu;
    }
}
