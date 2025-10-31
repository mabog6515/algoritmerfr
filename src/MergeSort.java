import java.util.NoSuchElementException;

public class MergeSort {
    public static int[] MergeSortedLists(int[] a, int[] b){
        if(!assist.sortert(a) || !assist.sortert(b)) throw new NoSuchElementException("a eller b er ikke sortert og kan ikke flettes");

        int[] resultat = new int[a.length+ b.length];
        int i=0, j=0, k=0; //vi jobber med 3 lister, så 3 forskjellige indekser

        while(i<a.length && j<b.length){
            if (a[i]< b[j]){
                resultat[k++] = a[i++];
            }
            else{
                resultat[k++] = b[j++];
            }
        }
        //nå er en av listene lengre enn den andre og for å få de til å printe sin rest
        while(i < a.length) resultat[k++] = a[i++];
        while(j < b.length) resultat[k++] = b[j++];

        return resultat;
    }
    public static int[] MergeSort(int[]a){
        if (a.length <= 1) return a.clone(); //smal nok til å være sortert

        int halve = a.length/2;
        int [] førsteHalv = new int[halve];
        int [] andreHalv = new int[a.length-halve];
        for (int i=0; i < halve; i++){
            førsteHalv[i] = a[i];
        }
        for (int i=0; i < a.length-halve; i++){
            andreHalv[i] = a[i+halve]; //+ halve så den tar den faktiske andre delen og ikke første igjen
        }

        førsteHalv = MergeSort(førsteHalv);
        andreHalv = MergeSort(andreHalv);
        return MergeSortedLists(førsteHalv,andreHalv);
    }
    public static int[] rotate(int[] a,int d){
        if (d > a.length-1) throw new NoSuchElementException("listen er ikke så lang");
        if (d==0) return a;

        //flip
        int v = 0;
        int h = a.length-1;
        flip(a,v,h);

        //flip venstre side (d)
        v=0;
        h=d-1;
        flip(a,v,h);

        //flipp resten
        v=d;
        h=a.length-1;
        flip(a,v,h);
        return a;
    }
    public static int[] flip(int[] a,int v, int h){
        while (v < h){
            assist.bytt(a,v,h); //bytter verdi på indeksene
            v++; h--;
        }
        return a;
    }
}
