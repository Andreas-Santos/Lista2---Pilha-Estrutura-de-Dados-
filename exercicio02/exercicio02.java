// 2) Construa um programa em JAVA utilizando uma pilha que resolva o
// seguinte problema:
// Armazene as placas dos carros que estão estacionados numa rua sem saída
// estreita. Dado uma placa verifique se o carro está estacionado na rua. Caso
// esteja, informe a sequência de carros que deverá ser retirada para que o carro
// em questão consiga sair.

package exercicio02;

import javax.swing.JOptionPane;

public class exercicio02 {
    public static void main(String[] args) {
        Pilha p = new Pilha(6);
    
        String placa;
            
        do{
            placa = JOptionPane.showInputDialog(
                "Digite a placa do veículo que entrou na rua(ou 0 para encerrar):"
            );
    
            if(!placa.equals("0")) {
                p.empilhar(placa);    
            }
    
        }while(!placa.equals("0") && p.cheia() == false);
        
        String placaPesquisa;
        placaPesquisa = JOptionPane.showInputDialog(
            "Digite a placa que deseja pesquisar:");
        
        JOptionPane.showMessageDialog(
            null, p.carrosRetirar(p.checaPilha(placaPesquisa)));
    }
}
