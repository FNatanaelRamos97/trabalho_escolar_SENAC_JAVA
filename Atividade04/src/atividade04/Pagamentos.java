package atividade04;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    
    private String nomeEmpresa;
    private List<Imposto> listaImpostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.listaImpostos = new ArrayList<>();
    }
    
    public void adicionarImposto(Imposto imposto){
        listaImpostos.add(imposto);
    }
    
    public void calcularImpostos(){
        System.out.println("Total de impostos a pagar: ");
        for(Imposto imposto: listaImpostos){
            double total = imposto.calcularImposto();
            System.out.println(imposto.descricao() + ": R$" + total);
        }
    }
}
