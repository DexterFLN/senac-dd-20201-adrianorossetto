package view.exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.exercicio01.ClienteController;
import controller.exercicio01.TelefoneController;
import model.dao.exercicio01.ClienteDAO;
import model.entity.exercicio01.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class TelaCadastroTelefones extends JFrame {

	private JPanel contentPane;
	private JTextField txtDdd;
	private JTextField txtCodigoPais;
	private JTextField txtNumero;
	private JCheckBox chckbxTelefoneMovel;
	private JCheckBox chckbxTelefoneAtivo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroTelefones frame = new TelaCadastroTelefones();
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
	public TelaCadastroTelefones() {
		setTitle("Cadastramento de Telefones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDdd = new JLabel("DDD:");
		lblDdd.setBounds(30, 50, 50, 15);
		contentPane.add(lblDdd);
		
		txtDdd = new JTextField();
		txtDdd.setBounds(100, 50, 150, 20);
		contentPane.add(txtDdd);
		txtDdd.setColumns(10);
		
		JLabel lblCodigoPais = new JLabel("DDI:");
		lblCodigoPais.setBounds(30, 20, 50, 15);
		contentPane.add(lblCodigoPais);
		
		txtCodigoPais = new JTextField();
		txtCodigoPais.setBounds(100, 20, 150, 20);
		contentPane.add(txtCodigoPais);
		txtCodigoPais.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(30, 80, 55, 15);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 80, 150, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		ClienteDAO dao = new ClienteDAO();
		
		chckbxTelefoneMovel = new JCheckBox("Telefone M\u00F3vel");
		chckbxTelefoneMovel.setBounds(70, 120, 150, 25);
		contentPane.add(chckbxTelefoneMovel);
		
		chckbxTelefoneAtivo = new JCheckBox("Telefone Ativo");
		chckbxTelefoneAtivo.setBounds(70, 150, 150, 25);
		contentPane.add(chckbxTelefoneAtivo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "";
				TelefoneController controller = new TelefoneController();
				Cliente clienteSelecionado = new Cliente();
				
				if(chckbxTelefoneAtivo.isSelected()) {
					ClienteController clienteControladora = new ClienteController();
					ArrayList<Cliente> clientes = clienteControladora.listarTodosOsClientes();

					clienteSelecionado = (Cliente) JOptionPane.showInputDialog(null, "Selecione um cliente", "Clientes",
							JOptionPane.QUESTION_MESSAGE, null, clientes.toArray(), null);
				} else {
					clienteSelecionado = null;
				}
				
				mensagem += controller.validarCodigoPais(txtCodigoPais.getText());
				mensagem += controller.validarDdd(txtDdd.getText());
				mensagem += controller.validarNumero(txtNumero.getText());
				mensagem += controller.validarNumeroObrigatorio(txtNumero.getText());
				if(mensagem.isEmpty()) {
					controller.salvarTelefone(clienteSelecionado,txtCodigoPais.getText(), txtDdd.getText(), txtNumero.getText(), chckbxTelefoneAtivo.isSelected(), chckbxTelefoneMovel.isSelected());
				}
								
			}
		});
		btnSalvar.setBounds(55, 180, 180, 25);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuTelefones.main(null);
				dispose();
			}
		});
		btnCancelar.setBounds(55, 220, 180, 25);
		contentPane.add(btnCancelar);
		
		
		
		
	}
}