import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc  {
	
	double first;
	double second;
	double third;
	double result;
	String operation;
	String answer;
	

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.PINK);
		frame.setBounds(100, 100, 330, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.CYAN);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setToolTipText("Value");
		textField.setBounds(10, 24, 302, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnC.setBackground(Color.GREEN);
		btnC.setForeground(Color.RED);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC.setBounds(26, 137, 59, 49);
		frame.getContentPane().add(btnC);
		
		JButton Button_7 = new JButton("7");
		Button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_7.getText();
				textField.setText(number);
			}
		});
		Button_7.setBackground(Color.CYAN);
		Button_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_7.setBounds(26, 185, 59, 49);
		frame.getContentPane().add(Button_7);
		
		JButton Button_4 = new JButton("4");
		Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_4.getText();
				textField.setText(number);
			}
		});
		Button_4.setBackground(Color.CYAN);
		Button_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_4.setBounds(26, 233, 59, 49);
		frame.getContentPane().add(Button_4);
		
		JButton Button_1 = new JButton("1");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_1.getText();
				textField.setText(number);
			}
		});
		Button_1.setBackground(Color.CYAN);
		Button_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_1.setBounds(26, 282, 59, 49);
		frame.getContentPane().add(Button_1);
		
		JButton Button_0 = new JButton("0");
		Button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_0.getText();
				textField.setText(number);
			}
		});
		Button_0.setForeground(Color.BLACK);
		Button_0.setBackground(Color.CYAN);
		Button_0.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_0.setBounds(26, 331, 59, 49);
		frame.getContentPane().add(Button_0);
		
		JButton Btnbackspace = new JButton("\uF0E7");
		Btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuffer str=new StringBuffer(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		Btnbackspace.setFont(new Font("Windings", Font.BOLD, 17));
		Btnbackspace.setBounds(83, 137, 59, 49);
		frame.getContentPane().add(Btnbackspace);
		
		JButton Button_8 = new JButton("8");
		Button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_8.getText();
				textField.setText(number);
			}
		});
		Button_8.setBackground(Color.CYAN);
		Button_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_8.setBounds(83, 185, 59, 49);
		frame.getContentPane().add(Button_8);
		
		JButton Button_5 = new JButton("5");
		Button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+Button_5.getText();
				textField.setText(number);
			}
		});
		Button_5.setBackground(Color.CYAN);
		Button_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_5.setBounds(83, 233, 59, 49);
		frame.getContentPane().add(Button_5);
		
		JButton Button_2 = new JButton("2");
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_2.getText();
				textField.setText(number);
			}
		});
		Button_2.setBackground(Color.CYAN);
		Button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_2.setBounds(83, 282, 59, 49);
		frame.getContentPane().add(Button_2);
		
		JButton Button_dot = new JButton(".");
		Button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_dot.getText();
				textField.setText(number);
			}
		});
		Button_dot.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_dot.setBounds(83, 331, 59, 49);
		frame.getContentPane().add(Button_dot);
		
		JButton Button_00 = new JButton("00");
		Button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+Button_00.getText();
				textField.setText(number);
			}
		});
		Button_00.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_00.setBounds(141, 137, 59, 49);
		frame.getContentPane().add(Button_00);
		
		JButton Button_9 = new JButton("9");
		Button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_9.getText();
				textField.setText(number);
			}
		});
		Button_9.setBackground(Color.CYAN);
		Button_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_9.setBounds(141, 185, 59, 49);
		frame.getContentPane().add(Button_9);
		
		JButton Button_6 = new JButton("6");
		Button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_6.getText();
				textField.setText(number);
			}
		});
		Button_6.setBackground(Color.CYAN);
		Button_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_6.setBounds(141, 233, 59, 49);
		frame.getContentPane().add(Button_6);
		
		JButton Button_3 = new JButton("3");
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Button_3.getText();
				textField.setText(number);
			}
		});
		Button_3.setBackground(Color.CYAN);
		Button_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_3.setBounds(141, 282, 59, 49);
		frame.getContentPane().add(Button_3);
		
		JButton Button_equal = new JButton("=");
		Button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
					
					
				}
				
			}
		});
		Button_equal.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_equal.setBounds(141, 331, 59, 49);
		frame.getContentPane().add(Button_equal);
		
		JButton Button_plus = new JButton("+");
		Button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		Button_plus.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_plus.setBounds(199, 137, 59, 49);
		frame.getContentPane().add(Button_plus);
		
		JButton Button_sub = new JButton("-");
		Button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		Button_sub.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_sub.setBounds(199, 185, 59, 49);
		frame.getContentPane().add(Button_sub);
		
		JButton Button_mul = new JButton("*");
		Button_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		Button_mul.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_mul.setBounds(199, 233, 59, 49);
		frame.getContentPane().add(Button_mul);
		
		JButton Button_div = new JButton("/");
		Button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		Button_div.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_div.setBounds(199, 282, 59, 49);
		frame.getContentPane().add(Button_div);
		
		JButton Button_percentage = new JButton("%");
		Button_percentage.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button_percentage.setBounds(199, 331, 59, 49);
		frame.getContentPane().add(Button_percentage);
	}
}
