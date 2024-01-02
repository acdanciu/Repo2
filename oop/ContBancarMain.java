package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip contBancar
        // instante ala clasei contBancar
        ContBancar cont1 = new ContBancar(" Andy S " , " RO001 ");
        ContBancar cont2 = new ContBancar(" Crina S " , " RO002 ");


        cont1.interogareSold();
        cont2.interogareSold();

//        System.out.println("Titular" + cont1.titularCont);
//        System.out.println(cont1.iban);
//        System.out.println(cont1.sold);
//        System.out.println(cont1.activ);
//        System.out.println("Titular" + cont2.titularCont);
//        System.out.println(cont2.iban);
//        System.out.println(cont2.sold);
//        System.out.println(cont2.activ);

//        // apelam metoda descrie
//        cont1.descriere();
//        cont2.descriere();

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing, ch mai mult decat avem

        cont1.plataCard(500); // nu, 300.50 => pass

        // positive testing, cu suma exacta

        cont1.plataCard(300.50); // da, 0, pass

        // positeve de 2x

        cont2.plataCard(100);
        cont2.plataCard(200); // da, 700, pass

        cont1.interogareSold();
        cont2.interogareSold();



    }

}
