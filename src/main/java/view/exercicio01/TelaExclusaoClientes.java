package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.exercicio01.ClienteController;
import controller.exercicio01.EnderecoController;
import model.entity.exercicio01.Cliente;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTextField;

public class TelaExclusaoClientes {

	private JFrame frmExclusaoClientes;
	private JTextField txtIdExcluirCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExclusaoClientes window = new TelaExclusaoClientes();
					window.frmExclusaoClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaExclusaoClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExclusaoClientes = new JFrame();
		frmExclusaoClientes.setTitle("Exclus\u00E3o de Clientes");
		frmExclusaoClientes.setBounds(100, 100, 350, 210);
		frmExclusaoClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExclusaoClientes.getContentPane().setLayout(null);
		
		JLabel lblExcluirCliente = new JLabel("Digite o id do cliente que deseja excluir:");
		lblExcluirCliente.setBounds(35, 35, 270, 15);
		frmExclusaoClientes.getContentPane().add(lblExcluirCliente);
		
		txtIdExcluirCliente = new JTextField();
		txtIdExcluirCliente.setBounds(35, 60, 270, 20);
		frmExclusaoClientes.getContentPane().add(txtIdExcluirCliente);
		txtIdExcluirCliente.setColumns(10);
		
		JButton btnExcluirCliente = new JButton("Excluir");
		btnExcluirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClienteController controladora = new ClienteController();

				String mensagem = controladora.excluir(txtIdExcluirCliente.getText());
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btnExcluirCliente.setBounds(70, 115, 90, 25);
		frmExclusaoClientes.getContentPane().add(btnExcluirCliente);
		
		JButton btnCancelarExclusao = new JButton("Cancelar");
		btnCancelarExclusao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmExclusaoClientes.dispose();
			}
		});
		
		btnCancelarExclusao.setBounds(180, 115, 90, 25);
		frmExclusaoClientes.getContentPane().add(btnCancelarExclusao);
		
		
	}
}
