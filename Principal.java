

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvore a = new Arvore();
		
		a.inserir(new Aluno(111, "Alexandre"));
		a.inserir(new Aluno(222, "Carlos"));
		a.inserir(new Aluno(333, "Pedro"));
		a.inserir(new Aluno(444, "Maria"));
		a.inserir(new Aluno(555, "Clara"));
		a.inserir(new Aluno(666, "Joao"));
		a.inserir(new Aluno(777, "Silvia"));
	
		
		a.emOrdem();
		System.out.println();
		a.preOrdem();
		System.out.println();
		a.posOrdem();
		System.out.println();
		
		TipoNo no = a.pesquisaArvore(333);
		
		if (no != null)
			System.out.println("ACHOU!!" + no);
		else
			System.out.println("NÃO ACHOU!!");
		
		Aluno aluno = a.menorRecursivo(no);
if (aluno == null)
	System.out.println("Arvore vazia!!");
else 
	System.out.println(aluno);
		
}
}
