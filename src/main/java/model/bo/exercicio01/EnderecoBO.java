package model.bo.exercicio01;

import model.dao.exercicio01.ClienteDAO;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Endereco;

public class EnderecoBO {

	private EnderecoDAO dao = new EnderecoDAO();

	public String excluir(int idSelecionado) {
		String mensagem = "";

		ClienteDAO clienteDAO = new ClienteDAO();
		if (clienteDAO.temClienteMorandoNoEndereco(idSelecionado)) {
			mensagem = "Endere�o informado n�o pode ser exclu�do, pois existe cliente morando nele.";
		} else {
			if (dao.excluir(idSelecionado)) {
				mensagem = "Exclu�do com sucesso";
			} else {
				mensagem = "Erro ao excluir";
			}
		}

		return mensagem;
	}

	public String salvar(Endereco novoEndereco) {
		String mensagem = "";

		novoEndereco = dao.salvar(novoEndereco);

		if (novoEndereco.getId() > 0) {
			mensagem = "Salvo com sucesso";
		} else {
			mensagem = "Erro ao salvar";
		}

		return mensagem;
	}

	// TODO criar os m�todos para chamar os m�todos P�BLICOS no EnderecoDAO
}