import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu()
	{
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(400,400);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("Student Result Portal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(74, 0, 223, 47);
		contentPane.add(lblNewLabel);
		
		//Result button
		JButton r = new JButton("Result");
		r.setFont(new Font("Tahoma", Font.BOLD, 12));
		r.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result t=new Result();
				t.setVisible(true);
			}
		});
		
		r.setBounds(99, 58, 171, 50);
		contentPane.add(r);
		r.setBackground(Color.WHITE); 
		    
		
		
		//subject button
		JButton s = new JButton("subject");
		s.setFont(new Font("Tahoma", Font.BOLD, 12));
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subjects f=new Subjects();
				f.setVisible(true);
			}
		});
		
		s.setBounds(99, 126, 171, 50);
		contentPane.add(s);
		s.setBackground(Color.WHITE);
		
		
		JButton f = new JButton("fee");
		f.setFont(new Font("Tahoma", Font.BOLD, 12));
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Fee ff=new Fee();
			ff.setVisible(true);
			}
		});
		f.setBounds(99, 202, 171, 50);
		contentPane.add(f);
		f.setBackground(Color.WHITE);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				btnExit.addActionListener((event) -> System.exit(0));
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(99, 279, 171, 50);
		contentPane.add(btnExit);
	}
}
