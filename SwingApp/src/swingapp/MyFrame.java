package swingapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.GridLayout;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//import com.toedter.calendar.JDateChooser;


public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtSymbol;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel ChartOptionsPanel = new JPanel();
		ChartOptionsPanel.setBorder(new LineBorder(new Color(0, 64, 128)));
		panel_1.add(ChartOptionsPanel);
		ChartOptionsPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Display Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChartOptionsPanel.add(btnNewButton);
		
		textField = new JTextField();
		ChartOptionsPanel.add(textField);
		textField.setColumns(10);
		
		txtSymbol = new JTextField();
		txtSymbol.setText("Symbol");
		ChartOptionsPanel.add(txtSymbol);
		txtSymbol.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		ChartOptionsPanel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Date Range");
		ChartOptionsPanel.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		ChartOptionsPanel.add(comboBox_1);
		
		JDateChooser dateChooser = new JDateChooser();
		ChartOptionsPanel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		ChartOptionsPanel.add(dateChooser_1);
		
		JPanel PortfolioOptionsPanel = new JPanel();
		panel_1.add(PortfolioOptionsPanel);
		PortfolioOptionsPanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("Find Portfolio Value");
		PortfolioOptionsPanel.add(btnNewButton_1, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		PortfolioOptionsPanel.add(table, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Total Portfolio Value");
		PortfolioOptionsPanel.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JPanel chartPanel = new JPanel();
		contentPane.add(chartPanel);
	}

}
