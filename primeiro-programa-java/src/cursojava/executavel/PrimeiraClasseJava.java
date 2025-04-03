package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main (String[] args) {
	
	
	
	/*Ainda não existe na memória*/
	Aluno aluno1 = new Aluno();/*Aqui será o João*/
	aluno1.nome = "João";
	aluno1.idade = 36;
	
	System.out.println("Nome do aluno1 é = " + aluno1.nome);
	System.out.println("A idade do aluno1 é = " + aluno1.idade);
	
	/*Agora temos um objeto real na memória*/
	
	
	/*new Aluno é uma intâncias (Criação de Objeto)*/
	/*aluno1 aluno2, são as referências para o objeto Aluno*/
	/*Atributos são as características do objeto*/
	Aluno aluno2 = new Aluno ();/*Aqui será o Pedro*/
	
	Aluno aluno3 = new Aluno ();/*Aqui será o Alex*/
	
	Aluno aluno4 = new Aluno("Maria");
	
	Aluno alun5 = new Aluno("José", 50);
	
	
	

 
	}		
}




	
