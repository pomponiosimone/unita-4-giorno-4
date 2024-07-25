public class DipendenteFullTime extends Dipendenti {
    private int stipendioMensile;

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, int stipendioMensile) {
        super(matricola, stipendio, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }


    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }

    @Override
    public String stampaMatricola() {
        return getMatricola();

    }
}
