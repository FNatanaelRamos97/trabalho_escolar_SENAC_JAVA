package atividade03;

public class Assalariado extends Funcionario {
    
    private double salario;

    public Assalariado(double salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double pagamento() {
        return salario;
    }
    
    
}
