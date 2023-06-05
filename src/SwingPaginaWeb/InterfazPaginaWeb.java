package SwingPaginaWeb;

/**
 * <p> Este sera el archivo de la interfaz de la app </p>
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * 
 * @author Victor Fernandez
 *
 */

public class InterfazPaginaWeb extends JFrame {

	private JPanel contentPane;
	private JTextField textoEntrada;
	private CodigoPaginaWeb paginaWeb = new CodigoPaginaWeb();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPaginaWeb frame = new InterfazPaginaWeb();
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

	public InterfazPaginaWeb() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Dialog", Font.BOLD, 17));
		setTitle("Victor Fdez");

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(212, 212, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		textoEntrada = new JTextField();
		textoEntrada.setForeground(new Color(0, 0, 255));
		textoEntrada.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textoEntrada.setColumns(10);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JPanel Ping = new JPanel();
		tabbedPane.addTab("Ping", null, Ping, null);
		Ping.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 862, 386);
		Ping.add(scrollPane_4);
		
				JLabel lbl_salidaPing = new JLabel("Ping");
				scrollPane_4.setViewportView(lbl_salidaPing);
				lbl_salidaPing.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lbl_salidaPing.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaPing.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaPing.setBackground(new Color(128, 0, 255));

		JPanel Tracert = new JPanel();
		tabbedPane.addTab("Tracert", null, Tracert, null);
		Tracert.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 862, 386);
		Tracert.add(scrollPane_3);
		
				JLabel lbl_salidaTracert = new JLabel("Tracert");
				scrollPane_3.setViewportView(lbl_salidaTracert);
				lbl_salidaTracert.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lbl_salidaTracert.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaTracert.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel Nslookup = new JPanel();
		tabbedPane.addTab("Nslookup", null, Nslookup, null);
		Nslookup.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 862, 386);
		Nslookup.add(scrollPane_1);
		
				JLabel lbl_salidaNslookup = new JLabel("NsLookUp");
				scrollPane_1.setViewportView(lbl_salidaNslookup);
				lbl_salidaNslookup.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaNslookup.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaNslookup.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JPanel Curl = new JPanel();
		tabbedPane.addTab("Curl", null, Curl, null);
		Curl.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 862, 386);
		Curl.add(scrollPane_5);
		
				JLabel lbl_salidaCurl = new JLabel("Curl");
				scrollPane_5.setViewportView(lbl_salidaCurl);
				lbl_salidaCurl.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaCurl.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaCurl.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JPanel Telnet = new JPanel();
		tabbedPane.addTab("Telnet", null, Telnet, null);
		Telnet.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 862, 386);
		Telnet.add(scrollPane_2);
		
				JLabel lbl_salidaTelnet = new JLabel("Telnet");
				scrollPane_2.setViewportView(lbl_salidaTelnet);
				lbl_salidaTelnet.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaTelnet.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaTelnet.setFont(new Font("Tahoma", Font.PLAIN, 16));

		/**
		 * <p> El boton "Ayuda" te lleva a una nueva ventana en la que te aparece la funcion de cada comando de la app </p>
		 */
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*PestañaAyuda ayudaPing = new PestañaAyuda();
				ayudaPing.setVisible(true);*/
				paginaWeb.ayuda();

			}
		});
		btnAyuda.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAyuda.setToolTipText("Muestra una pestaña con la ayuda");

		/**
		 * <p> El boton "Aceptar" ejecuta todos los procesos al mismo tiempo </p>
		 */
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					lbl_salidaPing.setText("<html><body> <p>En proceso . . .</p></html></body>");
					lbl_salidaPing.setText("<html><body> <p>Victor Fdez</p><br><p>Ping--> </p><p>--------------------------</p>" 
					+ paginaWeb.ping(textoEntrada.getText()));

					lbl_salidaTracert.setText("<html><body> <p>En proceso . . .</p></html></body>");
					lbl_salidaTracert.setText("<html><body> <p>Victor Fdez</p><br><p>Tracert--> </p><p>--------------------------</p>" 
					+ paginaWeb.tracert(textoEntrada.getText()));

					lbl_salidaNslookup.setText("<html><body> <p>En proceso . . .</p></html></body>");
					lbl_salidaNslookup.setText("<html><body> <p>Victor Fdez</p><br><p>NsLookUp--> </p><p>--------------------------</p>" 
					+ paginaWeb.nslookup(textoEntrada.getText()));
					
					lbl_salidaCurl.setText("<html><body> <p>En proceso . . .</p></html></body>");
					lbl_salidaCurl.setText("<html><body> <p>Victor Fdez</p><br><p>Curl--> </p><p>--------------------------</p>" 
					+ paginaWeb.curl(textoEntrada.getText()));
					
					lbl_salidaTelnet.setText("<html><body> <p>En proceso . . .</p></html></body>");
					lbl_salidaTelnet.setText("<html><body> <p>Victor Fdez</p><br><p>Telnet--> </p><p>--------------------------</p>" 
					+ paginaWeb.telnet(textoEntrada.getText()));
					
			}
		});
			
			
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setToolTipText("Ejecuta todos los procesos al mismo tiempo");
		
		/**
		 * <p> El boton "Limpiar" borra el texto que hay en los label de salida y en de entrada </p>
		 */
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Limpiamos el texto entrada
				textoEntrada.setText("");
				
				//Limpiamos la pestaña ping
				lbl_salidaPing.setText("");

				//Limpiamos la pestaña tracert
				lbl_salidaTracert.setText("");
				
				//Limpiamos la pestaña nslookup
				lbl_salidaNslookup.setText("");
				
				//Limpiamos la pestaña Curl
				lbl_salidaCurl.setText("");
				
				//Limpiamos la pestaña Telnet
				lbl_salidaTelnet.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpiar.setToolTipText("Borra todo el texto");
		
		/**
		 * <p> El boton "Cancelar" cancela los procesos y muestra un mensaje de "Proceso Cancelado" </p>
		 */
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paginaWeb.cancelar();
				lbl_salidaPing.setText("<html><body> <p>Proceso cancelado</p>");
				lbl_salidaTracert.setText("<html><body> <p>Proceso cancelado</p>");
				lbl_salidaNslookup.setText("<html><body> <p>Proceso cancelado</p>");
				lbl_salidaCurl.setText("<html><body> <p>Proceso cancelado</p>");
				lbl_salidaTelnet.setText("<html><body> <p>Proceso cancelado</p>");
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setToolTipText("Cancela todos los procesos");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textoEntrada, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
							.addGap(37)
							.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAyuda, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
					.addGap(17))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textoEntrada, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAyuda, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(18))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
