package atividade04;

import java.util.Scanner; 

public class Atividade04 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nome da empresa: ");
        String nomeEmpresa = s.nextLine();
        
        Pagamentos p = new Pagamentos(nomeEmpresa);
        
        char continuar = 'c';
        
        do{
            System.out.print("Digite o tipo de imposto (PIS ou IPI): ");
            String tipoImposto = s.nextLine();
            
            if(tipoImposto.equals("PIS")){
                System.out.print("Valor total de débitos: ");
                double debito = s.nextDouble();
                System.out.print("Valor total de crédito: ");
                double credito = s.nextDouble();
                s.nextLine();
                p.adicionarImposto(new PIS(debito, credito));
            }else if(tipoImposto.equals("IPI")){
                System.out.print("Digite o valor do produto: ");
                double produto = s.nextDouble();
                System.out.print("Digite o valor do frete: ");
                double frete = s.nextDouble();
                System.out.print("Digite do seguro: ");
                double seguro = s.nextDouble();
                System.out.print("Digite o valor das outras despesas: ");
                double despesas = s.nextDouble();
                System.out.print("Digite a Aliquota(%): ");
                double aliquota = s.nextDouble();
                s.nextLine();
                p.adicionarImposto(new IPI(produto, frete, seguro, despesas, aliquota));
            }
            
            System.out.print("Digite 'c' para continuar e 'p' para parar: ");
            continuar = s.next().charAt(0);
            s.nextLine();
            
        }while(continuar != 'p');
        
        p.calcularImpostos();
    }
    
}
