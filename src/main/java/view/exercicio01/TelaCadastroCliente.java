package view.exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio01.ClienteController;
import model.dao.exercicio01.EnderecoDAO;
import model.entity.exercicio01.Endereco;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtCpf;
	private JComboBox cblEndereco;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(37, 45, 80, 15);
		contentPane.add(label);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(137, 42, 200, 20);
		contentPane.add(txtNome);
		
		JLabel label_1 = new JLabel("Sobrenome:");
		label_1.setBounds(37, 82, 80, 15);
		contentPane.add(label_1);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(137, 79, 200, 20);
		contentPane.add(txtSobrenome);
		
		JLabel label_2 = new JLabel("CPF:");
		label_2.setBounds(37, 124, 80, 15);
		contentPane.add(label_2);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(137, 121, 200, 20);
		contentPane.add(txtCpf);
		
		JLabel label_3 = new JLabel("Endere\u00E7o:");
		label_3.setBounds(10, 163, 80, 15);
		contentPane.add(label_3);
		
		cblEndereco = new JComboBox(new Object[]{});
		EnderecoDAO endDAO = new EnderecoDAO();
		ArrayList<Endereco> listaEnderecos = endDAO.consultarTodos();
		cblEndereco = new JComboBox(listaEnderecos.toArray());
		cblEndereco.setBounds(104, 160, 370, 20);
		contentPane.add(cblEndereco);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteController controller = new ClienteController();
				controller.salvar(txtNome.getText(), txtSobrenome.getText(), txtCpf.getText(), cblEndereco.getSelectedItem());
			}
		});
		btnSalvar.setBounds(137, 202, 90, 25);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(276, 203, 90, 25);
		contentPane.add(btnCancelar);
	}
}
