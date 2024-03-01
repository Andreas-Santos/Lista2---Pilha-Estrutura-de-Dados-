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