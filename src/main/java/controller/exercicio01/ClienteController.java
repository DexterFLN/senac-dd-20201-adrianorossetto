package controller.exercicio01;

import java.util.ArrayList;

import model.bo.exercicio01.ClienteBO;
import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Endereco;
import model.entity.exercicio01.Telefone;

public class ClienteController {

	private ClienteDAO dao = new ClienteDAO();
	private ClienteBO bo = new ClienteBO();

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
	}
	
	public String excluir(String textoIdSelecionado) {
		String mensagem = "";
		try {
			int idSelecionado = Integer.parseInt(textoIdSelecionado);
			mensagem = bo.excluir(idSelecionado);
		} catch (NumberFormatException ex) {
			mensagem = "Informe um número inteiro";
		}
		return mensagem;
	}

	public String salvar(String nome, String sobrenome, String cpf, Object endereco) {
		String mensagem = "";
		
		ClienteBO bo = new ClienteBO();
		Cliente cliente = criarCliente(nome, sobrenome, cpf, endereco);
		bo.salvar(cliente);
		return mensagem;
		
	}

	private Cliente criarCliente(String nome, String sobrenome, String cpf, Object endereco) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setSobrenome(sobrenome);
		cliente.setCpf(cpf);
		
		Endereco enderecoSelecionado = (Endereco) endereco;
		cliente.setEndereco(enderecoSelecionado);
		return cliente;
	}
	
}