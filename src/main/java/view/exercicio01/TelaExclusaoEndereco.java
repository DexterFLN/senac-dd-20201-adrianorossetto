package view.exercicio01;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.exercicio01.EnderecoController;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Endereco;

import javax.swing.JComboBox;

public class TelaExclusaoEndereco {

	private JFrame frmExclusaoEnderecos;
	private JComboBox cbEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoEndereco window = new TelaExclusaoEndereco();
					window.frmExclusaoEnderecos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaExclusaoEndereco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExclusaoEnderecos = new JFrame();
		frmExclusaoEnderecos.setTitle("Exclusão de endereços");
		frmExclusaoEnderecos.setBounds(100, 100, 310, 175);
		frmExclusaoEnderecos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExclusaoEnderecos.getContentPane().setLayout(null);

		JLabel lblIdEndereco = new JLabel("Selecione o endere\u00E7o que deseja excluir:");
		lblIdEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdEndereco.setBounds(30, 30, 250, 15);
		frmExclusaoEnderecos.getContentPane().add(lblIdEndereco);

		EnderecoDAO dao = new EnderecoDAO();
		cbEndereco = new JComboBox(dao.consultarTodos().toArray());
		cbEndereco.setBounds(30, 50, 250, 22);
		frmExclusaoEnderecos.getContentPane().add(cbEndereco);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnderecoController controladora = new EnderecoController();
				
				String mensagem = controladora.excluir((Endereco) cbEndereco.getSelectedItem());
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btnExcluir.setBounds(50, 95, 90, 25);
		frmExclusaoEnderecos.getContentPane().add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuEnderecos.main(null);
				frmExclusaoEnderecos.dispose();
			}
		});
		btnCancelar.setBounds(170, 95, 90, 25);
		frmExclusaoEnderecos.getContentPane().add(btnCancelar);
		
	}
}