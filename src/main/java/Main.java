public class Main {
    public static void main(String[] args) {
        Figurenliste<Figuren> figurenListe = new Figurenliste<>(5); // Erstelle eine FigurenListe mit maximal 5 Figuren

        // Erstellen von verschiedenen Figuren
        Figuren kreis = new Figuren("Kreis");
        Figuren rechteck = new Figuren("Rechteck");
        Figuren dreieck = new Figuren("Dreieck");

        // Hinzufügen der Figuren zur Liste
        figurenListe.figurAnfuegen(kreis);
        figurenListe.figurAnfuegen(rechteck);
        figurenListe.figurAnfuegen(dreieck);

        // Anzeige der letzten hinzugefügten Figur
        Figuren letzteFigur = figurenListe.letzteFigurAuslesen();
        if (letzteFigur != null) {
            System.out.print("Letzte Figur: ");
            letzteFigur.anzeigen();
        }

        // Anzeigen aller Figuren
        System.out.println("Alle Figuren in der Liste:");
        figurenListe.alleAnzeigen();
    }
}
