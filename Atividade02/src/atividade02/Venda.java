package atividade02;

public class Venda {
    
    String nomeCliente;
    String formaPagamento;
    PacoteViagem pacote;
    
    public Venda(String nomeCliente, String formaPagamento){
        this.formaPagamento = formaPagamento;
        this.nomeCliente = nomeCliente;
    }
    /*Método para converter dolar em real*/
    public double conversor(double valorTotal, double cotacaoDolar){
        return valorTotal*cotacaoDolar;
    }
   
}
