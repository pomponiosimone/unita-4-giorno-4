public abstract class Dipendenti implements Interface {
    // Attributi
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    // Costruttore
    public Dipendenti(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Getter
    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Setter


    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //metodi
    public abstract double calculateSalary();

    public abstract String stampaMatricola();

    // Enum Dipartimento
    public enum Dipartimento {
        PRODUZIONE("Produzione"),
        AMMINISTRAZIONE("Amministrazione"),
        VENDITE("Vendite");

        private String descrizione;

        Dipartimento(String descrizione) {
            this.descrizione = descrizione;
        }

        public String getDescrizione() {
            return descrizione;
        }
    }
}