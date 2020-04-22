package view.exercicio02;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.entity.exercicio01.Telefone;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInternaListarTelefones extends JInternalFrame {

	private JTable tblTelefones;
	private ArrayList<Telefone> telefones;
	private String[] nomesColunas = { "Código País", "DDD", "Número", "Móvel", "Ativo", "ID Cliente" };
	private JTable table;
	
	private void limparTabelaTelefones() {
		tblTelefones.setModel(new DefaultTableModel(new Object[][] { nomesColunas, }, nomesColunas));
	}
	
	private void atualizarTabelaTelefones() {
		limparTabelaTelefones();
		DefaultTableModel model = (DefaultTableModel) tblTelefones.getModel();

		for (Telefone t : telefones) {

			Object[] novaLinhaDaTabela = new Object[6];
			novaLinhaDaTabela[0] = t.getCodigoPais();
			novaLinhaDaTabela[1] = t.getDdd();
			novaLinhaDaTabela[2] = t.getNumero();
			novaLinhaDaTabela[3] = t.isMovel();
			novaLinhaDaTabela[4] = t.isAtivo();
			novaLinhaDaTabela[5] = t.getDono().getId();

			model.addRow(novaLinhaDaTabela);
		}

	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaListarTelefones frame = new TelaInternaListarTelefones();
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
	public TelaInternaListarTelefones() {
		setTitle("Listagem de Telefones");
		setBounds(100, 100, 700, 515);
		getContentPane().setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(150, 30, 120, 30);
		getContentPane().add(btnBuscar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(350, 30, 120, 30);
		getContentPane().add(btnVoltar);
		
		table = new JTable();
		table.setBounds(20, 70, 650, 400);
		getContentPane().add(table);

	}
}
