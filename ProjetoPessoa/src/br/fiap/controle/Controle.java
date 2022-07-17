package br.fiap.controle;

import java.util.ArrayList;

import br.fiap.cliente.Cliente;
import br.fiap.empregado.Gerente;
import br.fiap.empregado.Vendedor;
import br.fiap.pessoa.Pessoa;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Controle {

	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	// menu principal da aplica��o
	public void menuPrincipal() {
		int opcao = 0;
		
		String menu = "Escolha uma op��o:\n";
		menu += "1. Cadastrar Empregado\n";
		menu += "2. Cadastrar Cliente\n";
		menu += "3. Pesquisar\n";
		menu += "4. Listar Empregados\n";
		menu += "5. Listar Clientes\n";
		menu += "6. Remover\n";
		menu += "7. Finalizar";
		
		do {
			
			try {
				opcao = parseInt(showInputDialog(menu));
				if(opcao < 1 || opcao > 7) {
					showMessageDialog(null, "Op��o inv�lida");
				} else {
					switch(opcao) {
						case 1:
							cadastrarEmpregado();
							break;
						case 2:
							cadastrarCliente();
							break;
						case 3:
							pesquisar();
							break;
						case 4:
							listarEmpregado();
							break;
						case 5:
							listarCliente();
							break;
						case 6:
							remover();
							break;
					}
				}
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "Voc� deve informar uma op��o num�rica");
			}
			
		} while(opcao != 7);
		
	}

	// m�todo para remover uma pessoa pelo seu CPF
	private void remover() {
		int resposta;
		int indice = pesquisarAux();
		if(indice == -1) {
			showMessageDialog(null, "N�o encontrado");
		} else {
			resposta = showConfirmDialog(null, "Confirma a exclus�o?");
			if(resposta == 0) {
				lista.remove(indice);
			}
		}		
	}

	// m�todo para pesquisar e exibir os dados de uma pessoa
	private void pesquisar() {
		String aux = "";
		int indice = pesquisarAux();
		if(indice == -1) {
			showMessageDialog(null, "N�o encontrado");
		} else {
			if(lista.get(indice) instanceof Cliente) {
				aux += "Cliente:\n";
			} else {
				aux += "Empregado:\n";
			}
			aux += lista.get(indice);
			showMessageDialog(null, aux);
		}
		
	}

	// m�todo para percorrer a lista e encontrar uma pessoa pelo CPF
	private int pesquisarAux() {
		int indice = -1;
		String cpf = showInputDialog("CPF para pesquisa");
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCpf().equals(cpf)) {
				indice = i;
			}
		}		
		return indice;
	}

	// m�todo para listar os clientes armazenados na lista
	private void listarCliente() {
		String cliente = "";
		for(Pessoa pessoa : lista) {
			if(pessoa instanceof Cliente) {
				cliente += pessoa + "\n";
			}
		}
		showMessageDialog(null, cliente);
	}

	// m�todo para listar os empregados armazenados na lista	
	private void listarEmpregado() {
		String gerente = "";
		String vendedor = "";
		
		for(Pessoa pessoa : lista) {
			if(pessoa instanceof Gerente) {
				gerente += pessoa + "\n"; // pessoa.toString();
			} else if(pessoa instanceof Vendedor) {
				vendedor += pessoa + "\n";
			}
		}
		
		showMessageDialog(null, gerente + "\n" + vendedor);
	}

	// m�todo para cadastrar um cliente
	private void cadastrarCliente() {
		String nome, cpf;
		double valorDaDivida;
		
		nome = showInputDialog("Nome");
		cpf = showInputDialog("CPF");
		valorDaDivida = parseDouble(showInputDialog("Valor da d�vida"));
		lista.add(new Cliente(nome, cpf, valorDaDivida));
		
	}

	// m�todo para cadastrar um empregado
	private void cadastrarEmpregado() {
		String nome, cpf, matricula;
		double salario, bonus;
		double totalDasVendas, comissao;
		int opcao = 0;
		String menu = "Escolha uma op��o\n";
		
		menu += "1. Gerente\n";
		menu += "2. Vendedor\n";
		menu += "3. Retornar\n";
		
		do {
			try {
				opcao = parseInt(showInputDialog(menu));
				if(opcao < 1 || opcao > 3) {
					showMessageDialog(null, "Op��o inv�lida");
				} else {
					if(opcao == 1 || opcao == 2) {
						nome = showInputDialog("Nome");
						cpf = showInputDialog("CPF");
						matricula = showInputDialog("Matr�cula");
						if(opcao == 1) {
							salario = parseDouble(showInputDialog("Sal�rio"));
							bonus = parseDouble(showInputDialog("B�nus"));
							lista.add(new Gerente(nome, cpf, matricula, salario, bonus));
						} else {
							totalDasVendas = parseDouble(showInputDialog("Total das vendas"));
							comissao = parseDouble(showInputDialog("Comiss�o"));
							lista.add(new Vendedor(nome, cpf, matricula, totalDasVendas, comissao));
						}
					}
				}
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "Voc� deve digitar uma op��o num�rica");
			}
		} while(opcao != 3);
	}
}
