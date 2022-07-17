package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
	
		System.out.println("Digite seu primeiro nome: ");
		//String primeiroNome = scan.next();
		//System.out.println("Seu nome completo é: " + primeiroNome);
		
		System.out.println("Digite sua idade: ");
		//String idade = scan.nextLine();
		//System.out.println("Sua idade é: " + idade);
		
		System.out.println("Nome, idade, quantidade de filhos, altura, pets?");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilho = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade filho: "+ qtdFilho);
		System.out.println("Altura: "+ altura);
		System.out.println("Pet? "+ temPet);
		
	}

}
