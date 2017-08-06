package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
     /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 313, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setForeground(Color.GRAY);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField.setBounds(24, 11, 248, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//---Button-7---------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber); 
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(24, 127, 57, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber); 
			}
		});
		
		//-----------------Button-8-------------------------
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(91, 127, 57, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(152, 127, 57, 50);
		frame.getContentPane().add(btn9);
		
		//--------------------------------Plus(+)------------------------
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlus.setBounds(215, 66, 57, 50);
		frame.getContentPane().add(btnPlus);
		
		
		//--------------------------Row 1---------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn4.setFont(new Font("Tahoma",Font.BOLD,14));
		btn4.setBounds(24,188,57,50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(91, 188, 57, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(152, 188, 57, 50);
		frame.getContentPane().add(btn6);
		
		//--------------------------Subtraction-----------------------
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(215, 127, 57, 50);
		frame.getContentPane().add(btnSub);
		
		//-----------------------------Row 3---------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn1.setFont(new Font("Tahoma",Font.BOLD,14));
		btn1.setBounds(24,249,57,50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(91, 249, 57, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(152, 249, 57, 50);
		frame.getContentPane().add(btn3);
		//----------------------------------Multiplication------------------------
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMul.setBounds(215, 188, 57, 50);
		frame.getContentPane().add(btnMul);
		
		
		//----------------Rows 4-------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber); 
			}
		});
		btn0.setFont(new Font("Tahoma",Font.BOLD,14));
		btn0.setBounds(24,310,57,50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(91, 310, 57, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPm = new JButton("+ -");
		btnPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops =Double.parseDouble(String.valueOf(textField.getText())) ;
			ops= ops *(-1);
			textField.setText(String.valueOf(ops));
				
			}
		});
		btnPm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPm.setBounds(152, 310, 57, 50);
		frame.getContentPane().add(btnPm);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(215, 310, 57, 50);
		frame.getContentPane().add(btnEqual);
		
		//----------------------BackSpace-------------------------------
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBackSpace.setBounds(24, 66, 57, 50);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null); 
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBounds(91, 66, 57, 50);
		frame.getContentPane().add(btnC);
		
		//----Percent------
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";	
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPercent.setBounds(152, 66, 57, 50);
		frame.getContentPane().add(btnPercent);
		//------------------------------------------Division--------------------------------
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(215, 249, 57, 50);
		frame.getContentPane().add(button_3);
		
		
		
		
		
	}
}
