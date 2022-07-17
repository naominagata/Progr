package aula27;

import java.util.Scanner;

public class Aluno {

	Scanner scan = new Scanner(System.in);
	
	String nome;
	String RM;
	String curso;
	String disciplina[] = new String[3];
	double notasDisciplina[][] = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome " + nome);
		System.out.println("RM " + RM);
		System.out.println("curso" + curso);
		for (int i=0; i<notasDisciplina.length; i++) {
			System.out.println("Notas da disciplina " + disciplina[i]);
			for (int j=0; j<disciplina.length; j++) {
				System.out.println(notasDisciplina[i][j]);;
			}
		}
	}
	
	
	
	boolean verificar(int indice) {
		double soma=0;
		for (int i=0; i<notasDisciplina[i].length; i++) {
			soma += notasDisciplina[indice][i];
		}
		double media = soma/4;
		if (media>=7) {
			return true;
		} 
		return false;
	} 
}
