package aula33;

import java.util.Scanner;

public class Aluno {
Scanner scan = new Scanner(System.in);
	
	private String nome;
	private String RM;
	private String curso;
	private String[] disciplina;
	private double[][] notasDisciplina;
	
	public Aluno() {
		disciplina = new String[3];
		notasDisciplina = new double[3][4];
	}
	
	public Aluno(Scanner scan, String nome, String rM, String curso, String[] disciplina, double[][] notasDisciplina) {
		this.scan = scan;
		this.nome = nome;
		this.RM = rM;
		this.curso = curso;
		this.disciplina = disciplina;
		this.notasDisciplina = notasDisciplina;
	}



	public Scanner getScan() {
		return scan;
	}



	public void setScan(Scanner scan) {
		this.scan = scan;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRM() {
		return RM;
	}



	public void setRM(String rM) {
		RM = rM;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String[] getDisciplina() {
		return disciplina;
	}



	public void setDisciplina (int pos, String disciplina) {
		this.disciplina[pos] = disciplina;
	}
	



	public double[][] getNotasDisciplina() {
		return notasDisciplina;
	}



	public void setNotasDisciplina(double[][] notasDisciplina) {
		this.notasDisciplina = notasDisciplina;
	}



	public void mostrarInfo() {
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
	
	
	
	public boolean verificar(int indice) {
		
		if (obterMedia(indice)>=7) {
			return true;
		} 
		return false;
		
	} 
	
	private double obterMedia(int indice) {
		double soma=0;
		for (int i=0; i<notasDisciplina[i].length; i++) {
			soma += notasDisciplina[indice][i];
		}
		double media = soma/4;
		return media;
	}
	

	public void setNotaPosIJ(int i, int j, double nota) {
		this.notasDisciplina[i][j] = nota;
		
	}
	
	
}
