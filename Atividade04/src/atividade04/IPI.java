package atividade04;

public class IPI implements Imposto{
    
    private double produto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;
    
    public IPI(double produto, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.produto = produto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    public double getValor() {
        return produto;
    }

    public double getFrete() {
        return frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setValor(double valor) {
        this.produto = valor;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
    

    @Override
    public double calcularImposto() {
       double calculo = this.produto + this.frete + this.outrasDespesas + this.seguro;
       return calculo * (this.aliquota / 100);
    }

    @Override
    public String descricao() {
        return "IPI";
    }
    
}
