package view.exercicio02;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPrincipal extends JFrame {

	private JDesktopPane desktopPane;
	public TelaSobreAutor telaSobreAutor = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuCliente = new JMenu("Clientes");
		menuCliente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-gestão-de-cliente.png")));
		menuBar.add(menuCliente);

		JMenuItem miCadastrarCliente = new JMenuItem("Cadastrar");
		miCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInternaCadastroCliente novaTelinha = new TelaInternaCadastroCliente();
				desktopPane.add(novaTelinha);
				novaTelinha.show();
			}
		});
		miCadastrarCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		miCadastrarCliente.setIcon(
				new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-usuário-masculino.png")));
		menuCliente.add(miCadastrarCliente);
		
		JMenu mnTelefones = new JMenu("Telefones");
		mnTelefones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-suporte-on-line-filled.png")));
		menuBar.add(mnTelefones);
		
		JMenuItem mntmListarTelefones = new JMenuItem("Listar");
		mntmListarTelefones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInternaListarTelefones telaListarTelefones = new TelaInternaListarTelefones();
				desktopPane.add(telaListarTelefones);
				telaListarTelefones.show();
				//TelaListagemTelefones telaListaTelefone = new TelaListagemTelefones();
				//desktopPane.add(telaListaTelefone);
				//telaListaTelefone.show();
			}
		});
		mntmListarTelefones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-card\u00E1pio.png")));
		mnTelefones.add(mntmListarTelefones);
		
		JMenuItem mntmCadastraralterar = new JMenuItem("Cadastrar/Alterar");
		mntmCadastraralterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInternaCadastroTelefone telaCadastrarTelefone = new TelaInternaCadastroTelefone();
				desktopPane.add(telaCadastrarTelefone);
				telaCadastrarTelefone.show();
			}
		});
		mntmCadastraralterar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-ao-banco-de-dados.png")));
		mnTelefones.add(mntmCadastraralterar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInternaExclusaoTelefone telaExcluirTelefone = new TelaInternaExclusaoTelefone();
				desktopPane.add(telaExcluirTelefone);
				telaExcluirTelefone.show();

			}
		});
		mntmExcluir.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-\u00E0-esquerda-dentro-de-um-c\u00EDrculo.png")));
		mnTelefones.add(mntmExcluir);

		JMenu menuSobre = new JMenu("Sobre");
		menuSobre.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-confiança.png")));
		menuBar.add(menuSobre);

		JMenuItem miAutor = new JMenuItem("Autor");
		miAutor.setIcon(
				new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-usuário-masculino.png")));
		miAutor.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				// TODO mostrar um JFrame com informações do autor
				
				if (telaSobreAutor != null) {
					telaSobreAutor = new TelaSobreAutor();
					telaSobreAutor.setFocusableWindowState(true);
				} else {
					telaSobreAutor = new TelaSobreAutor();
					telaSobreAutor.setFocusableWindowState(true);
				}
				//TelaSobreAutor janelaSobre = null;
				//janelaSobre = new TelaSobreAutor();
				//janelaSobre.setVisible(true);
				//janelaSobre.setFocusableWindowState(true);
				
				/*
					TelaSobreAutor2 telaSobre = new TelaSobreAutor2(this, true);
					telaSobre.pack();
					telaSobre.setLocationRelativeTo(null);
					telaSobre.setVisible(true);
				*/
		
			}
		});
		menuSobre.add(miAutor);

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(5, 5, 1000, 800);
		
		getContentPane().add(desktopPane);
	}
}