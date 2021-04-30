package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class add {

	private JFrame frmDisplay;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add window = new add();
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
	public add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDisplay = new JFrame();
		frmDisplay.setTitle("Add Customer");
		frmDisplay.setBounds(100, 100, 450, 491);
		frmDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDisplay.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 11, 414, 40);
		frmDisplay.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(10, 52, 414, 40);
		frmDisplay.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSecurityCode = new JLabel("Account Number");
		lblSecurityCode.setBounds(10, 93, 414, 40);
		frmDisplay.getContentPane().add(lblSecurityCode);
		
		JLabel lblInitialDeposit = new JLabel("Balance");
		lblInitialDeposit.setBounds(10, 134, 414, 40);
		frmDisplay.getContentPane().add(lblInitialDeposit);
		
		JLabel lblAccountType = new JLabel("Account Type");
		lblAccountType.setBounds(10, 175, 414, 40);
		frmDisplay.getContentPane().add(lblAccountType);
		
		textField = new JTextField();
		textField.setBounds(137, 21, 287, 20);
		frmDisplay.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 62, 287, 20);
		frmDisplay.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 103, 287, 20);
		frmDisplay.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 144, 287, 20);
		frmDisplay.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(236, 418, 89, 23);
		frmDisplay.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Current Acoount", "Saving Account"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(137, 185, 287, 28);
		frmDisplay.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(335, 418, 89, 23);
		frmDisplay.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Apply");
		btnNewButton_2.setBounds(137, 418, 89, 23);
		frmDisplay.getContentPane().add(btnNewButton_2);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(10, 226, 414, 40);
		frmDisplay.getContentPane().add(lblPhoneNumber);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 236, 287, 20);
		frmDisplay.getContentPane().add(textField_4);
		
		JLabel lblAddrease = new JLabel("Address");
		lblAddrease.setBounds(10, 277, 414, 40);
		frmDisplay.getContentPane().add(lblAddrease);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(137, 287, 287, 20);
		frmDisplay.getContentPane().add(textField_5);
		
		JLabel lblEmail = new JLabel("Email ");
		lblEmail.setBounds(10, 328, 414, 40);
		frmDisplay.getContentPane().add(lblEmail);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(137, 338, 287, 20);
		frmDisplay.getContentPane().add(textField_6);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 369, 414, 40);
		frmDisplay.getContentPane().add(lblAge);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(137, 379, 287, 20);
		frmDisplay.getContentPane().add(textField_7);
	}
}
