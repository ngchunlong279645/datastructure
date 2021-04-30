package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class delete {

	private JFrame frmRemoveAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete window = new delete();
					window.frmRemoveAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRemoveAccount = new JFrame();
		frmRemoveAccount.setTitle("Select Option");
		frmRemoveAccount.setBounds(100, 100, 281, 125);
		frmRemoveAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRemoveAccount.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Are you sure to delete this account ?");
		lblNewLabel.setBounds(22, 11, 233, 28);
		frmRemoveAccount.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setBounds(22, 50, 90, 23);
		frmRemoveAccount.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.setBounds(142, 50, 90, 23);
		frmRemoveAccount.getContentPane().add(btnNewButton_1);
	}

}
