package aula34;

public class TesteContador {
	
	static void ImprimirValor() {
		System.out.println(Contador.Retornar());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImprimirValor();
		
		Contador.Incrementar();
		
		ImprimirValor();
		
		Contador.Zerar();
		
		ImprimirValor();
		
		Contador.Incrementar();
		Contador.Incrementar();
		Contador.Incrementar();
		
		ImprimirValor();
		
		//mesmo instanciando de novo o valor do contador não zera 
		//(coisa que acontece quando nao se tem static)
		//o valor do contador com STATIC é o mesmo para todas as instancias
		Contador c1 = new Contador();
		
		ImprimirValor();
	}

}
