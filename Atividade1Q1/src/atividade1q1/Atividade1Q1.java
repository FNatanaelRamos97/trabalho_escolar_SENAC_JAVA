package atividade1q1;
/*Atividade 1; Questão 1*/

import java.util.Scanner;
public class Atividade1Q1 {

    public static void main(String[] args) {
        int lugares = 0;
        Scanner qtd = new Scanner(System.in);
        
        System.out.println("Qual a quantidade de convidados: ");
        lugares = qtd.nextInt();
        
        if(lugares > 0 && lugares <= 150) {
            System.out.println("Use o auditório ALFA.");
        }else if (lugares > 150 && lugares <= 220){
            lugares -= 150;
            System.out.println("Use o auditório ALFA.");
            System.out.println("Inclua mais " + lugares + " cadeiras.");
        }else if (lugares > 220 && lugares <= 350){
            System.out.println("Use o auditório BETA.");
        }else {
            System.out.println("Número de convidados inválido.");
        }
    }
    
}
