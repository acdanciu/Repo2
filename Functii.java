public class Functii {
    // functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o f in alta f ( nu pot instala firefox in chrome)

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns (nu are retrun)
    // nu are parametrii
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie  care saluta clientul in f de numele lui
    // nu ne da nici un raspuns (nu are retrun)
    // nu are parametrii

    // o functie  care calculeaza media a 3 numere
    // ne da un raspuns -suma nr va avea return
    // ce tip de date va avea raspunsul? 3+5=8
    // are nevoie de parametrii


    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }

    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua" + nume + " " + prenume);
    }

    // o functie  care ne da valoare lui pi
    // ne da un raspuns? da
    // rasp va fi double
    // are nevoie de parametri? nu

    public static double piValue() {
        //constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;

        //        double pi = 3.14;
        //        return 3.14;
    }
    // tema: aria unui dreptunghi

    public static double ariaDreptunghi(double l, double w) {

        double aria = (l * w);
        return aria;
    }

    // aria cercului

    public static double ariaCercului(double PI, double r) {

        double aria = (PI * (r * r));
        return aria;
    }

    // suma a 2 nr

    public static double nrSum(double a, double b) {

        double sum = (a + b);
        return sum;
    }



    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        // intra clientul 2
        printGreeting(); // ctrl+ click pe functie ne duce la corpul ei

        // apelam o functie cu param, offering argumente
        printGreetingByName("Sanpretean", "Andy");
        printGreetingByName("Sanpretean", "Crina");
        printGreetingByName("Sanpretean", "Ares");


        System.out.println(mediaNr(3, 3, 4));

        double media1 = mediaNr(31213, 312313, 425);
        double media2 = mediaNr(35, 324, 41);
        double media3 = mediaNr(33, 11, 11);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());

        // o f care retrurneaza cate caractere are numele + prenumele
        String nume = "Sanpetrean";
        String prenume = "Andy";
        System.out.println(nume.length() + prenume.length());

        System.out.println(ariaDreptunghi(3,4));

        System.out.println(ariaCercului(3.14,2));

        System.out.println(nrSum(5.3,2.8));

    }
}
