public class For {
    public static void main(String[] args) {
        // for - loop, structura repititiva
        // de unde incepe?
        // pana unde mergem?
        // pasul  de parcurgere
        // problema: printam 101 dalmatieni
        for (int i=1; i<= 101; i++){
            // i = 1 apoi 2 etc
            System.out.println("Dalmatianul cu nr" + i);
        }

        // ne ajuta sa parcurem un array prin intermediul indexului
        int[] numere = {3,7,10,20, 30}; // numere[0]=3
        for (int i = 0; i < numere.length; i=i+2) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }

        // aprcurgem array de culori
        String [] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este: " + culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar : numere) { // s=3, 7  numere: [3, 7, 10, 20, 30] numar 7
            s = s + numar; // 10+10 s: 3   numar: 7
        }
        System.out.println();
    }
}
