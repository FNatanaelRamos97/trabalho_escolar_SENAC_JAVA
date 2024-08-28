package atividade03;

import java.util.Scanner;
public class Atividade03 {

    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    Funcionario[] f = new Funcionario[10];
    char continuar = 's';
    int cont = 0;
    
    do{
        System.out.print("Digite o nome: ");
        String nome = s.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = s.nextLine();
        System.out.print("Digite o endereco: ");
        String endereco = s.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = s.nextLine();
        System.out.print("Digite o setor em que o funcionario trabalha: ");
        String setor = s.nextLine();
        
        System.out.println("Digite 1 para funcionario assalariado ou 2 para funcionario horista");
        int opcao = s.nextInt();
        
        switch(opcao){
            case 1:
                System.out.print("Informe o salario: ");
                double salario = s.nextDouble();
                s.nextLine();
                f[cont] = new Assalariado(salario, nome, cpf, endereco, telefone, setor);
                break;
                
            case 2: 
                System.out.print("Informe a quantidade de horas: ");
                int horas = s.nextInt();
                System.out.print("Informe o valor da hora: ");
                double valorHora = s.nextDouble();
                s.nextLine();
                f[cont] = new Horista(valorHora, horas, nome, cpf, endereco, telefone, setor);
                break;
        }
        cont++;
        System.out.println("Deseja cadatrar mais funcionarios: s para SIM e n para NAO...");
        continuar = s.next().charAt(0);
        s.nextLine();
        
    }while(continuar == 's');
    
    for(int i = 0; i < 10; i++){
        
        if(f[i] == null){
            break;
            
        }else if(f[i] != null){
            f[i].mostrarDados();
        } 
    }
    
    System.out.print("\nQual o percentual de aumento? ");
    double aumento = s.nextDouble();
    
    for(int i = 0; i < 10; i++){
        
        if(f[i] == null){
            break;
            
        }else if(f[i] != null){
        f[i].apAumento(aumento);
        }
    }
    
    }
    
}
