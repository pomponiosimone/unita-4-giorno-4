public class DipendentePartTime extends Dipendenti {
    private double oreLavorate;
    private double tariffaOraria;


    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, double oreLavorate, double v) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * tariffaOraria;
    }

    @Override
    public String stampaMatricola() {
        return getMatricola();


    }
}
