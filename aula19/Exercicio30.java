package aula19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A[] = new int[5];
		int B[] = new int[A.length];
		int C[] = new int[A.length];
		int posB=0, posC=0;

		
		for (int i=0; i<A.length; i++) {
			System.out.println("Numero na posicao " + i + " no vetor A: ");
			A[i] = scan.nextInt();
			if (A[i]%2==0) {
				B[posB] = A[i];
				posB++;
			}else {
				C[posC] = A[i];
				posC++;
			}
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println("A: " + A[i]);
		}
		for (int i=0; i<B.length; i++) {
			System.out.println("B: " + B[i]);
		}
		for (int i=0; i<C.length; i++) {
			System.out.println("C: " + C[i]);
		}
	}

}
