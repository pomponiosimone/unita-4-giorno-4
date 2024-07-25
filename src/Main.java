//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Dipendenti dipendente1 = new Dipendenti("1", 10000.00, Dipendenti.Dipartimento.PRODUZIONE);
        Dipendenti dipendente2 = new Dipendenti("2", 500000.00, Dipendenti.Dipartimento.AMMINISTRAZIONE);
        Dipendenti dipendente3 = new Dipendenti("3", 40000.00, Dipendenti.Dipartimento.VENDITE);


        Dipendenti[] dipendentiArray = {dipendente1, dipendente2, dipendente3};


        for (int i = 0; i < dipendentiArray.length; i++) {
            System.out.println("Matricola: " + dipendentiArray[i].getMatricola());
        }
    }
}