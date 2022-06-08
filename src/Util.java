import javax.swing.JOptionPane;

public class Util {

    static ArvoreBinaria arvore= new ArvoreBinaria();

    public static void cadastrarP() {
        int id, qt_estoque;
        String nome;
        double valor;

        id=Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto:"));
        nome=JOptionPane.showInputDialog("Insira o nome do produto:");
        valor=Double.parseDouble(JOptionPane.showInputDialog("Insira o valor:"));
        qt_estoque=Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto:"));
        if(qt_estoque<=0){
            JOptionPane.showMessageDialog(null, "O produto não pode ser cadastrado sem estoque");
        }else{
            Produto produto= new Produto(id, nome, valor, qt_estoque);
            arvore.inserir(produto);
        }


    }

    
    public static void pesquisarP() {
        int id=Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto"));
        arvore.pesquisar(id);
    }

    
    public static void imprimirPs() {
        
        arvore.emOrdem();
    }

    
    public static void removerP() {
    }

    
    public static void alturaArvore() {
    }

}
