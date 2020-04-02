package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import principal.exercicio01.Executavel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuClientes {

	private JFrame frmMenuDeClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuClientes window = new TelaMenuClientes();
					window.frmMenuDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenuClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuDeClientes = new JFrame();
		frmMenuDeClientes.setTitle("Menu de Clientes");
		frmMenuDeClientes.setBounds(100, 100, 300, 250);
		frmMenuDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuDeClientes.getContentPane().setLayout(null);
		
		JLabel lblSelecioneAOpo = new JLabel("Selecione a op\u00E7\u00E3o desejada:");
		lblSelecioneAOpo.setBounds(70, 20, 200, 20);
		frmMenuDeClientes.getContentPane().add(lblSelecioneAOpo);
		
		JButton btnCadastrarNovoCliente = new JButton("Cadastrar Novo Cliente");
		btnCadastrarNovoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executavel.obterClienteDaTela();
			}
		});
		btnCadastrarNovoCliente.setBounds(50, 50, 200, 30);
		frmMenuDeClientes.getContentPane().add(btnCadastrarNovoCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar Cliente");
		btnAlterarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterarCliente.setBounds(50, 100, 200, 30);
		frmMenuDeClientes.getContentPane().add(btnAlterarCliente);
		
		JButton btnExcluirCliente = new JButton("Excluir Cliente");
		btnExcluirCliente.setBounds(50, 150, 200, 30);
		frmMenuDeClientes.getContentPane().add(btnExcluirCliente);
	}

}
