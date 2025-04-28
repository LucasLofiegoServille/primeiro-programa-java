package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main (String[] args) {
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	for (int qtd = 1 ; qtd <=2; qtd++) {
	
	/*Ainda não existe na memória*/
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?" + qtd +"?");
	/*String idade = JOptionPane.showInputDialog("Qual a sua idade");
	String cpf = JOptionPane.showInputDialog("Qual seu cpf?");
	String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");	
	String dataMatricula = JOptionPane.showInputDialog("Qual sua data de Matrícula?");
	String nomeEscola = JOptionPane.showInputDialog("Qual nome da sua escola?");
	String nomePai = JOptionPane.showInputDialog("Qual o nome de seu pai?");
	String nomeMae = JOptionPane.showInputDialog("Qual o nome de sua mãe?");*/
	
	
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	
	
	aluno1.setNome (nome);
	/*aluno1.setIdade (Integer.valueOf(idade));
	aluno1.setCpf (cpf);
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setDataMatricula(dataMatricula);
	aluno1.setNomeEscola(nomeEscola);
	aluno1.setNomePai(nomePai); 
	aluno1.setNomeMae(nomeMae);*/
	
	for (int pos = 1; pos <= 4; pos++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
		String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina? "+pos+"?");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		
		aluno1.getDisciplinas().add(disciplina);
	}

	alunos.add(aluno1);
	}	
	
	for (Aluno aluno : alunos) {
		
		if (aluno.getNome().equalsIgnoreCase("Lucas")) {
		System.out.println(aluno); 
		/*System.out.println("A idade do aluno1 é = " + aluno1.getIdade()+ "anos");
		System.out.println("Nome do aluno1 é = " + aluno1.getCpf());*/
		System.out.println("Média da nota é = " + aluno.getMediaNota());
		System.out.println("Resultado = " + aluno.getAlunoAprovado2());
		System.out.println("-----------------------------------------------------");
			break;
	}
	
	}
	}
}




	
