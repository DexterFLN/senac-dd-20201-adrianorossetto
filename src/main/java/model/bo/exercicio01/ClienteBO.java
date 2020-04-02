package model.bo.exercicio01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;

public class ClienteBO {

	private ClienteDAO dao;

	public String excluir(int idSelecionado) {
		String mensagem = "";

		ClienteDAO clienteDAO = new ClienteDAO();
		if (clienteDAO.temClienteCadastradoComEsteID(idSelecionado) == false) {
			mensagem = "Cliente informado não existe no Banco de Dados. Informe um ID correto.";
		} else {
			if (clienteDAO.excluir(idSelecionado)) {
				mensagem = "Cliente excluído com sucesso";
			} else {
				mensagem = "Erro ao excluir";
			}
		}

		return mensagem;
	}
	
	public ArrayList<Cliente> pesquisarTodos() {
		return dao.consultarTodos();
	}

	public String salvar(Cliente cliente) {
        String mensagem = "";

        if(dao.cpfJaUtilizado(cliente.getCpf())) {
            mensagem = "CPF informado (" + cliente.getCpf() + ") já foi utilizado";
            JOptionPane.showMessageDialog(null, mensagem);

        }else {
            cliente = dao.salvar(cliente);

            if(cliente.getId() > 0) {
                mensagem = "Cliente salvo com sucesso";
                JOptionPane.showMessageDialog(null, mensagem);
            }else {
                mensagem = "Erro ao salvar cliente";
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

        return mensagem;
    }
	

	// TODO criar os métodos para chamar os métodos PÚBLICOS no ClienteDAO
}