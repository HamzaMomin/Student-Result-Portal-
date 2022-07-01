import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.ComponentOrientation;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Result extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
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
	public Result() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane  = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.CYAN);
	    setSize(400,400);
	  
	  
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MainMenu sf=new MainMenu();
				sf.setVisible(true);
				
				
						}
			
		});
		
		btnNewButton.setBounds(259, 306, 115, 43);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Result\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(160, 11, 43, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(61, 65, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 61, 100, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				String id= textField_1.getText();
                String name = textField_2.getText();
                String subject = textField_3.getText();
                String grade = textField_4.getText();
              

            
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentportal","root","1234");

                    String query = "INSERT INTO result values('" + id + "','" + name + "','" + subject + "','" +
                        grade + "')";

                    java.sql.Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } 
                    else
                    {
                        JOptionPane.showMessageDialog(btnNewButton,   "Data Insertrd succcessfullly");
                    }
                    connection.close();
                } 
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
			}
		});
		btnNewButton_1.setBounds(10, 307, 115, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.WHITE);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 119, 100, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(61, 128, 64, 20);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(170, 241, 100, 32);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Subject :");
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(61, 187, 78, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(170, 183, 100, 32);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Grade :");
		lblNewLabel_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(61, 245, 64, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		
		
		
		
		
		    
	}
}
