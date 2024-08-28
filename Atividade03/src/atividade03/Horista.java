package atividade03;

public class Horista extends Funcionario {
    
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(double valorHora, int horasTrabalhadas, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double pagamento() {
        return valorHora * horasTrabalhadas;
    }
    
}
