import javax.swing.JOptionPane;

public class ArvoreBinaria {
    private No raiz;
	
	//método para inserir um elemento na árvore binária de busca
	public void inserir(Produto produto) {
		if(raiz==null) {
			raiz=new No(produto);
		}else {
			raiz.inserirNo(produto);
		}
	}
	
	//método para percorrer a árvore em ordem
	public void emOrdem() {
		emOrdemRecursivo(raiz);
	}
	
	//método auxiliar recursivo para o percurso em ordem
	private void emOrdemRecursivo(No raiz) {
		if(raiz==null) {
			return;
		}
		emOrdemRecursivo(raiz.esq);
		JOptionPane.showMessageDialog(null, raiz.dado.toString() + " ");
		emOrdemRecursivo(raiz.dir);
	}

    public void pesquisar(Produto produto){
        if(raiz==null) {
			return;
		}
		emOrdemRecursivo(raiz.esq);
		if(raiz.dado.getId()==produto.getId()){
            JOptionPane.showMessageDialog(null, raiz.dado.toString());
        }
		emOrdemRecursivo(raiz.dir);
	}
 }
  
