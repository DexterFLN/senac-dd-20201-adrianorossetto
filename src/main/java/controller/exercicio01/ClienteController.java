package controller.exercicio01;

import java.util.ArrayList;

import model.bo.exercicio01.ClienteBO;
import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Endereco;

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

	public String salvar(String txtNome, String txtSobrenome, String txtCpf, Object txtEndereco) {
		String mensagem = "";
		
		ClienteBO bo = new ClienteBO();
		Cliente cliente = criarCliente(txtNome, txtSobrenome, txtCpf, txtEndereco);
		bo.salvar(cliente);
		return mensagem;
		
	}

	private Cliente criarCliente(String txtNome, String txtSobrenome, String txtCpf, Object txtEndereco) {
		Cliente cliente = new Cliente();
		cliente.setNome(txtNome);
		cliente.setSobrenome(txtSobrenome);
		cliente.setCpf(txtCpf);
		
		Endereco endereco = (Endereco) txtEndereco;
		cliente.setEndereco(endereco);
		return cliente;
	}
	
}