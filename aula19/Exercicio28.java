package aula19;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		int A[] = new int[5];
		int B[] = new int[A.length];
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Numero: ");
			A[i] = scan.nextInt();
			
			B[A.length - i - 1] = A[i];
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println("A: " + A[i]);
		}
		for (int i=0; i<B.length; i++) {
		System.out.println("B: " + B[i]);
		}
	}

}
