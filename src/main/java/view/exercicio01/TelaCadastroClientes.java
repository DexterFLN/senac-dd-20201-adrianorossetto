package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.exercicio01.ClienteController;
import controller.exercicio01.EnderecoController;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Endereco;
import model.entity.exercicio01.Telefone;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroClientes {

	private JFrame frmCadastroCliente;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtCPF;
	private JComboBox cblEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroClientes window = new TelaCadastroClientes();
					window.frmCadastroCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroCliente = new JFrame();
		frmCadastroCliente.setTitle("Cadastro de Clientes");
		frmCadastroCliente.setBounds(100, 100, 500, 260);
		frmCadastroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroCliente.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 20, 80, 15);
		frmCadastroCliente.getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 60, 80, 15);
		frmCadastroCliente.getContentPane().add(lblSobrenome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 100, 80, 15);
		frmCadastroCliente.getContentPane().add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 140, 80, 15);
		frmCadastroCliente.getContentPane().add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 20, 200, 20);
		frmCadastroCliente.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(100, 60, 200, 20);
		frmCadastroCliente.getContentPane().add(txtSobrenome);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(100, 100, 200, 20);
		frmCadastroCliente.getContentPane().add(txtCPF);
		
		
		EnderecoDAO endDAO = new EnderecoDAO();
		ArrayList<Endereco> listaEnderecos = endDAO.consultarTodos();
		cblEndereco = new JComboBox(listaEnderecos.toArray());
		cblEndereco.setBounds(100, 140, 370, 20);
		frmCadastroCliente.getContentPane().add(cblEndereco);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controller = new ClienteController();
				controller.salvar(txtNome.getText(), txtSobrenome.getText(), txtCPF.getText(), cblEndereco.getSelectedItem());
				
			}
		});
		btnSalvar.setBounds(130, 180, 90, 25);
		frmCadastroCliente.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuClientes.main(null);
				frmCadastroCliente.dispose();
			}
		});
		btnCancelar.setBounds(260, 180, 90, 25);
		frmCadastroCliente.getContentPane().add(btnCancelar);
	}
}
