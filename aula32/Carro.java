package aula32;

public class Carro {

	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consCombustivel;
	
	//GET tem retorno
	public String getMarca() {
		return this.marca;
	}
	//SET nao tem retorno
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public int getNumPassageiros() {
		return numPassageiros;
	}
	
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	public double getCapCombustivel() {
		return capCombustivel;
	}
	
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	
	public double getConsCombustivel() {
		return consCombustivel;
	}
	
	public void setConsCombustivel(double consCombustivel) {
		this.consCombustivel = consCombustivel;
	}
	
	
}
