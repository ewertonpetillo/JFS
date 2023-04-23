package cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojavaconstantes.StatusAluno;

/*Classe que representa aluno*/
public class Aluno {
	
	private String nome;
	private String situacao;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();	
	
	public Aluno() {
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setSituacao(double media) {
		if (media < 7) {
			this.situacao = StatusAluno.REPROVADO;
		}else {
			this.situacao = StatusAluno.APROVADO;
		}		
	}
	
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
		
	public double getMediaNota() {
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas/disciplinas.size();
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, nome, situacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(disciplinas, other.disciplinas) && Objects.equals(nome, other.nome)
				&& Objects.equals(situacao, other.situacao);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", situacao=" + situacao + ", disciplinas=" + disciplinas + "]";
	}
	
}

