package view.exercicio02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class TelaInternaExclusaoTelefone extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaExclusaoTelefone frame = new TelaInternaExclusaoTelefone();
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
	public TelaInternaExclusaoTelefone() {
		setTitle("Exclus\u00E3o de Telefone");
		setBounds(100, 100, 350, 215);
		getContentPane().setLayout(null);
		
		JLabel lblSelecionarTelefone = new JLabel("Selecione o telefone que deseja excluir:");
		lblSelecionarTelefone.setBounds(55, 45, 270, 15);
		getContentPane().add(lblSelecionarTelefone);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(55, 120, 90, 25);
		getContentPane().add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(170, 120, 90, 25);
		getContentPane().add(btnCancelar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(55, 70, 250, 25);
		getContentPane().add(comboBox);

	}

}
