package atividade1q5;

import java.util.Scanner;
public class Atividade1Q5 {

    public static void main(String[] args) {
       
       int andar = 0, quarto = 0, i = 0;
       char opcao = 's';
       char [][] hotel = new char [4][3];
       Scanner s = new Scanner(System.in);
       
       for (i = 0; i < 4; i++){
           System.out.println((i+1) + "º andar:");
           for (int j = 0; j < 3; j++){
               hotel[i][j] = 'n';
               if (hotel[i][j] == 'n'){
                   System.out.println("Quarto " + (j+1) + " está desocupado.");
               }
           }
       }
       while (opcao != 'n'){
           System.out.print("Informe o andar do quarto: ");
           andar = s.nextInt();
           System.out.print("Informe o numero mdo quarto que deseja ocupar: ");
           quarto = s.nextInt();
           
           hotel[andar-1][quarto-1] = 's';
           
           System.out.println("Deseja informar outra ocupação? (s/n)");
           s.nextLine();
           opcao = s.nextLine().charAt(0);
       }
       
       for (i = 0; i < 4; i++){
           System.out.println((i+1) + "º andar:");
           for(int j = 0; j < 3; j++){
               if (hotel[i][j] == 'n'){
                   System.out.println("Quarto " + (j+1) + " está desocupado.");
               }else{
                   System.out.println("Quarto " + (j+1) + " está ocupado.");
               }
           }
       }
       
    }
    
}
