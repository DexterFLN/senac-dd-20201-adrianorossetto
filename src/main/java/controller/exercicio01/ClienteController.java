package controller.exercicio01;

import java.util.ArrayList;

import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;

public class ClienteController {

	private ClienteDAO dao = new ClienteDAO();

	public ArrayList<Cliente> listarTodosOsClientes() {
		return dao.consultarTodos();
	}
}