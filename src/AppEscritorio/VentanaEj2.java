package AppEscritorio;

import javax.swing.JFrame;

public class VentanaEj2 extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public VentanaEj2()
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Promedio");
	}
	
	public void CambiarVisibilidad(boolean Estado)
	{
		setVisible(true);
	}

}
