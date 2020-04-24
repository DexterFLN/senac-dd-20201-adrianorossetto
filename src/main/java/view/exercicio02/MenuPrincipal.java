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

import view.exercicio01.TelaCadastroTelefones;

public class MenuPrincipal extends JFrame {

	private JDesktopPane desktopPane;
	private TelaSobreAutor telaSobreAutor;
	private TelaInternaCadastroCliente telaCadastroCliente;
	private TelaInternaListarTelefones telaListarTelefones;
	private TelaInternaCadastroTelefone telaCadastroTelefones;
	private TelaInternaExclusaoTelefone telaExcluirTelefone;
	private int contTelaCadastroCliente = 0;
	private int contTelaCadastroTelefone = 0;
	private int contTelaExclusaoTelefone = 0;
	private int contTelaListarTelefone = 0;

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

	
	public void setContTelaListarTelefone(int contTelaListarTelefone) {
		this.contTelaListarTelefone = contTelaListarTelefone;
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
				if(contTelaCadastroCliente == 0) {
					contTelaCadastroCliente++;
					telaCadastroCliente = new TelaInternaCadastroCliente();
					desktopPane.add(telaCadastroCliente);
					telaCadastroCliente.show();
				}
				if(telaCadastroCliente.isClosed()) {
					contTelaCadastroCliente--;
				}
				if(contTelaCadastroCliente == 0) {
					contTelaCadastroCliente++;
					telaCadastroCliente = new TelaInternaCadastroCliente();
					desktopPane.add(telaCadastroCliente);
					telaCadastroCliente.show();
				}
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
				if(contTelaListarTelefone == 0) {
					contTelaListarTelefone++;
					telaListarTelefones = new TelaInternaListarTelefones();
					desktopPane.add(telaListarTelefones);
					telaListarTelefones.show();
				} 
				if (telaListarTelefones.isClosed()) {
					contTelaListarTelefone--;
				}
				if(contTelaListarTelefone == 0) {
					contTelaListarTelefone++;
					telaListarTelefones = new TelaInternaListarTelefones();
					desktopPane.add(telaListarTelefones);
					telaListarTelefones.show();
				} 
			}
		});
		mntmListarTelefones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-card\u00E1pio.png")));
		mnTelefones.add(mntmListarTelefones);
		
		
		JMenuItem mntmCadastraralterar = new JMenuItem("Cadastrar/Alterar");
		mntmCadastraralterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contTelaCadastroTelefone == 0) {
					contTelaCadastroTelefone++;
					telaCadastroTelefones = new TelaInternaCadastroTelefone();
					desktopPane.add(telaCadastroTelefones);
					telaCadastroTelefones.show();
				} 
				if (telaCadastroTelefones.isClosed()) {
					contTelaCadastroTelefone--;
				}
				if(contTelaCadastroTelefone == 0) {
					contTelaCadastroTelefone++;
					telaCadastroTelefones = new TelaInternaCadastroTelefone();
					desktopPane.add(telaCadastroTelefones);
					telaCadastroTelefones.show();
				} 
			}
		});
		mntmCadastraralterar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icones/icons8-adicionar-ao-banco-de-dados.png")));
		mnTelefones.add(mntmCadastraralterar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(contTelaExclusaoTelefone == 0) {
					contTelaExclusaoTelefone++;
					telaExcluirTelefone = new TelaInternaExclusaoTelefone();
					desktopPane.add(telaExcluirTelefone);
					telaExcluirTelefone.show();
				}
				if (telaExcluirTelefone.isClosed()) {
					contTelaExclusaoTelefone--;
				}
				if(contTelaExclusaoTelefone == 0) {
					contTelaExclusaoTelefone++;
					telaExcluirTelefone = new TelaInternaExclusaoTelefone();
					desktopPane.add(telaExcluirTelefone);
					telaExcluirTelefone.show();
				}
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
				
				if(telaSobreAutor == null) {
					telaSobreAutor = new TelaSobreAutor();
					telaSobreAutor.setVisible(true);
				} else if (telaSobreAutor != null && !telaSobreAutor.isVisible()) {
					telaSobreAutor.setVisible(true);
				} else if (telaSobreAutor.isVisible()) {
					telaSobreAutor.setVisible(true);
				}
		
			}
		});
		menuSobre.add(miAutor);

		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(5, 5, 1000, 800);
		
		getContentPane().add(desktopPane);
	}
}