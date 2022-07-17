package aula24;

import java.util.Date;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LivroDeBiblioteca livrobiblioteca = new LivroDeBiblioteca();
		
		livrobiblioteca.nome = "J";
		livrobiblioteca.autor = "eu";
		livrobiblioteca.qtdPag = 9;
		livrobiblioteca.emprestado = true;
		livrobiblioteca.dataEntrega = new Date();
	}

}
