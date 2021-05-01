package AppEscritorio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		setTitle("TP4 Grupo1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		setResizable(false);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("GRUPO NRO: 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 20, 150, 20);
		getContentPane().add(lblNewLabel);

		JButton btnEj1 = new JButton("Ejercicio 1");
		btnEj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaEj1 frame = new VentanaEj1();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});		
		btnEj1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEj1.setBounds(new Rectangle(150, 60, 100, 30));
		getContentPane().add(btnEj1);

		JButton btnEj2 = new JButton("Ejercicio 2");
		btnEj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaEj2 frame = new VentanaEj2();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});	
		btnEj2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEj2.setBounds(new Rectangle(150, 110, 100, 30));
		getContentPane().add(btnEj2);

		JButton btnEj3 = new JButton("Ejercicio 3");
		btnEj3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaEj3 frame = new VentanaEj3();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});	
		btnEj3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEj3.setBounds(new Rectangle(150, 160, 100, 30));
		getContentPane().add(btnEj3);
	}
}