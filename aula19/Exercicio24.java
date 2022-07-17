package aula19;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		int A[] = new int[10];
		boolean palindromo = true;

		for (int i=0; i<A.length; i++) {
			System.out.println("Numero: ");
			A[i] = scan.nextInt();
		}

		for (int i=0; i<A.length; i++) {
			if (A[i] != A[A.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
	}

}
