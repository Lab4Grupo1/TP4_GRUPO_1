package AppEscritorio;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaEj1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JButton btnMostrar;

	public VentanaEj1() {

		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(500, 100, 450, 400);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(70, 30, 80, 20);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBounds(70, 80, 80, 20);
		contentPane.add(lblApellido);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefono.setBounds(70, 130, 80, 20);
		;
		contentPane.add(lblTelefono);

		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFechaNac.setBounds(70, 180, 80, 20);
		;
		contentPane.add(lblFechaNac);

		JTextArea txtAreaMensaje = new JTextArea();
		txtAreaMensaje.setEditable(false);
		txtAreaMensaje.setLineWrap(true);
		txtAreaMensaje.setBackground(getForeground());
		txtAreaMensaje.setBounds(10, 311, 414, 39);
		txtAreaMensaje.setVisible(false);
		contentPane.add(txtAreaMensaje);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombre.setBounds(179, 30, 180, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(179, 80, 180, 20);
		contentPane.add(txtApellido);

		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(179, 130, 180, 20);
		contentPane.add(txtTelefono);

		txtFechaNac = new JTextField();
		txtFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(179, 180, 180, 20);
		contentPane.add(txtFechaNac);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaMensaje.setText("Los datos ingresados fueron: " + txtApellido.getText() + ", "
							+ txtNombre.getText() + " con tel. nro: " + txtTelefono.getText() + " nació el: "
							+ txtFechaNac.getText());
				if (txtCompleto(txtApellido) & txtCompleto(txtNombre) &
						txtCompleto(txtTelefono) & txtCompleto(txtFechaNac)) {
					txtApellido.setText("");
					txtNombre.setText("");
					txtTelefono.setText("");
					txtFechaNac.setText("");
					txtAreaMensaje.setVisible(true);
				}					
			}
		});
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMostrar.setBounds(new Rectangle(259, 252, 100, 30));
		contentPane.add(btnMostrar);

	}

	public boolean txtCompleto(JTextField txt) {
		if (txt.getText().isEmpty()) {
			txt.setBackground(Color.red);
			txt.setForeground(Color.white);
			return false;
		} else {
			txt.setBackground(Color.white);
			txt.setForeground(Color.black);
		}
		return true;
	}
	
	
}