package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class userguide {

	private JFrame frmUserGuide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userguide window = new userguide();
					window.frmUserGuide.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userguide() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserGuide = new JFrame();
		frmUserGuide.setTitle("User Guide");
		frmUserGuide.setBounds(100, 100, 596, 160);
		frmUserGuide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserGuide.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. Add  = Add new customer into the system");
		lblNewLabel.setBounds(10, 11, 295, 14);
		frmUserGuide.getContentPane().add(lblNewLabel);
		
		JLabel lblDeposit = new JLabel("2. Delete = Remove the account which is no use anymore");
		lblDeposit.setBounds(10, 36, 545, 14);
		frmUserGuide.getContentPane().add(lblDeposit);
		
		JLabel lblWithdraw = new JLabel("4. Search = User can search the account by using this function");
		lblWithdraw.setBounds(10, 85, 436, 14);
		frmUserGuide.getContentPane().add(lblWithdraw);
		
		JLabel lblDeposit_1 = new JLabel("3. Edit = User can update their profile by this");
		lblDeposit_1.setBounds(10, 61, 295, 14);
		frmUserGuide.getContentPane().add(lblDeposit_1);
	}

}
