package AppEscritorio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import static javax.swing.JOptionPane.showMessageDialog;

public class VentanaEj3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtHoras;
	private ButtonGroup grupo1 = new ButtonGroup();

	public VentanaEj3() {
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel paSistemas = new JPanel();
		paSistemas.setBorder(new LineBorder(new Color(0, 0, 0)));
		paSistemas.setBounds(10, 11, 414, 65);
		contentPane.add(paSistemas);
		paSistemas.setLayout(null);

		JRadioButton rbtnWindows = new JRadioButton("Windows");
		rbtnWindows.setBounds(173, 23, 90, 23);
		paSistemas.add(rbtnWindows);

		JRadioButton rbtnMac = new JRadioButton("Mac");
		rbtnMac.setBounds(265, 23, 58, 23);
		paSistemas.add(rbtnMac);

		JRadioButton rbtnLinux = new JRadioButton("Linux");
		rbtnLinux.setBounds(325, 23, 70, 23);
		paSistemas.add(rbtnLinux);

		JPanel paEspec = new JPanel();
		paEspec.setBorder(new LineBorder(new Color(0, 0, 0)));
		paEspec.setBounds(10, 80, 414, 89);
		contentPane.add(paEspec);
		paEspec.setLayout(null);

		JCheckBox cbxProg = new JCheckBox("Programaci\u00F3n");
		cbxProg.setBounds(177, 7, 231, 23);
		paEspec.add(cbxProg);

		JCheckBox cbxAdmin = new JCheckBox("Administraci\u00F3n");
		cbxAdmin.setBounds(177, 32, 231, 23);
		paEspec.add(cbxAdmin);

		JCheckBox cbxDise = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		cbxDise.setBounds(177, 58, 231, 23);
		paEspec.add(cbxDise);

		JLabel lblEspec = new JLabel("Elije una especialidad");
		lblEspec.setBounds(10, 36, 122, 14);
		paEspec.add(lblEspec);

		JLabel lblHoras = new JLabel("Cantidad de horas en el computador:");
		lblHoras.setBounds(20, 183, 216, 14);
		contentPane.add(lblHoras);

		txtHoras = new JTextField();
		txtHoras.setBounds(236, 180, 86, 20);
		contentPane.add(txtHoras);

		grupo1.add(rbtnLinux);
		grupo1.add(rbtnMac);
		grupo1.add(rbtnWindows);

		JLabel lblSistema = new JLabel("Elije un sistema operativo");
		lblSistema.setBounds(10, 27, 146, 14);
		paSistemas.add(lblSistema);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rbtnLinux.setActionCommand("Linux");
				rbtnMac.setActionCommand("Mac");
				rbtnWindows.setActionCommand("Windows");

				String esp = "";

				if (cbxAdmin.isSelected()) {
					esp = cbxAdmin.getText();
				}
				if (cbxDise.isSelected()) {
					esp = esp + cbxDise.getText();
				}
				if (cbxProg.isSelected()) {
					esp = esp + cbxProg.getText();
				}

				if (grupo1.getSelection() != null) {
					String Resultado = grupo1.getSelection().getActionCommand() + " - " + esp + " - "
							+ txtHoras.getText() + " Hs";
					showMessageDialog(null, Resultado,"Información seleccionada.",1);
				}

			}
		});
		btnAceptar.setBounds(173, 227, 89, 23);
		contentPane.add(btnAceptar);
	}
}
