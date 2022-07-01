import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Font;

public class Fee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fee frame = new Fee();
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
	public Fee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(400,400);
		getContentPane().setBackground(Color.YELLOW);
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent e)
			{
				MainMenu sf=new MainMenu();
				sf.setVisible(true);
				}
		});
		
		contentPane.add(btnNewButton);
		btnNewButton.setBounds(270, 308, 104, 42);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Student name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(32, 67, 119, 36);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 77, 156, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Semester");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 141, 119, 26);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 141, 156, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fee");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(43, 203, 75, 17);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 195, 156, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		Button button = new Button("ok");
		button.setFont(new Font("Dialog", Font.BOLD, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				String name= textField.getText();
                String semester = textField_1.getText();
                String fee = textField_2.getText();
              

            
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentportal","root","1234");

                    String query = "INSERT INTO fee values('" + name + "','" + semester + "','" + fee + "')";

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
		button.setBounds(10, 314, 86, 36);
		contentPane.add(button);
		
		JLabel lblNewLabel_3 = new JLabel("Fee");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(155, 11, 75, 36);
		contentPane.add(lblNewLabel_3);
	}
}
