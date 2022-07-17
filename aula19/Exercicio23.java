package aula19;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A[] = new int[10];

		for (int i=0; i<A.length; i++) {
			System.out.println("Numero: ");
			A[i] = scan.nextInt();
		}
		
		for (int i=0; i<A.length; i++) {
			if (A[i]%2!=0) {
				break;
			}
		}
	}

}
