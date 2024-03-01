// 4) Escreva um programa em JAVA que cria 2 pilhas (N e P) e solicita ao usuário
// para informar números inteiros para preencher um array. Para cada valor do
// array:
// se positivo, inserir na pilha P;
// se negativo, inserir na pilha N;
// se zero, retirar um elemento de cada pilha.
// O array de números inteiros deve ter 8 elementos.

package exercicio04;
import javax.swing.JOptionPane;

public class exercicio04 {

    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        Pilha n = new Pilha(8);
        int[] array = new int[8];

        for(int x = 0; x < array.length; x++) {
            array[x] = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite um número para inserir ao array:"
            ));
        }

        for(int x = 0; x < array.length; x++) {
            if(array[x] > 0) {
                p.empilhar(array[x]);
            }
            else if(array[x] < 0) {
                n.empilhar(array[x]);
            }
            else {
                p.desempilhar();
                n.desempilhar();
            }
        }

        JOptionPane.showMessageDialog(null, "O array de positivos ficou: " +p.ExibePilha());
        JOptionPane.showMessageDialog(null, "O array de negativos ficou: " +n.ExibePilha());
    }
}