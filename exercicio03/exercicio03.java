// 3) Faça uma adaptação em seu programa que manipula pilhas para que possa
// exibir o número de elementos da pilha que possuem valor par.

package exercicio03;
import javax.swing.JOptionPane;

public class exercicio03 {

    public static void main(String[] args) {
        Pilha p = new Pilha(6);
        int valor;
        int pares = 0;
        
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um número para inserir na pilha(ou digite 0 para encerrar):"
            ));

            if(valor != 0) {
                p.empilhar(valor);

                if(valor % 2 == 0) {
                    pares++;
                }
            }

        }while(valor != 0 && p.cheia() == false);

        JOptionPane.showMessageDialog(null, "O número de elementos pares é: "+ pares);
    }
}