package aula19;

public class Arrays {

	public static void main(String[] args) {
		
		//armazenar temperatura de cada dia durante 1 ano
		
		//double tempDiaria001 = 31.3;
		//double tempDiaria002 = 32.3;
		//double tempDiaria003 = 33.3;
		//double tempDiaria004 = 34.3;
		
		double [] temperaturas = new double[365];

		temperaturas[0] = 31.2;
		temperaturas[1] = 33;
		temperaturas[2] = 37.6;
		
		System.out.println("O valor da temperatura 1 é: " + temperaturas[0]);
		
		System.out.println("Tamanho do array: " + temperaturas.length);
		//length-> le o tamanho 
		
		System.out.println("Valores do array: " + temperaturas);
		//mostra o endereço de memoria
		
		//como mostrar todos os valores do array
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("Temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) {
			//acessa uma determinada posicao do array (apenas o valor, não a posição)
			System.out.println(temp);
		}
	}

}
