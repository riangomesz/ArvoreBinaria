
public class TipoNo {

	
	TipoNo esq, dir;
	public Aluno aluno;
	
	public TipoNo(Aluno aluno) {
		this.aluno = aluno;
		esq = dir = null;
	}
	
	public String toString() {
		return "->" + aluno;
	}
}
