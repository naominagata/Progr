package aula33;

import java.util.Scanner;

import aula33.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		
		System.out.println("Nome aluno: ");
		aluno.setNome(scan.next());
		System.out.println("RM aluno: ");
		aluno.setRM(scan.next());
		System.out.println("Curso do aluno: ");
		aluno.setCurso(scan.next());
		
		for (int i=0; i<aluno.getDisciplina().length; i++) {
		System.out.println("Nome da disciplina: " );
		aluno.setDisciplina(i, scan.next());
		}
		
		
		
		for (int i=0; i<aluno.getNotasDisciplina().length; i++) {
				System.out.println("Obtendo nota da disciplina: " );
				aluno.getDisciplina()[i] = scan.next();		
				for (int j=0; j<aluno.getNotasDisciplina().length; j++) {
					System.out.println("Entre com a nota " + j);
					aluno.setNotaPosIJ(i, j, scan.nextDouble());
			}
		}
		
		
		for (int i=0; i<aluno.getDisciplina().length; i++) {
			if (aluno.verificar(i)) {
				System.out.println("Disciplina " + aluno.getDisciplina()[i] + " foi aprovado ");
			} else 
				System.out.println("Disciplina " + aluno.getDisciplina()[i] + " foi reprovado ");

		}
		aluno.mostrarInfo();
		
	}

}
