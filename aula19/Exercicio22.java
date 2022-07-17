package aula19;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		int A [] = new int[5];
		int qtd0=0, qtd1=0;
		
		for (int i=0; i<A.length; i++) {
			//round-> arredondamento
			//random-> numero aleatorio entre 0 e 1
			A[i] = (int)Math.round(Math.random()*1);
			
			if (A[i] == 0) {
				qtd0++;
			}else
				qtd1++;
		}
		
		double porc0 = (qtd0*100)/A.length;
		double porc1 = (qtd1*100)/A.length;

		System.out.println("Porcentagem 0: " + porc0);
		System.out.println("Porcentagem 1: " +porc1);
	}

}
