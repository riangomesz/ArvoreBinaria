public class Arvore {
	TipoNo raiz;
	
	
	public Aluno menorRecursivoArvore(TipoNo no) {
		if (no == null)
			return null;
		
		if (no.esq == null)
			return no.aluno;
		
		return menorRecursivoArvore(no.esq);
	}
	public Aluno menorRecursivo(TipoNo no) {
		return menorRecursivoArvore(raiz);
	}
	
	
	
	
	public Aluno menorInterativo() {
	if (raiz == null)
		return null;
	TipoNo aux = raiz;
	while (aux.esq != null)
		aux = aux.esq;
      return aux.aluno;
}
      public Arvore() {
		raiz= null;
	}

	void emOrdem()
	{
	   caminharEmOrdem(raiz);     
	}

	void preOrdem()
	{
		caminharEmPreOrdem(raiz);     
	}

	void posOrdem()
	{
		caminharEmPosOrdem(raiz);     
	}
	
	private void caminharEmPreOrdem(TipoNo no) {
		if (no != null) 
		{
			System.out.print(no);
			caminharEmPreOrdem(no.esq);
			caminharEmPreOrdem(no.dir);
		}
	}

	private void caminharEmPosOrdem(TipoNo no) {
		if (no != null) 
		{
			caminharEmPosOrdem(no.esq);
			caminharEmPosOrdem(no.dir);
			System.out.print(no);
		}
	}

	private void caminharEmOrdem(TipoNo no) {
		if (no != null) 
		{
			caminharEmOrdem(no.esq);
			System.out.print(no);
			caminharEmOrdem(no.dir);
		}
	}

	private TipoNo pesquisa(int RA, TipoNo no)
    {
        if (no == null)
            return null;
        else if (RA < no.aluno.RA)
            return pesquisa(RA, no.esq);
        else if (RA > no.aluno.RA)
            return pesquisa(RA, no.dir);
        
        return no;
    }

	TipoNo pesquisaArvore(int chave)
	{
	    return pesquisa(chave, raiz);
	}
	
	public void inserir(Aluno aluno) {
		TipoNo no = new TipoNo(aluno); 
	     
	    if (raiz == null)
	       raiz = no;
	    else {
	       //ponteiros para busca
	       TipoNo aux; 
	       TipoNo ant;
	       aux = raiz; //ponteiro inicia na raiz
	       ant = null; //anterior inicial em NULL
	       
	       while (aux != null) { //Faz a busca do lugar ao qual deve ser inserido o nó
	    	   ant = aux;
	              
			  if (aux.aluno == aluno) {
			     System.out.println("Dado inserido já existe!");
			     return;
			  }
	              
              if (aluno.RA > aux.aluno.RA)
            	  aux = aux.dir;
              else 
                 aux = aux.esq; 
	       }

	        if  (ant.aluno.RA < aluno.RA) 
	        	ant.dir = no; 
	        else  
	            ant.esq = no;
	   
	    
	    }
	
	   
}
	
	

}
