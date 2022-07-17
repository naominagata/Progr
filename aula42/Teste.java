package aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//exemplo02
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "AA";
		//nao pode modificar pq eh final
		
		final int total = 1;
		//total = total+1;
		System.out.println(total);
	}

}
