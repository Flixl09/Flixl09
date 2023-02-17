/**
 * Klasse zur erstellung von Rechenobjekten mit Lösung und Toleranz
 *
 * @author Felix Schmid
 * @version 22 /07/10
 */
public class Rechenaufgabe {
    private String rechnung;
    private double answer;
    private double toleranz = 0.0;
    private int punkte;
    
    /**
     * Gets punkte.
     *
     * @return the punkte
     */
    public int getPunkte() {
        return punkte;
    }

    /**
     * Sets punkte.
     *
     * @param punkte the punkte
     */
    public void setPunkte(int punkte) {
        if(punkte <= 0) return;
        this.punkte = punkte;
    }


    /**
     * Get rechnung string.
     *
     * @return die Rechnung
     */
    public  String getRechnung(){
        return rechnung;
    }

    /**
     * Setzt die Rechnung
     *
     * @param r die Rechnung
     * @return das Objekt
     */
    public Rechenaufgabe setRechnung(String r){
        this.rechnung = r;
        return this;
    }

    /**
     * Get answer double.
     *
     * @return Die Antwort1
     */
    public double getAnswer(){
        return answer;
    }

    /**
     * Set answer rechenaufgabe.
     *
     * @param a the a
     * @return the rechenaufgabe
     */
    public Rechenaufgabe setAnswer(double a){
        this.answer = a;
        return this;
    }

    /**
     * Get toleranz double.
     *
     * @return the double
     */
    public double getToleranz(){
        return toleranz;
    }

    /**
     * Set toleranz rechenaufgabe.
     *
     * @param t the t
     * @return the rechenaufgabe
     */
    public Rechenaufgabe setToleranz(double t){
        if (t>(this.answer/10)){
            System.err.println("!Achtung! Deine Toleranz darf nicht größer als " + this.answer/10 + " sein");
            System.exit(422); //HTML FEHLERCODE Unprocessable Entity
        }
        else this.toleranz = t;
        return this;
    }

    /**
     * Instantiates a new Rechenaufgabe.
     *
     * @param r the r
     * @param a the a
     */
    public Rechenaufgabe(String r, double a){
        this(r, a, 0);
    }

    /**
     * Instantiates a new Rechenaufgabe.
     *
     * @param r the r
     * @param a the a
     * @param t the t
     */
    public Rechenaufgabe(String r, double a, double t){
        this(r, a, t, 0);
    }

    /**
     * Instantiates a new Rechenaufgabe.
     *
     * @param r the r
     * @param a the a
     * @param t the t
     * @param p the p
     */
    public Rechenaufgabe(String r, double a, double t, int p){
        this.setAnswer(a);
        this.setRechnung(r);
        this.setToleranz(t);
        this.setPunkte(p);
    }

    /**
     * Check antwort boolean.
     *
     * @param d the d
     * @param t the t
     * @return the boolean
     */
    public boolean checkAntwort(double d, boolean t){
        if (t) return checkAntwort(d);
        return d == answer;
    }

    /**
     * Check antwort boolean.
     *
     * @param d the answer to check
     * @return the boolean
     */
    public boolean checkAntwort(double d) {
        return (d >= answer - toleranz) && (d <= answer + toleranz);
    }
    /**
     * Loesung string.
     *
     * @return the string
     */
    public String loesung(){
        return this.rechnung + " = " + this.answer + " (" + this.toleranz + " Toleranz)";
    }

    /**
     * Equals boolean.
     *
     * @param r the r
     * @return the boolean
     */
    public boolean equals(Rechenaufgabe r){
        return (this.rechnung.equals(r.rechnung)) & (this.answer == r.answer) & (this.toleranz == r.toleranz);
    }

    /**
     * To string array string [ ].
     *
     * @return the string [ ]
     */
    public String[] toStringArray() {
        return new String[]{this.rechnung, String.valueOf(this.answer), String.valueOf(this.toleranz)};
    }

    public Rechenaufgabe clone() {
        return new Rechenaufgabe(this.rechnung, this.answer, this.toleranz, this.punkte);
    }

    public boolean equals(Object o) {
        if (o instanceof Rechenaufgabe) {
            Rechenaufgabe r = (Rechenaufgabe) o;
            return (this.rechnung.equals(r.rechnung)) && (this.answer == r.answer) && (this.toleranz == r.toleranz) && (this.punkte == r.punkte);
        }
        return false;
    }
}
