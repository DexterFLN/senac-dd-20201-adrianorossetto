package controller.exercicio01;

import model.bo.exercicio01.EnderecoBO;

public class EnderecoController {

	private EnderecoBO bo = new EnderecoBO();

	public String excluir(String textoIdSelecionado) {

		String mensagem = "";
		try {
			int idSelecionado = Integer.parseInt(textoIdSelecionado);
			mensagem = bo.excluir(idSelecionado);
		} catch (NumberFormatException ex) {
			mensagem = "Informe um n�mero inteiro";
		}
		return mensagem;
	}

}