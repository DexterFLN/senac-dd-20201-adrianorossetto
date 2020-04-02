package view.exercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.exercicio01.ClienteController;
import controller.exercicio01.TelefoneController;
import model.entity.exercicio01.Cliente;
import model.entity.exercicio01.Telefone;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroTelefone {

	private JFrame frmCadastroTelefone;
	private JTextField txtDdi;
	private JTextField txtDdd;
	private JTextField txtNumero;
	private JCheckBox chckbxTelefoneAtivo;
	private JCheckBox chckbxTelefoneMovel;
	private JButton btnCadastrar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroTelefone window = new TelaCadastroTelefone();
					window.frmCadastroTelefone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroTelefone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroTelefone = new JFrame();
		frmCadastroTelefone.setTitle("Cadastro de Telefone");
		frmCadastroTelefone.setBounds(100, 100, 300, 300);
		frmCadastroTelefone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroTelefone.getContentPane().setLayout(null);
		
		JLabel lblDdi = new JLabel("DDI:");
		lblDdi.setBounds(30, 20, 50, 15);
		frmCadastroTelefone.getContentPane().add(lblDdi);
		
		txtDdi = new JTextField();
		txtDdi.setBounds(100, 20, 150, 20);
		frmCadastroTelefone.getContentPane().add(txtDdi);
		txtDdi.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD:");
		lblDdd.setBounds(30, 50, 50, 15);
		frmCadastroTelefone.getContentPane().add(lblDdd);
		
		txtDdd = new JTextField();
		txtDdd.setBounds(100, 50, 150, 20);
		frmCadastroTelefone.getContentPane().add(txtDdd);
		txtDdd.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(30, 80, 55, 15);
		frmCadastroTelefone.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(100, 80, 150, 20);
		frmCadastroTelefone.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		chckbxTelefoneMovel = new JCheckBox("Telefone M\u00F3vel");
		chckbxTelefoneMovel.setBounds(70, 120, 150, 25);
		frmCadastroTelefone.getContentPane().add(chckbxTelefoneMovel);
		
		chckbxTelefoneAtivo = new JCheckBox("Telefone Ativo");
		chckbxTelefoneAtivo.setBounds(70, 150, 150, 25);
		frmCadastroTelefone.getContentPane().add(chckbxTelefoneAtivo);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelefoneController telefoneControladora = new TelefoneController();
				Telefone novoTelefone = new Telefone();
				novoTelefone.setCodigoPais(txtDdi.getText());
				novoTelefone.setDdd(txtDdd.getText());
				novoTelefone.setNumero(txtNumero.getText());
				if(chckbxTelefoneMovel.isSelected()) {
					novoTelefone.setMovel(true);
				} else {
					novoTelefone.setMovel(false);
				}
				if(chckbxTelefoneAtivo.isSelected()) {
					novoTelefone.setAtivo(true);
					ClienteController clienteControladora = new ClienteController();
					ArrayList<Cliente> clientes = clienteControladora.listarTodosOsClientes();

					Cliente clienteSelecionado = (Cliente) JOptionPane.showInputDialog(null, "Selecione um cliente", "Clientes",
							JOptionPane.QUESTION_MESSAGE, null, clientes.toArray(), null);
					novoTelefone.setDono(clienteSelecionado);
				} else {
					novoTelefone.setAtivo(false);
					novoTelefone.setDono(null);
				}
				telefoneControladora.salvar(novoTelefone);
			}
		});
		btnCadastrar.setBounds(55, 180, 180, 25);
		frmCadastroTelefone.getContentPane().add(btnCadastrar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuTelefones.main(null);
				frmCadastroTelefone.dispose();
			}
			
		});
		btnCancelar.setBounds(55, 220, 180, 25);
		frmCadastroTelefone.getContentPane().add(btnCancelar);
	}
}
