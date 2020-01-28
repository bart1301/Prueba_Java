import java.awt.Container;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista extends JFrame implements WindowListener, ActionListener{ 
	/** 
	 * Tutorial para el listener
	 *  https://docs.oracle.com/javase/tutorial/uiswing/examples/events/index.html#MultiListener
	 */
	JLabel tituloVentana = new JLabel();  
	
	int numClick = 0;

	public static void main(String[] args) {

		Vista usuarios = new Vista("Menú prinicipal");

	}

	public Vista(String titulo)
	{
		/////////////////////////////////////////
		//CONFIGURACION PRINCIPAL
		////////////////////////////////////////

		super(titulo); // TITULO DINÁMICO, Recibe del main
		this.setSize(800,600); // Tamaño de ventana {altura, anchura}
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 

		Vista usuarios = this;

		/////////////////////////////////////////
		// CONTENEDOR 
		////////////////////////////////////////
		Container contenedor = usuarios.getContentPane(); // crea un contenedor
		contenedor.setLayout(null); //limpia la vista

		/////////////////////////////////////////
		// BOTONES
		////////////////////////////////////////

		// 1. Crear un botón
		JButton crear = new JButton("Crear"); 
		
		// 2. Dar dimensiones
		crear.setBounds(100, 40, 115, 20); 
		
		// 3. Agregar al Frame
		usuarios.add(crear); 
		
		// 4. Agregar disparador de evento del frame
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ingresar();

			}
		}); 

		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(100, 110, 115, 20);
		usuarios.add(eliminar);
		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numClick++;
				eliminar();
			}
	
		});

		JButton buscar = new JButton("Buscar");
		buscar.setBounds(100, 200, 110, 20);
		usuarios.add(buscar);
		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numClick++;
				buscar();
			}
	
		});


		JButton actualizar = new JButton("Actualizar");
		actualizar.setBounds(100, 290, 110, 20);
		usuarios.add(actualizar);
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				numClick++;
				ingresar();
			}
	
		});

		
		////////////////////////////////////////
		//MOSTRAR TEXTO
		////////////////////////////////////////
		usuarios.add(tituloVentana);
		tituloVentana.setText("MENÚ PRINCIPAL");
		tituloVentana.setBounds(100, 10, 120, 20);
		

		usuarios.setVisible(true);
	}

	public void ingresar()
	{
		super.setTitle("CREAR");
		Vista usuarios = this;
		super.getContentPane().removeAll();

		////////////////////////////////////////
		//MOSTRAR TEXTO
		////////////////////////////////////////
		usuarios.add(tituloVentana);
		tituloVentana.setText("INGRESO DE USUARIO");
		tituloVentana.setBounds(100, 10, 200, 20);
		
		super.repaint();

	}
	
	public void eliminar()
	{
		super.setTitle("ELIMINAR");
		Vista usuarios = this;
		super.getContentPane().removeAll();

		////////////////////////////////////////
		//MOSTRAR TEXTO
		////////////////////////////////////////
		usuarios.add(tituloVentana);
		tituloVentana.setText("ELIMINAR UN USUARIO");
		tituloVentana.setBounds(100, 10, 200, 20);
		
		super.repaint();

	}


	public void buscar()
	{
		super.setTitle("BUSCAR");
		Vista usuarios = this;
		super.getContentPane().removeAll();

		////////////////////////////////////////
		//MOSTRAR TEXTO
		////////////////////////////////////////
		usuarios.add(tituloVentana);
		tituloVentana.setText("BUSCAR UN USUARIO");
		tituloVentana.setBounds(100, 10, 200, 20);
		
		super.repaint();

	}
	
	public void btnVolver() {
		/////////////////////////////////////////
		// BOTONES
		////////////////////////////////////////

		// 1. Crear un botón
		JButton crear = new JButton("Crear"); 

		// 2. Dar dimensiones
		crear.setBounds(100, 40, 115, 20); 

		// 3. Agregar al Frame
		//usuarios.add(crear); 

		// 4. Agregar disparador de evento del frame
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ingresar();

			}
		}); 

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//numClick++;
		//text.setText("Presionado " + numClick + " de veces");

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
		System.exit(0);
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}



}
