package aula19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
		
		int [] A = new int [15];
		int [] B = new int [15];
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Valor de A na posicao" + i);
			A[i] = scan.nextInt();
		    
			B[i] = A[i]*A[i];
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Valor de A na posicao " + i + A[i]);
			System.out.println("Valor de B na posicao " + i + B[i]);

		}
	}
}
