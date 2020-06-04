package com.matheus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Poupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtjuros;
	private JTextField txtmes;
	private JTextField txtdeposito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poupanca frame = new Poupanca();
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
	public Poupanca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbljuros = new JLabel("Juros ao mes %");
		lbljuros.setBounds(10, 11, 102, 14);
		contentPane.add(lbljuros);
		
		JLabel lblmes = new JLabel("Nmr de meses");
		lblmes.setBounds(10, 50, 102, 14);
		contentPane.add(lblmes);
		
		JLabel lbldeposito = new JLabel("Dep\u00F3sito mensal");
		lbldeposito.setBounds(10, 90, 102, 14);
		contentPane.add(lbldeposito);
		
		txtjuros = new JTextField();
		txtjuros.setBounds(122, 8, 86, 20);
		contentPane.add(txtjuros);
		txtjuros.setColumns(10);
		
		txtmes = new JTextField();
		txtmes.setBounds(122, 47, 86, 20);
		contentPane.add(txtmes);
		txtmes.setColumns(10);
		
		txtdeposito = new JTextField();
		txtdeposito.setBounds(122, 87, 86, 20);
		contentPane.add(txtdeposito);
		txtdeposito.setColumns(10);
		
		JLabel lblpoupado = new JLabel("Total poupado");
		lblpoupado.setBounds(10, 164, 89, 14);
		contentPane.add(lblpoupado);
		
		JLabel lblreais = new JLabel("R$:");
		lblreais.setBounds(122, 164, 86, 14);
		contentPane.add(lblreais);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mes = Double.parseDouble(txtmes.getText());
				juros = Double.parseDouble(txtjuros.getText());
				deposito = Double.parseDouble(txtdeposito.getText());
				
				poupado = deposito*(1+(juros/100))*mes;
				
				lblreais.setText("R$: "+poupado);
				
			}
		});
		btnOk.setBounds(10, 130, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtjuros.setText(" ");
				txtmes.setText(" ");
				txtdeposito.setText(" ");
				lblreais.setText("R$: ");
			}
		});
		btnLimpar.setBounds(119, 130, 89, 23);
		contentPane.add(btnLimpar);
	}
	
	double mes, juros, deposito, poupado;
}
