import java.util.ArrayList;
import java.util.List;

public class Figurenliste <A extends Figuren> {
    private A[] figurenliste;
    private int anzahl;

    public Figurenliste(int maxGroesse) {

        this.figurenliste = (A[]) new Figuren[maxGroesse];
        this.anzahl = 0;
}

    public void figurAnfuegen(A figur) {
        if (anzahl < figurenliste.length) {
            figurenliste[anzahl] = figur;
            anzahl++;
        } else {
            System.out.println("Die Figurenliste ist voll, es kann keine weitere Figur hinzugefügt werden.");
        }
    }

    public A letzteFigurAuslesen() {
        if (anzahl > 0) {
            return figurenliste[anzahl - 1];
        } else {
            System.out.println("Die Figurenliste ist leer.");
            return null;
        }
    }

    public void alleAnzeigen() {
        if (anzahl > 0) {
            for (int i = 0; i < anzahl; i++) {
                figurenliste[i].anzeigen();
            }
        } else {
            System.out.println("Keine Figuren in der Liste.");
        }
    }
}