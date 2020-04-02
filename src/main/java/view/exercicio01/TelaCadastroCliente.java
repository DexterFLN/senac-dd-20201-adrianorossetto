package view.exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio01.ClienteController;
import controller.exercicio01.EnderecoController;
import model.dao.exercicio01.ClienteDAO;
import model.dao.exercicio01.EnderecoDAO;
import model.dao.exercicio01.TelefoneDAO;
import model.entity.exercicio01.Endereco;
import model.entity.exercicio01.Telefone;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNome;
	private JComboBox cbEndereco;
	private JTextField txtSobrenome;
	ClienteDAO dao = new ClienteDAO();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente() {
		setTitle("Cadastramento de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 20, 80, 15);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 100, 80, 15);
		contentPane.add(lblCpf);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 140, 80, 15);
		contentPane.add(lblEndereco);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(100, 100, 200, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 20, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		EnderecoDAO dao = new EnderecoDAO();
		cbEndereco = new JComboBox(dao.consultarTodos().toArray());
		cbEndereco.setBounds(100, 140, 370, 20);
		contentPane.add(cbEndereco);
		
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "";
				ClienteController controller = new ClienteController();
				mensagem += controller.validarSobrenome(txtSobrenome.getText());
				mensagem += controller.validarNome(txtNome.getText());
				mensagem += controller.validarCpf(txtCpf.getText());
				mensagem += controller.validarCpfObrigatorio(txtCpf.getText());
				if(mensagem.isEmpty()) {
					controller.salvarCliente(txtNome.getText(), txtSobrenome.getText(), txtCpf.getText(), cbEndereco.getSelectedItem());
				}
				
			}
		});
		btnSalvar.setBounds(130, 180, 90, 25);
		contentPane.add(btnSalvar);
		
		
		
		
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 60, 80, 15);
		contentPane.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(100, 60, 200, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuClientes.main(null);
				dispose();
			}
		});
		btnCancelar.setBounds(260, 180, 90, 25);
		contentPane.add(btnCancelar);
	}

}

