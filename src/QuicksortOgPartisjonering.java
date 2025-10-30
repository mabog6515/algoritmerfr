public class QuicksortOgPartisjonering {
    public static boolean quicksort(int[] a){
        if (a.length==1 || a.length==0) return true;

        int pivot = a[a.length-1]; //setter pivot til siste
        int h = a.length-2; // nest siste / siste i usorterte delen
        int v = 0; // første

        while(v<h){

        }




        return true;
    }/*
    public static int medianOfThree(int[] a){
        int første = a[0];
        int midten = a[a.length/2];
        int siste = a[a.length-1];

        if (midten < første){
            int tmp = midten;
            midten = første;
            første = tmp;
        }
        if (midten > siste){
            int tmp = midten;
            midten = siste;
            siste = tmp;
        }
        if(første > siste){
            int tmp = første;
            første = siste;
            siste = tmp;
        }
        System.out.println("første: "+første+" midten: "+midten+" siste: "+siste);
        return midten;
    }*/
}
