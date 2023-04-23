package cursojavaexecutavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.Aluno;
import cursojava.Disciplina;
import cursojavaconstantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> discis = new ArrayList<Disciplina>();
		/*É uma lista de identifica uma lista de valores por uma chave*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		int qtAluno = Integer.valueOf(JOptionPane.showInputDialog("Quantidade de Alunos:"));
		for(int i = 1; i <= qtAluno; i++) {
			String nomeAluno = JOptionPane.showInputDialog("Nome "+i+ ":");
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			alunos.add(aluno);
		}
		int tamAluno = alunos.size();
		int qtDisc = Integer.valueOf(JOptionPane.showInputDialog("Quantidade de Disciplinas:"));
		
		for(int l = 1; l <= qtDisc; l++) {
			String nomeDisc = JOptionPane.showInputDialog("Disciplina "+(l)+ ":");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisc);
			discis.add(disciplina);
		}
		
		for(int j = 0; j < tamAluno; j++) {
			for(int k=0; k< qtDisc; k++) {
				double nota = Double.valueOf(JOptionPane.showInputDialog("Nota de "+discis.get(k).getDisciplina()+" do aluno "+ alunos.get(j).getNome()+":"));
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(discis.get(k).getDisciplina());
				disciplina.setNota(nota);
				alunos.get(j).getDisciplinas().add(disciplina);
			}
			alunos.get(j).setSituacao(alunos.get(j).getMediaNota());
		}
		
	
	maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
	maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());


		for(Aluno aluno: alunos) {
			if(aluno.getSituacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else{
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		System.out.println("-----Lista de Aprovados----");
		for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado: "+aluno.getSituacao()+" -- Nome: "+ aluno.getNome() + "Media: " + aluno.getMediaNota());
		}
		
		System.out.println("-----Lista de Reprovados----");
		for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado: "+aluno.getSituacao()+" -- Nome: "+ aluno.getNome() + "Media: " + aluno.getMediaNota());
		}
				
	}
}
