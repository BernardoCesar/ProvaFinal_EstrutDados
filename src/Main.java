import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
   
    String exit;

        do {
            exit = JOptionPane.showInputDialog(menu());
        
            switch (exit) {
                case "1":
                    Util.cadastrarP();
                    break;
                case "2":
                    Util.pesquisarP();
                    break;
                case "3":
                    Util.imprimirPs();
                    break;
                case "4":
                    Util.removerP();
                    break;
                case "5":
                    Util.alturaArvore();
                    break;
                default:
                   JOptionPane.showMessageDialog(null,"Essa opção não existe");
                    break;
            }
        }while (!exit.equals("5"));

    }


    public static String menu() {
        String aux = "Escolha uma Opção: \n";
        aux += "1. Cadastrar Produtos \n";
        aux += "2. Pesquisar Produto \n";
        aux += "3. Listar Produtos \n";
        aux += "4. Remover Produto \n";
        aux += "5. Encerrar Aplicação";
        return aux;
    }
}

    


