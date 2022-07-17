package aula42;

public class Professor{

	
	private double salario;
	private String nomeCurso;
	private String departamento;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		//return endereco;
		//da erro
		String s= "Endereco do Professor: ";
		//s += this.getEndereco();
		return s;
	}
	
	/*public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());		
	}*/
	
	
}
