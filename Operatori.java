
/*
recap:
variabile
tipuri de date: char, string,int, float/double, boolean

Operatori:
aritmetici: +,-,*,/,%
de comparare: < > , ==, !=, >=, <=
logici: &&, ||, !
*/

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(5 != b); // 5 diferit de 5? => false
        System.out.println(7>a || 3>b); // 7>5 SAU 3>5 =>  true
        System.out.println(7>a && 3>b); // 7>5 SI 3>5 =>  false
        System.out.println(!(7>b)); // !true = false
    }
}


