package controller.exercicio01;

import java.util.ArrayList;

import model.bo.exercicio01.ClienteBO;
import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;
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

	public void salvar(String nome, String sobrenome, String cpf, ArrayList<Telefone> telefone, String endereco) {
		// TODO Auto-generated method stub
		
	}
	
}