package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuTelefones {

	private JFrame frmMenuDeTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuTelefones window = new TelaMenuTelefones();
					window.frmMenuDeTelefone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenuTelefones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuDeTelefone = new JFrame();
		frmMenuDeTelefone.setTitle("Menu de Telefone");
		frmMenuDeTelefone.setBounds(100, 100, 300, 350);
		frmMenuDeTelefone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuDeTelefone.getContentPane().setLayout(null);
		
		JLabel lblSelecioneOpcao = new JLabel("Selecione a op\u00E7\u00E3o desejada:");
		lblSelecioneOpcao.setBounds(70, 20, 200, 20);
		frmMenuDeTelefone.getContentPane().add(lblSelecioneOpcao);
		
		JButton btnCadastrarTelefone = new JButton("Cadastrar Telefone");
		btnCadastrarTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroTelefones.main(null);
				frmMenuDeTelefone.dispose();
			}
		});
		btnCadastrarTelefone.setBounds(50, 50, 200, 30);
		frmMenuDeTelefone.getContentPane().add(btnCadastrarTelefone);
		
		JButton btnAlterarTelefone = new JButton("Alterar Telefone");
		btnAlterarTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "M�dulo em constru��o. Volte mais tarde!");
			}
		});
		btnAlterarTelefone.setBounds(50, 100, 200, 30);
		frmMenuDeTelefone.getContentPane().add(btnAlterarTelefone);
		
		JButton btnExcluirTelefone = new JButton("Excluir Telefone");
		btnExcluirTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "M�dulo em constru��o. Volte mais tarde!");
			}
		});
		btnExcluirTelefone.setBounds(50, 150, 200, 30);
		frmMenuDeTelefone.getContentPane().add(btnExcluirTelefone);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuPrincipal.main(null);
				frmMenuDeTelefone.dispose();
			}
		});
		btnVoltar.setBounds(50, 250, 200, 30);
		frmMenuDeTelefone.getContentPane().add(btnVoltar);
		
		JButton btnListarTelefones = new JButton("Listar Telefones");
		btnListarTelefones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListagemTelefones.main(null);
				frmMenuDeTelefone.dispose();
			}
		});
		btnListarTelefones.setBounds(50, 200, 200, 30);
		frmMenuDeTelefone.getContentPane().add(btnListarTelefones);
	}
}
