package atividade04;

public class PIS implements Imposto {
    
    private double debito;
    private double credito;

    public PIS(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    

    @Override
    public double calcularImposto() {
        return (this.credito - this.debito) * 0.0165;
    }

    @Override
    public String descricao() {
        return "PIS";
    }
    
    
}
