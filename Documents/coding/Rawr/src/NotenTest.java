/**
 * The type Noten test.
 */
public class NotenTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//Test every method in Notenliste.java
    public static void main(String[] args) {
        Notenliste n = new Notenliste(1);
        System.out.println(n.notenliste());
        System.out.println(n.setNote(0, 1));
        System.out.println(n.setNote(1, 2));
        System.out.println(n.setNote(2, 3));
        System.out.println(n.setNote(3, 4));
        System.out.println(n.setNote(4, 5));
        System.out.println(n.setNote(5, 6));
        System.out.println(n.setNote(6, 7));
        System.out.println(n.setNote(7, 8));
        System.out.println(n.setNote(8, 9));
        System.out.println(n.setNote(9, 10));
        System.out.println(n.notenliste());
        System.out.println(n.addNote(1));
        System.out.println(n.addNote(2));
        System.out.println(n.addNote(3));
        System.out.println(n.addNote(4));
        System.out.println(n.addNote(5));
        System.out.println(n.addNote(6));
        System.out.println(n.addNote(7));
        System.out.println(n.addNote(8));
        System.out.println(n.addNote(9));
        System.out.println(n.addNote(10));
        System.out.println(n.notenliste());
        System.out.println(n.deleteNote(0));
        System.out.println(n.deleteNote(1));
        System.out.println(n.deleteNote(2));
        System.out.println(n.deleteNote(3));
        System.out.println(n.deleteNote(4));
        System.out.println(n.deleteNote(5));
        System.out.println(n.deleteNote(6));
        System.out.println(n.deleteNote(7));
        System.out.println(n.deleteNote(8));
        System.out.println(n.deleteNote(9));
        System.out.println(n.deleteNote(10));
        System.out.println();
        System.out.println(n.addNote(7));
        System.out.println(n.addNote(2));
        System.out.println(n.addNote(3));
        System.out.println(n.addNote(4));
        System.out.println(n.addNote(5));
        System.out.println(n.durchschnitt());
        System.out.println(n.notenliste());
    }
}
