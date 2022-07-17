package aula33;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mostrarEstado();
	}

}
