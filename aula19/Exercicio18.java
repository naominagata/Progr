package aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner (System.in);
		 
		int A[] = new int[3];
		int indexMaior=0, indexMenor=0;
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Idade da posição " + i);
			A[i] = scan.nextInt();
		}
		
		int menor = A[0];
		indexMenor = 0;
		int maior = A[0];
		indexMaior = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i]> maior) {
				maior = A[i];
				indexMaior = i;
			}else 
				if (A[i]> menor) {
					menor = A[i];
					indexMenor = i;
				}
		}
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Vetor de idades: " + A[i]);
		}
	
		
			System.out.println("Maior: " + maior);
			System.out.println("Posicao maior: " + indexMaior);
			System.out.println("Menor: " + menor);
			System.out.println("Posicao menor: " + indexMenor);
			
		
		
	}
}
