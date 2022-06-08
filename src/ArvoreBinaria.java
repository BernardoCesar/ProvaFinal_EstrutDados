import javax.swing.JOptionPane;

public class ArvoreBinaria {
    private No raiz;
	private int contador=0;
	
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
		if(raiz==null){
			JOptionPane.showMessageDialog(null, "Não há produtos cadastrados ainda");
		}else{
        emOrdemRecursivo(raiz);
		}	
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

    //talvez usar int id como parametro
    public void pesquisar(int id){
		if(raiz==null){
			JOptionPane.showMessageDialog(null, "Não há produtos cadastrados ainda");
		}else{
			No produto=pesquisarRecursivo(raiz, id);
			if(produto==null){
				JOptionPane.showMessageDialog(null, "Este produto não existe ou não foi cadastrado");
			}else{
				JOptionPane.showMessageDialog(null, produto.dado.toString());
			}
		}
	}

	public No pesquisarRecursivo(No raiz, int id){
		if(raiz==null) {
			return null;
		}else if(raiz.dado.getId()==id){
			return raiz;
		}

		if(id<raiz.dado.getId()){
			return pesquisarRecursivo(raiz.esq, id);
		}else{
			return pesquisarRecursivo(raiz.dir, id);
		}
		
	}

		

 }
  
