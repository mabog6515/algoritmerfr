public class SelectBubbleInsertSort {
    public static void selectionsort(int[] a){
    // https://www.youtube.com/watch?v=g-PGLbMth_g
        for (int i=0; i < a.length-1; i++){
            int minstePosisjon=i;
            for (int j = i+1; j < a.length; j++){ //min() fra minmax
                if (a[j] < a[minstePosisjon]) minstePosisjon = j;
            }
            assist.bytt(a,i, minstePosisjon);
        }
    }
    public static void bubblesort(int[] a){
        while(invensjoner(a)!=0) {
            for (int i = 0; i < a.length - 1; i++) {
                int j = i+1;
                if (a[i] > a[j]) { //sjekker for invensjoner
                    assist.bytt(a, i, j); //flipper invensjonen så den ikke lenger er en invensjon
                }
            }
        }
    }
    public static int invensjoner(int[] a){
        int invensjoner = 0;
        for (int i=0; i < a.length-1; i++){
            int j= i+1;
            if (a[i] > a[j]) invensjoner++; //sjekker for feilsortert (invensjon)
        }
        return invensjoner;
    }
    public static void insertionsort(int[] a){
        for (int i=1; i<a.length; i++){
            if (a[i-1]>a[i]){
                while(i > 0 && a[i-1]>a[i]){
                    assist.bytt(a,i,i-1);
                    i--;
                }
            }
        }
    }
}
