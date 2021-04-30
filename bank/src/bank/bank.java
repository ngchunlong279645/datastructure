package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class bank {

	private JFrame frmMainMenu;
	private JTextField txtLeeMei;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAccountNumber;
	private JTextField txtBalance;
	private JTextField txtCode;
	private JTextField txtHuiHui;
	private JTextField txtLinLin;
	private JTextField txtTanTan;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bank window = new bank();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main menu");
		frmMainMenu.setBounds(100, 100, 598, 257);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add ");
		btnNewButton.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 11));
		btnNewButton.setBounds(482, 79, 90, 21);
		frmMainMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 11));
		btnNewButton_1.setBounds(482, 175, 90, 21);
		frmMainMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 11));
		btnNewButton_2.setBounds(482, 111, 90, 21);
		frmMainMenu.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 11));
		btnNewButton_3.setBounds(482, 143, 90, 21);
		frmMainMenu.getContentPane().add(btnNewButton_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 627, 21);
		frmMainMenu.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mnFile.add(mntmSaveAs);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmUserGuide = new JMenuItem("User Guide");
		mnHelp.add(mntmUserGuide);
		
		txtLeeMei = new JTextField();
		txtLeeMei.setText("0001           LEE                       MEI                        400987665543                   RM 2000 ");
		txtLeeMei.setBounds(10, 79, 462, 26);
		frmMainMenu.getContentPane().add(txtLeeMei);
		txtLeeMei.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Sylfaen", Font.BOLD, 11));
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(65, 42, 86, 26);
		frmMainMenu.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Sylfaen", Font.BOLD, 11));
		txtLastName.setText("Last Name");
		txtLastName.setBounds(150, 42, 86, 26);
		frmMainMenu.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtAccountNumber = new JTextField();
		txtAccountNumber.setFont(new Font("Sylfaen", Font.BOLD, 11));
		txtAccountNumber.setText("Account Number");
		txtAccountNumber.setBounds(236, 42, 132, 26);
		frmMainMenu.getContentPane().add(txtAccountNumber);
		txtAccountNumber.setColumns(10);
		
		txtBalance = new JTextField();
		txtBalance.setFont(new Font("Sylfaen", Font.BOLD, 11));
		txtBalance.setText("Balance ");
		txtBalance.setBounds(367, 42, 105, 26);
		frmMainMenu.getContentPane().add(txtBalance);
		txtBalance.setColumns(10);
		
		txtCode = new JTextField();
		txtCode.setFont(new Font("Sylfaen", Font.BOLD, 11));
		txtCode.setText("Code");
		txtCode.setBounds(10, 42, 55, 26);
		frmMainMenu.getContentPane().add(txtCode);
		txtCode.setColumns(10);
		
		txtHuiHui = new JTextField();
		txtHuiHui.setText("0002           HUI                       HUI                        421988665543                   RM 1500 ");
		txtHuiHui.setColumns(10);
		txtHuiHui.setBounds(10, 103, 462, 26);
		frmMainMenu.getContentPane().add(txtHuiHui);
		
		txtLinLin = new JTextField();
		txtLinLin.setText("0003           LIN                        LIN                        421481168549                   RM 1980 ");
		txtLinLin.setColumns(10);
		txtLinLin.setBounds(10, 126, 462, 26);
		frmMainMenu.getContentPane().add(txtLinLin);
		
		txtTanTan = new JTextField();
		txtTanTan.setText("0004          TAN                       TAN                       409881122549                   RM 2190 ");
		txtTanTan.setColumns(10);
		txtTanTan.setBounds(10, 151, 462, 26);
		frmMainMenu.getContentPane().add(txtTanTan);
		
		textField = new JTextField();
		textField.setBounds(10, 175, 462, 33);
		frmMainMenu.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
