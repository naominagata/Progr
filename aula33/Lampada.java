package aula33;

public class Lampada {

	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}

	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("Lampada esta ligada");
			}else {
				System.out.println("Lampada esta desligada");
			}
	}
	
	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
}
