package atividade1q4;

import java.util.Scanner;
public class Atividade1Q4 {

    public static void main(String[] args) {
        String [] nomeCliente = new String [14];
        String pesquisa;
        int i = 0, op = 0;
       
        Scanner s = new Scanner(System.in);
        
        while (op != 3){
            System.out.println("-- Escolha uma das opções abaixo--");
            System.out.println("-- 1 cadastrar ");
            System.out.println("-- 2 pesquisar ");
            System.out.println("-- 3 sair ");
            op = s.nextInt(); s.nextLine();
            
            switch(op){
                case 1: {
                    if (i < 14){
                        System.out.print("Digite o nome do cliente: ");
                        nomeCliente [i] = s.nextLine();
                        System.out.println("");
                        System.out.println("O nome do hóspede é: " + nomeCliente[i]);
                        i++;
                    }else{
                        System.out.println("Todas as vagas do hotel estão ocupadas!");
                    }
                }break;
                
                case 2: {
                    System.out.println("Digite o nome do cliente para pesquisa: ");
                    pesquisa = s.nextLine();
                    for (int z = 0; z <= i; z++){
                        if (pesquisa.equals(nomeCliente[z])){
                            System.out.println(pesquisa + " está na posição " + z);
                        }
                    }
                }break;
                    
            }   
        }
    }
    
}
