package principal.exercicio01;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.bo.exercicio01.ClienteBO;
import model.dao.exercicio01.ClienteDAO;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Endereco;
import model.entity.exercicio01.Telefone;

public class Executavel {

	public static void main(String[] args) {
		
		// TODO criar e SALVAR telefones
				ArrayList<Telefone> telefones = new ArrayList<Telefone>();

				// Exercício 2
				//Cliente cliente1 = obterClienteDaTela();
				Telefone telefone1 = cadastrarTelefoneDaTela();

				// - Salvar no banco (APENAS TESTES, AINDA VIOLANDO O MVC)
				ClienteBO clienteBO = new ClienteBO();
				//String mensagem = clienteBO.salvar(cliente1);

				//JOptionPane.showMessageDialog(null, mensagem);
				
			}

			private static Cliente obterClienteDaTela() {
				String nome = JOptionPane.showInputDialog("Informe o nome");
				String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome");
				String cpf = JOptionPane.showInputDialog("Informe o CPF");

				EnderecoDAO endDAO = new EnderecoDAO();
				ArrayList<Endereco> listaEnderecos = endDAO.consultarTodos();
				
				Object[] enderecos = listaEnderecos.toArray();
				Endereco enderecoSelecionado = (Endereco) JOptionPane.showInputDialog(null, 
						"Selecione um endereço", "Endereço", 
						JOptionPane.QUESTION_MESSAGE, 
						null, enderecos, null);

				Cliente novoCliente = new Cliente(nome, sobrenome, cpf, 
						new ArrayList<Telefone>(), enderecoSelecionado);

				return novoCliente;
			}
			
			private static Telefone cadastrarTelefoneDaTela() {
				String codigoPais = JOptionPane.showInputDialog("Informe o código telefônico do País: ");
				String ddd = JOptionPane.showInputDialog("Informe o DDD do telefone: ");
				String numero = JOptionPane.showInputDialog("Informe o número do telefone: ");
				int movel = JOptionPane.showConfirmDialog(null, "Este número é de um telefone móvel?");
				int dono = JOptionPane.showConfirmDialog(null, "Há proprietário para este número?");
				
				if (dono == 1) {
					ClienteDAO clienteDAO = new ClienteDAO();
					ArrayList<Cliente> listaClientes = clienteDAO.consultarTodos();
					Object[] clientes = listaClientes.toArray();
					Cliente clienteSelecionado = (Cliente) JOptionPane.showInputDialog(null, 
							"Selecione um cliente: ", "Cliente", 
							JOptionPane.QUESTION_MESSAGE, 
							null, clientes, null);
					
				} else {
					
				}
				return null;
			}

}
