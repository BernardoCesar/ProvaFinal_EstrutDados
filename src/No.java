public class No {
	
    Produto dado;
	No dir;
	No esq;
	
	public No(Produto dado) {
		super();
		this.dado=dado;
	}
	
	public void inserirNo(Produto produto) {
		if(produto.getId()>dado.getId()) {
			if(dir==null) {
				dir=new No(produto);
			}else {
				dir.inserirNo(produto);
			}
		}else {
			if(produto.getId()<dado.getId()) {
				if(esq==null) {
					esq=new No(produto);
				}else {
					esq.inserirNo(produto);
				}
			}
			
		}
		
	}
	
	
}


