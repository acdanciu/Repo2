public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul

        System.out.println("Am cumparat o masina marca :" + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca :" + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declarare

        String prenume;
        String nume;
        //initializare
        prenume = "Andy";
        nume = "San";
        int varsta = 34;
        // concatenare de stringuri
        System.out.println(prenume + " " + nume + "cu varsta de " + varsta);


    }
}

