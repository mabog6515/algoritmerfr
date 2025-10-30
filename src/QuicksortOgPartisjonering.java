public class QuicksortOgPartisjonering {
    public static boolean quicksort(int[] a, int fra, int til){
        if (fra >= til) return true; // sjekker om det er en element eller mindre + base case : exit out of recursing infinitely

        int pivotVerdi = a[til]; //setter pivot til siste
        int h = til-1; // nest siste / siste i usorterte delen
        int v = fra; // første

        while(true){
            while( v<=h && a[v] < pivotVerdi) v++;
            while( v<=h && a[h] > pivotVerdi) h--;
            if (v>=h) break;
            assist.bytt(a, v,h);
            v++; h--;
        }

        assist.bytt(a,v,til); // putt pivot i riktig plass, til er siste

        //kall rekersiv på seg selv på de to mindre delene
        quicksort(a,fra,v-1);
        quicksort(a, v+1,til);

        return true;
    }
}
