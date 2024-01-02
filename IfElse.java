import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Flow control - if else
        // evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("pornim radio");
        boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
        // daca imi place piesa, dau mai tare

        if (piesa_faina == true) {
            System.out.println("dau mai tare volumul");
            System.out.println("incep sa fredonez piesa");
        }
        System.out.println("oprim radio");

        // if else
        int nr =5;
        if (nr % 2 == 0) {
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }

        // if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora <=11) {
//            System.out.println("neata");
//        } else if (ora <=18) {
//            System.out.println("ziua buna");
//        } else if (ora <=21) {
//            System.out.println("buna seara");
//        } else if (ora <=24) {
//            System.out.println("nb");
//        } else  {
//            System.out.println("ora invalida");
//        }

        // 0 stationeaza, <= 50 localitate, <=90 drum judetean

        // flow control
        // switch - se foloseste cand stim valorile posibile

//        System.out.println("alege optiunea");
//        int optiunea = sc.nextInt();
//        switch (optiunea) {
//            case 0:
//                System.out.println("meniu anterior");
//                break;
//            case 1:
//                System.out.println("ro");
//                break;
//            case 2:
//               System.out.println("en");
//               break;
//            default:
//                System.out.println("optiune invalida");
//
//        System.out.println("alege optiunea");
//        int optiunea = sc.nextInt();
//        switch (optiunea) {
//            case 0:
//                System.out.println("meniu anterior");
//                break;
//            case 1:
//                System.out.println("ro");
//                break;
//            case 2:
//                System.out.println("en");
//                break;
//            default:
//                System.out.println("optiune invalida");

        // cd player
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 1:
                System.out.println("Metallica");
                break;
            case 2:
                System.out.println("ACDC");
                break;
            case 3:
                System.out.println("Eagles");
                break;
            case 4:
                System.out.println("Guns'n roses");
                break;
            case 5:
                System.out.println("Aerosmith");
                break;
            case 6:
                System.out.println("Pheonix");
                break;
            default:
                System.out.println("optiune invalida");


        }


        } // inchide functia main
} // inchide clasa


