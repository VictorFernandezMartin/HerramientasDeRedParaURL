package SwingPaginaWeb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;

/**
 * 
 * @author Victor Fernandez
 *
 */

public class PestañaAyuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PestañaAyuda frame = new PestañaAyuda();
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
	public PestañaAyuda() {
		setTitle("Ayuda");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 333, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnAcercaDe = new JButton("Acerca de");
		btnAcercaDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PestañaAcercaDe acercaDe = new PestañaAcercaDe();
				acercaDe.setVisible(true);
				setLocationRelativeTo(null);
			}
		});
		btnAcercaDe.setBounds(107, 355, 98, 38);
		contentPane.add(btnAcercaDe);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 298, 335);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Ping", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><body> <p>En esta pestaña se ejecuta el comando Ping de la URL introducida, "
				+ "que nos dara información sobre la latencia de la conexión a esa URL.</p><br>"
				+ "<p>Para que se pueda ejecutar el </p><p>comando Ping hay que introducir una URL y darle al boton Aceptar"
				+ ", y posteriormente al cabo de unos segundos aparecera el resultado del Ping a la URL.</p></html></body>");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 10, 273, 288);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tracert", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("<html><body> <p>En esta pestaña se ejecuta el</p><p>comando Tracert de la URL introducida, "
				+ "es una herramienta de diagnóstico de red utilizada para rastrear la ruta tomada por los paquetes de datos que se "
				+ "envían desde un origen hasta un destino en una red.</p><br>"
				+ "<p>Para que se pueda ejecutar el </p><p>comando Tracert hay que introducir una URL y darle al boton Aceptar"
				+ ", y posteriormente al cabo de unos segundos aparecera el resultado del Tracert a la URL.</p></html></body>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setBounds(10, 10, 273, 288);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("NslookUp", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("<html><body> <p>En esta pestaña se ejecuta el</p><p>comando Nslookup de la URL introducida, "
				+ "contiene información sobre la dirección IP correspondiente a ese host.</p><br>"
				+ "<p>Para que se pueda ejecutar el </p><p>comando Nslookup hay que introducir una URL y darle al boton Aceptar"
				+ ", y posteriormente al cabo de unos segundos aparecera el resultado del Nslookup a la URL.</p></html></body>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(10, 10, 273, 288);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Curl", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("<html><body> <p>En esta pestaña se ejecuta el</p><p>comando Curl de la URL introducida, "
				+ "se utiliza para transferir datos desde o hacia un servidor a través de varios protocolos, como HTTP, FTP, SMTP, etc...</p><br>"
				+ "<p>Para que se pueda ejecutar el </p><p>comando Curl hay que introducir una URL y darle al boton Aceptar"
				+ ", y posteriormente al cabo de unos segundos aparecera el resultado del Curl a la URL.</p></html></body>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(10, 10, 273, 288);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Telnet", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body> <p>En esta pestaña se ejecuta el</p><p>comando Telnet de la URL introducida, "
				+ "se utiliza para acceder a una máquina remota y trabajar con ella como si estuviéramos en ella de manera local. </p><br>"
				+ "<p>Para que se pueda ejecutar el </p><p>comando Telnet hay que introducir una URL y darle al boton Aceptar"
				+ ", y posteriormente al cabo de unos segundos aparecera el resultado del Telnet a la URL.</p></html></body>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 10, 273, 288);
		panel_4.add(lblNewLabel_1);
	}
}
