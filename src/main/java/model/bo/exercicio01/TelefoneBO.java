package model.bo.exercicio01;

import model.dao.exercicio01.TelefoneDAO;
import model.entity.exercicio01.Telefone;

public class TelefoneBO {
	
	private TelefoneDAO dao = new TelefoneDAO();

	public String salvar(Telefone novoTelefone) {
		String mensagem = "";

		novoTelefone = dao.salvar(novoTelefone);

		if (novoTelefone.getId() > 0) {
			mensagem = "Telefone cadastrado com sucesso";
		} else {
			mensagem = "Erro ao cadastrar telefone";
		}
		return mensagem;
	}

	// TODO criar os m�todos para chamar os m�todos P�BLICOS no TelefoneDAO
}