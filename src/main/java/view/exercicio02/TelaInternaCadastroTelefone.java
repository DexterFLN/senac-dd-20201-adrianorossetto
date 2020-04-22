package view.exercicio02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.dao.exercicio01.ClienteDAO;

public class TelaInternaCadastroTelefone extends JInternalFrame {

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
					TelaInternaCadastroTelefone frame = new TelaInternaCadastroTelefone();
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
	public TelaInternaCadastroTelefone() {
		setTitle("Cadastramento de Telefones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDdd = new JLabel("DDD:");
		lblDdd.setBounds(30, 55, 50, 15);
		contentPane.add(lblDdd);
		
		txtDdd = new JTextField();
		txtDdd.setBounds(100, 55, 150, 20);
		contentPane.add(txtDdd);
		txtDdd.setColumns(10);
		
		JLabel lblCodigoPais = new JLabel("DDI:");
		lblCodigoPais.setBounds(30, 25, 50, 15);
		contentPane.add(lblCodigoPais);
		
		txtCodigoPais = new JTextField();
		txtCodigoPais.setBounds(100, 25, 150, 20);
		contentPane.add(txtCodigoPais);
		txtCodigoPais.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(30, 85, 55, 15);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 85, 150, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		ClienteDAO dao = new ClienteDAO();
		
		chckbxTelefoneMovel = new JCheckBox("Telefone M\u00F3vel");
		chckbxTelefoneMovel.setBounds(70, 125, 150, 25);
		contentPane.add(chckbxTelefoneMovel);
		
		chckbxTelefoneAtivo = new JCheckBox("Telefone Ativo");
		chckbxTelefoneAtivo.setBounds(70, 155, 150, 25);
		contentPane.add(chckbxTelefoneAtivo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrar.setBounds(55, 195, 180, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(55, 275, 180, 25);
		contentPane.add(btnCancelar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlterar.setBounds(55, 235, 180, 25);
		contentPane.add(btnAlterar);

	}

}
