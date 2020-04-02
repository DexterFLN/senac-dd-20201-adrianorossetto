package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuEnderecos {

	private JFrame frmMenuEnderecos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuEnderecos window = new TelaMenuEnderecos();
					window.frmMenuEnderecos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenuEnderecos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuEnderecos = new JFrame();
		frmMenuEnderecos.setBounds(100, 100, 300, 300);
		frmMenuEnderecos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuEnderecos.getContentPane().setLayout(null);
		
		JLabel lblSelecioneOpcao = new JLabel("Selecione a op\u00E7\u00E3o desejada:");
		lblSelecioneOpcao.setBounds(70, 20, 200, 20);
		frmMenuEnderecos.getContentPane().add(lblSelecioneOpcao);
		
		JButton btnCadastrarEndereco = new JButton("Cadastrar Endere\u00E7o");
		btnCadastrarEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroEndereco.main(null);
				frmMenuEnderecos.dispose();
			}
		});
		btnCadastrarEndereco.setBounds(50, 50, 200, 30);
		frmMenuEnderecos.getContentPane().add(btnCadastrarEndereco);
		
		JButton btnAlterarEndereco = new JButton("Alterar Endere\u00E7o");
		btnAlterarEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Módulo em construção. Volte mais tarde!");
			}
		});
		btnAlterarEndereco.setBounds(50, 100, 200, 30);
		frmMenuEnderecos.getContentPane().add(btnAlterarEndereco);
		
		JButton btnExcluirEndereco = new JButton("Excluir Endere\u00E7o");
		btnExcluirEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExclusaoEndereco.main(null);
				frmMenuEnderecos.dispose();
			}
		});
		btnExcluirEndereco.setBounds(50, 150, 200, 30);
		frmMenuEnderecos.getContentPane().add(btnExcluirEndereco);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuPrincipal.main(null);
				frmMenuEnderecos.dispose();
			}
		});
		btnVoltar.setBounds(50, 200, 200, 30);
		frmMenuEnderecos.getContentPane().add(btnVoltar);
	}

}
