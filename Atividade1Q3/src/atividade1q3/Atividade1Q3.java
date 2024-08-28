package atividade1q3;
/*Atividade 1; Questão 3*/
import java.util.Scanner;
public class Atividade1Q3 {

    public static void main(String[] args) {
        int idade, gratuidade = 0, meia = 0;
        double diaria, total = 0;
        String condicao = "SIM";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da diária:");
        diaria = scanner.nextDouble(); scanner.nextLine();
        
        do{
            
            System.out.println("Digite o nome do hóspede:");
            String hospede = scanner.nextLine();
            
            System.out.println("Digite a idade do hóspede:");
            idade = scanner.nextInt(); scanner.nextLine();
            
            if(idade > 0 && idade <= 4){
                System.out.println(hospede + " possui gratuidade.");
                gratuidade++;
            }else if(idade >= 80){
                System.out.println(hospede + " paga meia.");
                meia++;
                total += (diaria / 2);
            }else{
                total += diaria;
            }
            System.out.println("Caso você deseje cadastrar mais algum hospede, digite SIM. ");
            System.out.println("Caso você deseja encerrar digite PARE.");
            condicao = scanner.nextLine();
            
        }while(!condicao.equals("PARE"));
        
        System.out.println("Quantidade de gratuidades: " + gratuidade);
        System.out.println("Quantidade de meia entrada: " + meia);
        System.out.println("Valor total: " + total);
    }
       
}
