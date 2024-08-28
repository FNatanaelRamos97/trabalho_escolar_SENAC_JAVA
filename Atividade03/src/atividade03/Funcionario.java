package atividade03;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String setor;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String setor){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public void mostrarDados(){
        System.out.println("\n");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereco: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Setor: "+setor);
        System.out.println("Valor do pagamento é de: "+this.pagamento());
    }
    
    public abstract double pagamento();
    
    public void apAumento(double porcentagem){
        double aumento = this.pagamento()*(porcentagem/100);
        double novoPagamento = this.pagamento()+aumento;
        System.out.println("\n");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Endereco: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Setor: "+setor);
        System.out.println("Novo pagamento: "+novoPagamento);
    }
    
}
