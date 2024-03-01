// 5) Construa um programa que solicite ao usuário que digite a url de um site
// que será acessado. Ao receber uma nova URL, armazene na pilha. Possibilite
// ao usuário, resgatar as URLs acessadas anteriormente na ordem de visitação
// ao solicitar “Voltar” às páginas anteriores.

package exercicio05;

import javax.swing.JOptionPane;

public class exercicio05 {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        int escolha;

        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu\n"+
                "1 - Navegar\n"+
                "2 - Voltar\n"+
                "0 - Encerrar programa"
            ));

            switch (escolha) {
                case 1:
                    String url;
                    url = JOptionPane.showInputDialog(
                       "Digite a URL:" 
                    );

                    p.empilhar(url);
                    break;

                case 2:
                    p.desempilhar();
                    JOptionPane.showMessageDialog(
                        null, p.exibeURLs()
                    );
                    break;
                
                case 0:
                    JOptionPane.showMessageDialog(
                        null, "Programa encerrado!"
                    );
                    break;
  
                default:
                    JOptionPane.showMessageDialog(
                        null, "O valor digitado não é válido!"
                    );
                    break;
            }
        }while(escolha != 0);
    }
}
