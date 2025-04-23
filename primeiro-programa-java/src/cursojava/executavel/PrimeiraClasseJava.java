package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main (String[] args) {
	
	
	
	/*Ainda não existe na memória*/
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	String idade = JOptionPane.showInputDialog("Qual a sua idade");
	String cpf = JOptionPane.showInputDialog("Qual seu cpf?");
	String nota1 = JOptionPane.showInputDialog("Qual foi sua nota da primeira prova?");
	String nota2 = JOptionPane.showInputDialog("Qual foi sua nota da segunda prova?");
	String nota3 = JOptionPane.showInputDialog("Qual foi sua nota da terceira prova?");
	String nota4 = JOptionPane.showInputDialog("Qual foi sua nota da quarta prova?");
		
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	
	
	aluno1.setNome (nome);
	aluno1.setIdade (Integer.valueOf(idade));
	aluno1.setCpf (cpf);
	aluno1.setNota1 (Integer.valueOf(nota1));
	aluno1.setNota2 (Integer.valueOf(nota2));
	aluno1.setNota3 (Integer.valueOf(nota3));
	aluno1.setNota4 (Integer.valueOf(nota4));
	
	
	/*System.out.println("Nome do aluno1 é = " + aluno1.getNome());
	System.out.println("A idade do aluno1 é = " + aluno1.getIdade()+ "anos");
	System.out.println("Nome do aluno1 é = " + aluno1.getCpf());
	System.out.println("Média da nota é = " + aluno1.getMediaNota());
	System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/
	

	System.out.println(aluno1.toString());
	}		
}




	
