package view.exercicio02;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaInternaCadastroCliente extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaCadastroCliente frame = new TelaInternaCadastroCliente();
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
	public TelaInternaCadastroCliente() {
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setTitle("Cadastrar cliente");
		setBounds(100, 100, 450, 300);


		JLabel lblNome = new JLabel("Nome:");
		getContentPane().add(lblNome, "6, 8");
		getContentPane().setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(0, 0, 0, 0);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		getContentPane().add(lblSobrenome, "6, 12");

		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(0, 0, 0, 0);
		getContentPane().add(txtSobrenome);
		txtSobrenome.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		getContentPane().add(btnSalvar, "10, 20");

	}

}