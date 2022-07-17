package aula19;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		int A[] = new int[2];
		int B[] = new int[A.length];

		for (int i=0; i<A.length; i++) {
			System.out.println("Numero: ");
			A[i] = scan.nextInt();
			
			if (A[i]%2==0) {
				B[i] += 1;
			}else {
				B[i] += 0;
			}
		}
		for (int i=0; i<A.length; i++) {
			System.out.println("A: " + A[i]);
		}
		for (int i=0; i<B.length; i++) {
		System.out.println("B: " + B[i]);
		}
		
	}

}
