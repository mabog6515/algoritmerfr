import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fortsett = true;
        while (fortsett) {
            int[] liste = assist.lagTilfeldigListe(10);
            assist.skrivUt(liste,"\nNy random liste (lengde : "+liste.length+") ");

            System.out.println("\n===== SORTERINGS-MENY =====");
            System.out.println("\t0 - min og max i lista                ❖ O(n)");
            System.out.println("\t1 - Selection Sort    ⌜in-place⌟      ❖ avg: O(n^2)");
            System.out.println("\t2 - Bubble Sort       ⌜in-place⌟      ❖ avg: O(n^2)");
            System.out.println("\t3 - Insertion Sort    ⌜in-place⌟      ❖ avg: O(n^2)");
            System.out.println("\t4 - Quick Sort        ⌜in-place⌟      ❖ avg: O(nlogn)");
            System.out.println("\t5 - Merge Sort        ⌞out-of-place⌝  ❖ avg: O(nlogn)");
            System.out.println("\t6 - Rotate                            ❖ O(n)");
            System.out.println("\t9 - EXIT");
            System.out.print("Velg algoritme: ");

            int valg = scanner.nextInt();
            switch (valg){
                case 0 -> System.out.println("minste verdi i lista er "+minmax.min(liste)+" mens den største er "+minmax.max(liste));
                case 1 -> SelectBubbleInsertSort.selectionsort(liste);
                case 2 -> SelectBubbleInsertSort.bubblesort(liste);
                case 3 -> SelectBubbleInsertSort.insertionsort(liste);
                case 4 -> QuicksortOgPartisjonering.quicksort(liste,0, liste.length-1);
                case 5 -> liste = MergeSort.MergeSort(liste);
                case 6 -> MergeSort.rotate(liste,scanner.nextInt());
                //exit out the loop
                case 9 -> {
                    fortsett = false;
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠒⠒⠢⢄⡀⠀⠀⢠⡏⠉⠉⠉⠑⠒⠤⣀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠙⢦⠀⡇⡇⠀⠀⠀⠀⠀⠀⠈⠱⡀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠊⠉⠉⠙⠒⢤⡀⠀⣼⠀⠀⢀⣶⣤⠀⠀⠀⢣⡇⡇⠀⠀⢴⣶⣦⠀⠀⠀⢳");
                    System.out.println("⠀⠀⠀⢀⣠⠤⢄⠀⠀⢰⡇⠀⠀⣠⣀⠀⠀⠈⢦⡿⡀⠀⠈⡟⣟⡇⠀⠀⢸⡇⡆⠀⠀⡼⢻⣠⠀⠀⠀⣸");
                    System.out.println("⠀⢀⠖⠉⠀⠀⠀⣱⡀⡞⡇⠀⠀⣿⣿⢣⠀⠀⠈⣧⣣⠀⠀⠉⠋⠀⠀⠀⣸⡇⠇⠀⠀⠈⠉⠀⠀⠀⢀⡏");
                    System.out.println("⣠⠏⠀⠀⣴⢴⣿⣿⠗⢷⡹⡀⠀⠘⠾⠾⠀⠀⠀⣿⣿⣧⡀⠀⠀⠀⢀⣴⠇⣇⣆⣀⢀⣀⣀⣀⣀⣤⠟");
                    System.out.println("⣿⠀⠀⢸⢻⡞⠋⠀⠀⠀⢿⣷⣄⠀⠀⠀⠀⠀⣠⡇⠙⢿⣽⣷⣶⣶⣿⠋⢰⣿⣿⣿⣿⣿⣿⠿⠛⠁");
                    System.out.println("⡿⡄⠀⠈⢻⣝⣶⣶⠀⠀⠀⣿⣿⣱⣶⣶⣶⣾⡟⠀⠀⠀⢈⡉⠉⢩⡖⠒⠈⠉⡏⡴⡏⠉⠉⠉⠉⠉⠉⠉⠉⡇⠀⠀⢀⣴⠒⠢⠤⣀");
                    System.out.println("⢣⣸⣆⡀⠀⠈⠉⠁⠀⠀⣠⣷⠈⠙⠛⠛⠛⠉⢀⣴⡊⠉⠁⠈⢢⣿⠀⠀⠀⢸⠡⠀⠁⠀⠀⠀⣠⣀⣀⣀⣀⡇⠀⢰⢁⡇⠀⠀⠀⢠");
                    System.out.println("⠀⠻⣿⣟⢦⣤⡤⣤⣴⣾⡿⢃⡠⠔⠒⠉⠛⠢⣾⢿⣿⣦⡀⠀⠀⠉⠀⠀⢀⡇⢸⠀⠀⠀⠀⠀⠿⠿⠿⣿⡟⠀⢀⠇⢸⠀⠀⠀⠀⠘");
                    System.out.println("⠀⠀⠈⠙⠛⠿⠿⠿⠛⠋⢰⡋⠀⠀⢠⣤⡄⠀⠈⡆⠙⢿⣿⣦⣀⠀⠀⠀⣜⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⢀⠃⠀⡸⠀⠇");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⡇⢣⠀⠀⠈⠛⠁⠀⢴⠥⡀⠀⠙⢿⡿⡆⠀⠀⢸⠀⢸⢰⠀⠀⠀⢀⣿⣶⣶⡾⠀⢀⠇⣸");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠹⡀⢇⠀⠀⠀⢀⡀⠀⠀⠈⢢⠀⠀⢃⢱⠀⠀⠀⡇⢸⢸⠀⠀⠀⠈⠉⠉⠉⢱⠀⠼⣾⣿⣿⣷⣦⠴");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢱⠘⡄⠀⠀⢹⣿⡇⠀⠀⠈⡆⠀⢸⠈⡇⢀⣀⣵⢨⣸⣦⣤⣤⣄⣀⣀⣀⡞⠀⣠⡞⠉⠈⠉⢣⡀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢃⠘⡄⠀⠀⠉⠀⠀⣠⣾⠁⠀⠀⣧⣿⣿⡿⠃⠸⠿⣿⣿⣿⣿⣿⣿⠟⠁⣼⣾⠀⠀⠀⠀⢠⠇");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠘⡄⠹⣀⣀⣤⣶⣿⡿⠃⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⢻⣿⣷⣦⣤⣤⠎⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠘⣤⣿⡿⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉");
                }
                default -> System.out.println("ugyldig alternativ"); //add gul trekant sign ASII?
            }
            if (valg==1 || valg==2 || valg==3 || valg==4 || valg==5 || valg==6){ //alt utenom EXIT + default
                assist.skrivUt(liste,"\nResultat");
            }
            if(valg==1 || valg==2 || valg==3 || valg==4 || valg==5) { //algoritme valgene
                if (assist.sortert(liste)) System.out.println("⌜liste sortert riktig!⌟");
                else System.out.println("⌜liste sortert feil!⌟");
            }
            if (valg!=9) {
                System.out.println("Trykk ENTER for å fortsette...");
                scanner.nextLine(); // venter på enter før den kjører while på nytt
                scanner.nextLine(); // to stk så det ikke kan skippes
            }
        }
    }
}