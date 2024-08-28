package atividade02;

public class PacoteViagem {
    String destino;
    int qtdDias;
    Hospedagem hospedagem;
    Transporte transporte;
   
    public PacoteViagem(String destino, int qtdDias){
        this.qtdDias = qtdDias;
        this.destino = destino;
    }
    
    public double Lucro(double valorTotal, double margem){
        return valorTotal*(margem/100); /*Método para calcular a o lucro*/
    }
    
    public double TotalPacote(double totalHospedagemTransporte, double margemLucro){
        return totalHospedagemTransporte + margemLucro; /*Método para calcular o valor total*/
    }
    
     public double TotalHospedagemTransporte(){
        return (this.qtdDias * this.hospedagem.valor_diaria)+this.transporte.valor;  /*Método para calcular a hospedagem com dia e valor*/
    }
     
}
