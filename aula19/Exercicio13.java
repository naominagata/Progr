package aula19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner scan = new Scanner (System.in);
		
		int A[] = new int[3];
		int soma=0;
		
		for (int i=0; i<A.length; i++) {
			System.out.println("A posição " + i);
			A[i] = scan.nextInt();
		}
		
		for (int i=0; i<A.length; i++) {
		if (A[i] % 5 == 0 ) {
			soma += A[i];
		}
		}
		System.out.println("Soma: " + soma);
	
	}

}
