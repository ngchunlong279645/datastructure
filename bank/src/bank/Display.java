package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Display {

	private JFrame frmDisplay;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frmDisplay.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDisplay = new JFrame();
		frmDisplay.setTitle("Display");
		frmDisplay.setBounds(100, 100, 526, 293);
		frmDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDisplay.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(10, 11, 218, 40);
		frmDisplay.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 21, 145, 20);
		frmDisplay.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Last Name");
		label_1.setBounds(261, 11, 414, 40);
		frmDisplay.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Account Number");
		label_2.setBounds(10, 154, 414, 40);
		frmDisplay.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Balance");
		label_3.setBounds(10, 205, 414, 40);
		frmDisplay.getContentPane().add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 215, 145, 20);
		frmDisplay.getContentPane().add(textField_1);
		
		JLabel label_4 = new JLabel("Age");
		label_4.setBounds(10, 52, 414, 40);
		frmDisplay.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Phone Number");
		label_5.setBounds(261, 52, 414, 40);
		frmDisplay.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Address");
		label_6.setBounds(10, 103, 414, 40);
		frmDisplay.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Email ");
		label_7.setBounds(261, 103, 414, 40);
		frmDisplay.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Account Type");
		label_8.setBounds(261, 154, 414, 40);
		frmDisplay.getContentPane().add(label_8);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 62, 145, 20);
		frmDisplay.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 113, 145, 20);
		frmDisplay.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(106, 164, 145, 20);
		frmDisplay.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(355, 164, 145, 20);
		frmDisplay.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(355, 113, 145, 20);
		frmDisplay.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(355, 62, 145, 20);
		frmDisplay.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(355, 21, 145, 20);
		frmDisplay.getContentPane().add(textField_8);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(325, 215, 75, 22);
		frmDisplay.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(410, 214, 75, 23);
		frmDisplay.getContentPane().add(btnClose);
	}
}
