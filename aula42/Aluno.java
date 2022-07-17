package aula42;

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
	
	/*public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}*/
	
	
}
