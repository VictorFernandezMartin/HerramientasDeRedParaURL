package SwingPaginaWeb;

/**
 * <p> Este archivo es donde se encuentran todas las funciones del backend </p>
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Victor Fernandez
 *
 */

public class CodigoPaginaWeb {

	/**
	 * 
	 * <p>La instancia de la clase Process que ejecuta el comando.</p>
	 */
	Process p;

	/**
	 * 
	 * <p>Ejecuta el comando "ping" a la URL especificada y devuelve el resultado como
	 * una cadena de texto HTML.</p>
	 * 
	 * @param url (La URL a la que se ejecutará en el comando ping.)
	 * @return info (Concatenado de texto formateado en html)
	 */
	public String ping(String url) {

		String info = "";
		String[] comandos = { "ping", url };
		ProcessBuilder pb = new ProcessBuilder(comandos);
		try {
			p = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String lectura = "";
			while ((lectura = br.readLine()) != null) {
				info += "<p>" + lectura + "</p>";
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		info += "</html></body>";

		return info;
	}

	/**
	 * 
	 * <p>Ejecuta el comando "tracert" a la URL especificada y devuelve el resultado como
	 * una cadena de texto HTML.</p>
	 * 
	 * @param url (La URL a la que se ejecutará en el comando tracert.)
	 * @return info (Concatenado de texto formateado en html)
	 */
	public String tracert(String url) {

		String info = "";
		String[] comandos = { "tracert", "-d", "-w", "5", url };
		ProcessBuilder pb = new ProcessBuilder(comandos);
		try {
			p = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String lectura = "";
			while ((lectura = br.readLine()) != null) {
				info += "<p> " + lectura + "</p>";
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		info += "</html></body>";

		return info;
	}

	/**
	 * 
	 * <p>Ejecuta el comando "nslookup" a la URL especificada y devuelve el resultado como
	 * una cadena de texto HTML.</p>
	 * 
	 * @param url (La URL a la que se ejecutará en el comando nslookup.)
	 * @return info (Concatenado de texto formateado en html)
	 */
	public String nslookup(String url) {

		String info = "";
		String[] comandos = { "nslookup", url };
		ProcessBuilder pb = new ProcessBuilder(comandos);
		try {
			p = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String lectura = "";
			while ((lectura = br.readLine()) != null) {
				info += "<p> " + lectura + "</p>";
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		info += "</html></body>";

		return info;
	}
	
	/**
	 * 
	 * <p>Ejecuta el comando "curl" a la URL especificada y devuelve el resultado como
	 * una cadena de texto HTML.</p>
	 * 
	 * @param url (La URL a la que se ejecutará en el comando curl.)
	 * @return info (Concatenado de texto formateado en html)
	 */
	public String curl(String url) {

		String info = "";
		String[] comandos = { "curl", url };
		ProcessBuilder pb = new ProcessBuilder(comandos);
		try {
			p = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String lectura = "";
			while ((lectura = br.readLine()) != null) {
				info += "<p> " + lectura + "</p>";
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		info += "</html></body>";

		return info;
	}

	/**
	 * <p> Este método ejecuta un comando Telnet en la URL especificada utilizando el puerto predeterminado 80. </p>
	 * <p> La salida del comando Telnet se guarda en un archivo temporal y luego se lee en una cadena. </p>
	 * <p> La cadena se formatea con etiquetas de párrafo HTML y se devuelve. </p>
	 *
	 * @param url La URL en la que se ejecutará el comando Telnet
	 * @return Una cadena que contiene la salida del comando Telnet formateada con etiquetas de párrafo HTML
	 */
	public static String telnet(String url) {
		String info = "";
		String[] cmd = { "cmd", "/C", "start", "/WAIT", "C:\\Windows\\system32\\Telnet.exe", "-f",
				"C:\\Windows\\Temp\\salidaTelnet.txt", url, "80" };
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			while (p.children().count() != 0)
				;
			File file = new File("C:\\Windows\\Temp\\salidaTelnet.txt");
			Scanner salida = new Scanner(file);
			while (salida.hasNextLine()) {
				info += "<p>" + salida.nextLine() + "</p>";
			}
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return info;
	}
	
	/**
	 * <p> Esta funcion ejecuta el "Ayuda.html" que es la pagu¡ina en la que se muestra la ayuda de la app </p>
	 */
	public static void ayuda() {
		String[] cmd = { "cmd", "/C", "start", 
				"AyudaPagina\\Ayuda.html"};
		try {
			Process p = Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * <p>Al llamar a la función "cancelar" se cancelan los porcesos que esten en ejecución</p>
	 */
	public void cancelar() {
		if (p != null) {
			p.destroy();
		}
	}

}
