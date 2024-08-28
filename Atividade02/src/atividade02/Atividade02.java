package atividade02;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Transporte t = new Transporte(" "/*Tipo*/, 0/*Valor do transporte*/);
        Hospedagem h = new Hospedagem(" "/*Descricao*/, 0/*valor da diaria*/);
        PacoteViagem pv = new PacoteViagem(" "/*destino*/,0/*quantidade de dias*/);
        Venda v = new Venda(" "/*nome do cliente*/, " "/*forma de pagamento*/);
        
        System.out.println("Informe os dados do transporte...");
        System.out.print("\nInforme o tipo de transporte: ");
        t.tipo = s.nextLine();
        System.out.print("Informe o valor do transporte: ");
        t.valor = s.nextDouble();
        s.nextLine();
        
        pv.transporte = t;
        
        System.out.println("\nAgora informe os dados da hospedagem... ");
        System.out.print("Informe a descrição da hospedagem: ");
        h.descricao = s.nextLine();
        System.out.print("Informe o valor da diária: ");
        h.valor_diaria = s.nextDouble();
        s.nextLine();
        
        pv.hospedagem = h;
        
        System.out.println("\nAgora informe os dados do pacote...");
        System.out.print("Informe o destino: ");
        pv.destino = s.nextLine();
        System.out.print("Informe a quantidade de dias: ");
        pv.qtdDias = s.nextInt();
        s.nextLine();
      
        double total1 = pv.TotalHospedagemTransporte();
        
        System.out.print("\nQual será sua margem de lucro? ");
        int margemLucro = s.nextInt();
        
        System.out.print("\nQual a cotação do dólar do dia? ");
        double cotacao = s.nextDouble();s.nextLine();
        
        double lucro = pv.Lucro(total1, margemLucro);
        
        double totalG = pv.TotalPacote(total1, lucro);
        
        System.out.println("\nDados do pacote...");
        System.out.println("Transporte: "+pv.transporte.tipo);
        System.out.println("Valor: "+pv.transporte.valor);
        System.out.println("Tipo de hospedagem: "+pv.hospedagem.descricao);
        System.out.println("Valor da diaria: "+pv.hospedagem.valor_diaria);
        System.out.println("Quantidade de dias: "+pv.qtdDias);
        System.out.println("Valor total fica em: "+total1);
        System.out.println("A cotação em dólar é: "+cotacao);
        System.out.println("A margem de lucro é: "+margemLucro+"%");
        System.out.println("Total do lucro é de: "+lucro);
        System.out.println("Total geral do pacote fica em: USD "+totalG);
        
       
        
        System.out.println("\nInforme os dados do cliente...");
        System.out.print("Qual o nome do cliente: ");
        v.nomeCliente = s.nextLine();
        System.out.print("Qual é a forma de pagamento: ");
        v.formaPagamento = s.nextLine();
        
        System.out.println("\nNome do cliente: "+v.nomeCliente+
                           "\nForma de pagamento: "+v.formaPagamento);
        System.out.println("O valor em dolar e: USD "+totalG+
                           "\nO valor em reais é: BLR "+v.conversor(totalG, cotacao));
        
    }
    
}
