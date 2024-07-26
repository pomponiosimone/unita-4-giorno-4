public class Main {
    public static void main(String[] args) {

        DipendenteFullTime dipendenteFullTime1 = new DipendenteFullTime("1", 50000, Dipendenti.Dipartimento.PRODUZIONE, 2000);

        DipendentePartTime dipendentePartTime1 = new DipendentePartTime("2", 10000, Dipendenti.Dipartimento.VENDITE, 20, 15.00);
        ;
        Dirigente dirigente1 = new Dirigente("3", 1000000, Dipendenti.Dipartimento.AMMINISTRAZIONE, 5000.00);


        Dipendenti[] dipendentiArray = {dipendenteFullTime1, dipendentePartTime1, dirigente1,};


        double totaleStipendi = 0.0;

        for (int i = 0; i < dipendentiArray.length; i++) {
            totaleStipendi += dipendentiArray[i].calculateSalary();
            System.out.println("Matricola: " + dipendentiArray[i].stampaMatricola());
        }

        // Stampa del totale degli stipendi
        System.out.println("Totale stipendi: " + totaleStipendi);

    }
}