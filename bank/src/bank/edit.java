package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class edit {

	private JFrame frmEdit;
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
					edit window = new edit();
					window.frmEdit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEdit = new JFrame();
		frmEdit.setTitle("Edit");
		frmEdit.setBounds(100, 100, 542, 338);
		frmEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEdit.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("First Name");
		label.setBounds(10, 11, 78, 40);
		frmEdit.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Age");
		label_1.setBounds(10, 62, 61, 40);
		frmEdit.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Address");
		label_2.setBounds(10, 113, 84, 40);
		frmEdit.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Account Number");
		label_3.setBounds(10, 164, 95, 40);
		frmEdit.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Balance");
		label_4.setBounds(10, 215, 95, 40);
		frmEdit.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Last Name");
		label_5.setBounds(280, 11, 414, 40);
		frmEdit.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Phone Number");
		label_6.setBounds(280, 62, 414, 40);
		frmEdit.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Email ");
		label_7.setBounds(280, 113, 414, 40);
		frmEdit.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Account Type");
		label_8.setBounds(280, 177, 414, 40);
		frmEdit.getContentPane().add(label_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 21, 145, 20);
		frmEdit.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 72, 145, 20);
		frmEdit.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 123, 145, 20);
		frmEdit.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 174, 145, 20);
		frmEdit.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(125, 225, 145, 20);
		frmEdit.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(371, 21, 145, 20);
		frmEdit.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(371, 72, 145, 20);
		frmEdit.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(371, 123, 145, 20);
		frmEdit.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(371, 184, 145, 20);
		frmEdit.getContentPane().add(textField_8);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(328, 265, 89, 23);
		frmEdit.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(427, 265, 89, 23);
		frmEdit.getContentPane().add(btnNewButton);
	}

}
