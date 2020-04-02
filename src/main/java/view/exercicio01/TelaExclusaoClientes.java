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
	private JComboBox cblCliente;

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
		
		JLabel lblExcluirCliente = new JLabel("Selecione o cliente que deseja excluir:");
		lblExcluirCliente.setBounds(35, 35, 270, 15);
		frmExclusaoClientes.getContentPane().add(lblExcluirCliente);
		
		ClienteController clienteControladora = new ClienteController();
		ArrayList<Cliente> clientes = clienteControladora.listarTodosOsClientes();
		
		cblCliente = new JComboBox(clientes.toArray());
		cblCliente.setBounds(35, 60, 280, 25);
		frmExclusaoClientes.getContentPane().add(cblCliente);
		
		JButton btnExcluirCliente = new JButton("Excluir");
		btnExcluirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClienteController controladora = new ClienteController();

				String mensagem = controladora.excluir((Cliente) cblCliente.getSelectedItem());
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		btnExcluirCliente.setBounds(70, 115, 90, 25);
		frmExclusaoClientes.getContentPane().add(btnExcluirCliente);
		
		JButton btnCancelarExclusao = new JButton("Cancelar");
		btnCancelarExclusao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuClientes.main(null);
				frmExclusaoClientes.dispose();
			}
		});
		btnCancelarExclusao.setBounds(180, 115, 90, 25);
		frmExclusaoClientes.getContentPane().add(btnCancelarExclusao);
		
		
		
		
	}
}
