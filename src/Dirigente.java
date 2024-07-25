public class Dirigente extends Dipendenti {
    private double stipendioBase;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, double stipendioBase) {
        super(matricola, stipendio, dipartimento);
        this.stipendioBase = stipendioBase;
    }


    @Override
    public double calculateSalary() {
        return stipendioBase;
    }

    @Override
    public String stampaMatricola() {
        return getMatricola();
    }
}



