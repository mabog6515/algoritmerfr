import java.util.Random;

public class assist {
    public static int[] lagTilfeldigListe(int lengde) {
        Random random = new Random();  // lager generator for tilfeldige tall
        int[] a = new int[lengde];     // oppretter array av ønsket lengde

        for (int i = 0; i < lengde; i++) {
            // nextInt(41) gir 0–40, så -20 gjør det -20 til +20
            a[i] = random.nextInt(41) - 20;
        }

        return a;
    }
    // gjør om til at den senere kan bruke alt og ikke bare int, med <T> when you can,
    // senere med den over også
    public static void skrivUt(int[] tabell, String kommentar){
        System.out.print(kommentar + ":\n\t| ");
        for (int i : tabell){
            System.out.print(i+" | ");
        }
        System.out.println();
    }

    public static void bytt(int[] tabell, int i, int j){ //bytter indekser
        int tmp = tabell[i];
        tabell[i] = tabell[j];
        tabell[j] = tmp;
    }
    public static boolean sortert(int[] tabell){
        for (int i : tabell){
            if (i > i+1) return false;
        }
        return true;
    }
}
