package aula27;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.disciplina[1] = "Matematica";
		aluno.disciplina[2] = "Portugues";
		aluno.disciplina[3] = "Historia";
		
		System.out.println("Nome aluno: ");
		aluno.nome = scan.next();
		System.out.println("RM aluno: ");
		aluno.RM= scan.next();
		System.out.println("Curso do aluno: ");
		aluno.curso = scan.next();
		
		for (int i=0; i<aluno.disciplina.length; i++) {
		System.out.println("Nome da disciplina: " );
		aluno.disciplina[i] = scan.next();
		}
		
		aluno.mostrarInfo();
		
		for (int i=0; i<aluno.notasDisciplina.length; i++) {
				System.out.println("Obtendo nota da disciplina " + aluno.disciplina[i]);
				for (int j=0; j<aluno.notasDisciplina.length; j++) {
					System.out.println("Entre com a nota " + j);
					aluno.notasDisciplina[i][j] = scan.nextDouble();
			}
		}
		
		for (int i=0; i<aluno.notasDisciplina.length; i++) {
			if (aluno.verificar(i)) {
				System.out.println("Disciplina " + aluno.disciplina[i] + " foi aprovado ");
			} else 
				System.out.println("Disciplina " + aluno.disciplina[i] + " foi reprovado ");

		}
		
	}

}
