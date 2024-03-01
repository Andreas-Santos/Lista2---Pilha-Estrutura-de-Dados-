// 1) Escreva um programa em JAVA que leia números inteiros e armazene em
// uma pilha. A entrada de dados deve ser interrompida quando o usuário
// informar o número zero e/ou esgotar a quantidade definida de elementos a
// serem armazenados na estrutura. Por último, imprima os elementos na
// ordem em que foram removidos da pilha.

package exercicio01;
import javax.swing.JOptionPane;

public class exercicio01 {

    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        int valor;
        
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um número para inserir na pilha(ou digite 0 para encerrar):"
            ));

            if(valor != 0) {
                p.empilhar(valor);    
            }

        }while(valor != 0 && p.cheia() == false);

        JOptionPane.showMessageDialog(null, p.ExibePilha());
    }
}