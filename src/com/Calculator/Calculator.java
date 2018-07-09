package com.Calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;

	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	String EnterNumber;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setIconImage(
				Toolkit.getDefaultToolkit()
						.getImage("C:\\Users\\Nischal Pradhan\\Pictures\\87ccef4ac5c4689fcca749f3a39e63ca.jpg"));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 288, 403);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 255, 33);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Stencil", Font.BOLD, 18));
		btn1.setBounds(10, 48, 60, 60);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Stencil", Font.BOLD, 18));
		btn2.setBounds(75, 48, 60, 60);
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Stencil", Font.BOLD, 18));
		btn3.setBounds(140, 48, 60, 60);
		frmCalculator.getContentPane().add(btn3);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("+");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Stencil", Font.BOLD, 18));
		btnPlus.setBounds(205, 48, 60, 60);
		frmCalculator.getContentPane().add(btnPlus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Stencil", Font.BOLD, 18));
		btn4.setBounds(10, 110, 60, 60);
		frmCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Stencil", Font.BOLD, 18));
		btn5.setBounds(75, 110, 60, 60);
		frmCalculator.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Stencil", Font.BOLD, 18));
		btn6.setBounds(140, 110, 60, 60);
		frmCalculator.getContentPane().add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Stencil", Font.BOLD, 18));
		btnSub.setBounds(205, 110, 60, 60);
		frmCalculator.getContentPane().add(btnSub);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Stencil", Font.BOLD, 18));
		btn7.setBounds(10, 172, 60, 60);
		frmCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Stencil", Font.BOLD, 18));
		btn8.setBounds(75, 172, 60, 60);
		frmCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Stencil", Font.BOLD, 18));
		btn9.setBounds(140, 172, 60, 60);
		frmCalculator.getContentPane().add(btn9);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Stencil", Font.BOLD, 18));
		btnDiv.setBounds(205, 172, 60, 60);
		frmCalculator.getContentPane().add(btnDiv);

		JButton btnADMI = new JButton("+/-");
		btnADMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnADMI.setFont(new Font("Stencil", Font.BOLD, 18));
		btnADMI.setBounds(10, 234, 60, 60);
		frmCalculator.getContentPane().add(btnADMI);

		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Stencil", Font.BOLD, 18));
		btnMod.setBounds(75, 234, 60, 60);
		frmCalculator.getContentPane().add(btnMod);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Stencil", Font.BOLD, 18));
		btnDot.setBounds(140, 296, 60, 60);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Stencil", Font.BOLD, 18));
		btnMul.setBounds(205, 234, 60, 60);
		frmCalculator.getContentPane().add(btnMul);

		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BackSpace = null;
				
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					BackSpace = str.toString();
					textField.setText(BackSpace);
				}
			}
		});
		btnBack.setFont(new Font("Stencil", Font.BOLD, 18));
		btnBack.setBounds(10, 296, 60, 60);
		frmCalculator.getContentPane().add(btnBack);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Stencil", Font.BOLD, 18));
		btn0.setBounds(75, 296, 60, 60);
		frmCalculator.getContentPane().add(btn0);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Stencil", Font.BOLD, 18));
		btnClear.setBounds(140, 234, 60, 60);
		frmCalculator.getContentPane().add(btnClear);

		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String answer;

				secondnum = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Stencil", Font.BOLD, 18));
		btnEquals.setBounds(205, 296, 60, 60);
		frmCalculator.getContentPane().add(btnEquals);

	}
}
