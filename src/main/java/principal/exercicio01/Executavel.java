package principal.exercicio01;

import java.util.ArrayList;


import javax.swing.JOptionPane;

import controller.exercicio01.ClienteController;
import controller.exercicio01.TelefoneController;
import model.bo.exercicio01.ClienteBO;
import model.dao.exercicio01.ClienteDAO;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Endereco;
import model.entity.exercicio01.Telefone;
import view.exercicio01.TelaMenuPrincipal;

import java.util.List;

public class Executavel {

	public static void main(String[] argumentosLinhaDeComando) {

		// executarExercicio2();

		executarMenuPrincipal();
	}

	private static void executarMenuPrincipal() {
		TelaMenuPrincipal.main(null);
	}

	/**
	 * Exerc�cio 2 - Cadastro de cliente com JOptionPane
	 * 
	 * Obt�m um cliente da tela e salva no banco
	 * 
	 * Obs.: ainda est� violando o MVC, pois chama um BO (da camada model), o
	 * correto � chamar um controller.
	 */
	
	/*
	private static void executarExercicio2() {
		Cliente cliente1 = obterClienteDaTela();

		// - Salvar no banco (APENAS TESTES, AINDA VIOLANDO O MVC)
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente mensagem = clienteDAO.salvar(cliente1);

		JOptionPane.showMessageDialog(null, mensagem);
	}
	 */
	
	/**
	 * Exerc�cio 3 - Cadastro de telefones com JOptionPane
	 * 
	 * Obt�m um telefone da tela e salva no banco
	 * 
	 * Salvar telefones com e sem dono.
	 */
	
	/*
	private static void executarExercicio3() {
		Telefone novoTelefone = obterTelefoneDaTela();

		TelefoneController controlador = new TelefoneController();
		String mensagem = controlador.salvar(novoTelefone);

		JOptionPane.showMessageDialog(null, mensagem);
	}
	*/
	
	/*
	private static Telefone obterTelefoneDaTela() {
		Telefone novoTelefone = new Telefone();

		String codigoPais = JOptionPane.showInputDialog("Informe o c�digo do pa�s");
		String ddd = JOptionPane.showInputDialog("Informe o DDD (2 d�gitos)");
		String numero = JOptionPane.showInputDialog("Informe o n�mero");
		int opcaoMovel = JOptionPane.showConfirmDialog(null, "O telefone � m�vel?", "Selecione",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		int opcaoAtivo = JOptionPane.showConfirmDialog(null, "O telefone est� ativo?", "Selecione",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

		novoTelefone.setCodigoPais(codigoPais);
		novoTelefone.setDdd(ddd);
		novoTelefone.setNumero(numero);
		novoTelefone.setMovel(opcaoMovel == JOptionPane.YES_OPTION);
		novoTelefone.setAtivo(opcaoAtivo == JOptionPane.YES_OPTION);

		//int opcaoDono = JOptionPane.showConfirmDialog(null, "O telefone possui dono?", "Selecione",
			//	JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

		if (opcaoAtivo == JOptionPane.YES_OPTION) {
			ClienteController controlador = new ClienteController();
			ArrayList<Cliente> clientes = controlador.listarTodosOsClientes();

			Cliente clienteSelecionado = (Cliente) JOptionPane.showInputDialog(null, "Selecione um cliente", "Clientes",
					JOptionPane.QUESTION_MESSAGE, null, clientes.toArray(), null);

	
		}

		return novoTelefone;
	}
	*/
	
	/*
	public static Cliente obterClienteDaTela() {
		String nome = JOptionPane.showInputDialog("Informe o nome");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome");
		String cpf = JOptionPane.showInputDialog("Informe o CPF");

		EnderecoDAO endDAO = new EnderecoDAO();
		ArrayList<Endereco> listaEnderecos = endDAO.consultarTodos();

		Object[] enderecos = listaEnderecos.toArray();
		Endereco enderecoSelecionado = (Endereco) JOptionPane.showInputDialog(null, "Selecione um endere�o", "Endere�o",
				JOptionPane.QUESTION_MESSAGE, null, enderecos, null);

		Cliente novoCliente = new Cliente(nome, sobrenome, cpf, new ArrayList<Telefone>(), enderecoSelecionado);

		return novoCliente;
	}
	*/
}
	