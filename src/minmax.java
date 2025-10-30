import java.util.NoSuchElementException;

public class minmax {
    public static int min(int[] tabell){
        if (tabell.length==0) throw new NoSuchElementException("listen er tom");
        int min = tabell[0];
        for (int i: tabell) {
            if (i < min) min = i;
        }
        return min;
    }
    public static int max(int[] tabell){
        if (tabell.length==0) throw new NoSuchElementException("tabellen er tom");
        int max = tabell[0];
        for (int i=0; i < tabell.length; i++){
            if(tabell[i] > max) max = tabell[i];
        }
        return max;
    }
}
