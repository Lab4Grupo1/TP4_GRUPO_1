package AppEscritorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VentanaEj2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private JComboBox<String> cboTps;

	public VentanaEj2() {
		setTitle("Ejercicio 2");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panNotas = new JPanel();
		panNotas.setBorder(
				new TitledBorder(null, "Notas de estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panNotas.setBounds(20, 20, 200, 190);
		contentPane.add(panNotas);
		panNotas.setLayout(null);

		JPanel panResult = new JPanel();
		panResult.setBorder(
				new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panResult.setBounds(20, 224, 200, 110);
		contentPane.add(panResult);
		panResult.setLayout(null);

		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(25, 33, 50, 14);
		panNotas.add(lblNota1);

		txtNota1 = new JTextField();
		txtNota1.setBounds(80, 30, 100, 20);
		panNotas.add(txtNota1);

		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(25, 73, 50, 14);
		panNotas.add(lblNota2);

		txtNota2 = new JTextField();
		txtNota2.setBounds(80, 70, 100, 20);
		panNotas.add(txtNota2);

		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(25, 113, 50, 14);
		panNotas.add(lblNota3);

		txtNota3 = new JTextField();
		txtNota3.setBounds(80, 110, 100, 20);
		panNotas.add(txtNota3);

		JLabel lblTps = new JLabel("TPs:");
		lblTps.setBounds(25, 153, 50, 14);
		panNotas.add(lblTps);

		cboTps = new JComboBox<String>();
		cboTps.setBounds(80, 150, 100, 20);
		panNotas.add(cboTps);

		cboTps.addItem("Seleccionar");
		cboTps.addItem("Aprobado");
		cboTps.addItem("Desaprobado");

		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(25, 33, 48, 14);
		panResult.add(lblPromedio);

		txtPromedio = new JTextField();
		txtPromedio.setBounds(80, 30, 100, 20);
		panResult.add(txtPromedio);

		txtCondicion = new JTextField();
		txtCondicion.setBounds(80, 70, 100, 20);
		panResult.add(txtCondicion);

		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(25, 73, 58, 14);
		panResult.add(lblCondicion);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcular();
			}
		});
		btnCalcular.setBounds(260, 90, 89, 23);
		contentPane.add(btnCalcular);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
				cboTps.setSelectedIndex(0);
			}
		});
		btnNuevo.setBounds(260, 150, 89, 23);
		contentPane.add(btnNuevo);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSalir.setBounds(260, 210, 89, 23);
		contentPane.add(btnSalir);
	}

	public JTextField getTxtNota1() {
		return txtNota1;
	}

	public void setTxtNota1(JTextField txtNota1) {
		this.txtNota1 = txtNota1;
	}

	public JTextField getTxtNota2() {
		return txtNota2;
	}

	public void setTxtNota2(JTextField txtNota2) {
		this.txtNota2 = txtNota2;
	}

	public JTextField getTxtNota3() {
		return txtNota3;
	}

	public void setTxtNota3(JTextField txtNota3) {
		this.txtNota3 = txtNota3;
	}

	public JTextField getTxtPromedio() {
		return txtPromedio;
	}

	public void setTxtPromedio(JTextField txtPromedio) {
		this.txtPromedio = txtPromedio;
	}

	public JTextField getTxtCondicion() {
		return txtCondicion;
	}

	public void setTxtCondicion(JTextField txtCondicion) {
		this.txtCondicion = txtCondicion;
	}

	public JComboBox<String> getCboTps() {
		return cboTps;
	}

	public void setCboTps(JComboBox<String> cboTps) {
		this.cboTps = cboTps;
	}

	public void calcular() {

		if (!(getTxtNota1().getText().isEmpty() | getTxtNota2().getText().isEmpty()
				| getTxtNota3().getText().isEmpty()))

		{
			if (getCboTps().getSelectedIndex() != 0) {

				int prom = (Integer.parseInt(getTxtNota1().getText()) + Integer.parseInt(getTxtNota2().getText())
						+ Integer.parseInt(getTxtNota3().getText())) / 3;

				getTxtPromedio().setText(Integer.toString(prom));

				if (getCboTps().getSelectedIndex() == 1) {

					if (Integer.parseInt(getTxtNota1().getText()) < 6 || Integer.parseInt(getTxtNota2().getText()) < 6
							|| Integer.parseInt(getTxtNota3().getText()) < 6) {
						getTxtCondicion().setText("Libre");
					} else if (Integer.parseInt(getTxtNota1().getText()) >= 8
							& Integer.parseInt(getTxtNota2().getText()) >= 8
							& Integer.parseInt(getTxtNota3().getText()) >= 8) {
						getTxtCondicion().setText("Promocionado");
					} else {
						getTxtCondicion().setText("Regular");
					}

				} else {
					getTxtCondicion().setText("Libre");
				}
			}
		}
	}
}
