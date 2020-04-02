package model.bo.exercicio01;

import java.util.ArrayList;

import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;

public class ClienteBO {

	private ClienteDAO dao;

	public String excluir(int idSelecionado) {
		String mensagem = "";

		ClienteDAO clienteDAO = new ClienteDAO();
		if (clienteDAO.temClienteCadastradoComEsteID(idSelecionado) == false) {
			mensagem = "Cliente informado n�o existe no Banco de Dados. Informe um ID correto.";
		} else {
			if (clienteDAO.excluir(idSelecionado)) {
				mensagem = "Cliente exclu�do com sucesso";
			} else {
				mensagem = "Erro ao excluir";
			}
		}

		return mensagem;
	}
	
	public ArrayList<Cliente> pesquisarTodos() {
		return dao.consultarTodos();
	}

	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	

	// TODO criar os m�todos para chamar os m�todos P�BLICOS no ClienteDAO
}