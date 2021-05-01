package AppEscritorio;

import javax.swing.JFrame;

public class VentanaEj3 extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaEj3()
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Seleccion Multiple");
	}
	
	public void CambiarVisibilidad(boolean Estado)
	{
		setVisible(true);
	}
	
}
