package aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	
	private String curso;
	private double notas[];
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado(){
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		//return endereco;
		//da erro
		String s= "Endereco do Aluno: ";
		//s += this.getEndereco();
		return s;
	}
	
	//para pegar as notas do aluno e nao as referencias
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}
	
	
	
	/*public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}*/
	
	
	
	/*public String toString() {
		String s = curso;
		for (double nota : notas) {
			s += nota;
		}
		return s;
	}*/
	
	
}
