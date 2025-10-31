import javax.lang.model.type.NullType;
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
    public static void skrivUt(int[] liste, String kommentar){
        System.out.print(kommentar + ":\n\t| ");
        for (int i=0; i< liste.length;i++){
            System.out.print(liste[i]+" | ");
        }
        System.out.println();
    }

    public static void bytt(int[] tabell, int i, int j){ //bytter indekser
        int tmp = tabell[i];
        tabell[i] = tabell[j];
        tabell[j] = tmp;
    }
    public static boolean sortert(int[] tabell){
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) return false;
        }
        return true;
    }
}
