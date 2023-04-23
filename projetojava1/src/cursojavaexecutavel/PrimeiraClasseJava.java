package cursojavaexecutavel;

import javax.swing.JOptionPane;

import cursojava.Aluno;
import cursojava.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(JOptionPane.showInputDialog("Nome:")); 
		aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:")));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Matricula:"));
		aluno1.setDataNascimento(JOptionPane.showInputDialog("Nascimento:"));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Mãe:"));
		aluno1.setNomePai(JOptionPane.showInputDialog("Pai:"));
		aluno1.setNumeroCpf(JOptionPane.showInputDialog("CPF:"));
		aluno1.setRegistroGeral(JOptionPane.showInputDialog("RG:"));
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina(JOptionPane.showInputDialog("Disciplina:"));
		disciplina1.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota:")));
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina(JOptionPane.showInputDialog("Disciplina:"));
		disciplina2.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota:")));
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina(JOptionPane.showInputDialog("Disciplina:"));
		disciplina3.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota:")));
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina(JOptionPane.showInputDialog("Disciplina:"));
		disciplina4.setNota(Double.parseDouble(JOptionPane.showInputDialog("Nota:")));
		
		aluno1.getDisciplinas().add(disciplina4);
		
		System.out.println("Média: "+ aluno1.getMediaNota());
		
	}

}
