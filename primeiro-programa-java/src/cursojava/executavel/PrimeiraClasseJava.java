package cursojava.executavel;

import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main (String[] args) {
	
	
	
	/*Ainda não existe na memória*/
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	String idade = JOptionPane.showInputDialog("Qual a sua idade");
	String cpf = JOptionPane.showInputDialog("Qual seu cpf?");
	String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");	
	String dataMatricula = JOptionPane.showInputDialog("Qual sua data de Matrícula?");
	String nomeEscola = JOptionPane.showInputDialog("Qual nome da sua escola?");
	
	
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	
	
	aluno1.setNome (nome);
	aluno1.setIdade (Integer.valueOf(idade));
	aluno1.setCpf (cpf);
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setDataMatricula(dataMatricula);
	aluno1.setNomeEscola(nomeEscola);
	
	Disciplina disciplina1 = new Disciplina();
	disciplina1.setDisciplina("Banco de Dados");
	disciplina1.setNota(90);
	
	aluno1.getDisciplinas().add(disciplina1);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Matemáticas");
	disciplina2.setNota(80);
	
	aluno1.getDisciplinas().add(disciplina2);
	
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("Contabilidade");
	disciplina3.setNota(100);
	
	aluno1.getDisciplinas().add(disciplina3);
	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("Custos");
	disciplina4.setNota(99);
	
	aluno1.getDisciplinas().add(disciplina4);
	
	
	System.out.println("Nome do aluno1 é = " + aluno1.getNome());
	System.out.println("A idade do aluno1 é = " + aluno1.getIdade()+ "anos");
	System.out.println("Nome do aluno1 é = " + aluno1.getCpf());
	System.out.println("Média da nota é = " + aluno1.getMediaNota());
	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	


	}		
}




	
