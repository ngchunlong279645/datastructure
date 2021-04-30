package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class search {

	private JFrame frmSearch;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search window = new search();
					window.frmSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearch = new JFrame();
		frmSearch.setTitle("Search");
		frmSearch.setBounds(100, 100, 223, 116);
		frmSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearch.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnterCode = new JLabel("Please enter code");
		lblPleaseEnterCode.setBounds(10, 22, 138, 14);
		frmSearch.getContentPane().add(lblPleaseEnterCode);
		
		textField = new JTextField();
		textField.setBounds(119, 19, 71, 20);
		frmSearch.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(58, 47, 79, 20);
		frmSearch.getContentPane().add(btnNewButton);
	}

}
