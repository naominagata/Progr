package aula43;

import aula27.AlunoTeste;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia Da Computacao");
		double[] notas = {9,10,8};
		aluno.setNotas(notas);
		System.out.println(aluno);
		
		String s1= "abcde";
		String s2= "abcfg";
		//equals - se sao iguais
		//equals ignore case - se sao diferentes
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		

		aluno2.setCurso("Ciencia Da Computacao");
		double[] notas2 = {9,10,8};
		aluno.setNotas(notas2);
		
		//isso compara referencia
		//System.out.println(aluno == aluno2);
		//compara atributos
		System.out.println(aluno.equals(notas2));
	}

}
