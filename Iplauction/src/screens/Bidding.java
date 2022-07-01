package screens;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.ImageIcon;

public class Bidding extends JFrame {

	private static JPanel contentPane;
	private static JLabel lblNewLabel_1;
	public  void  Bid(ArrayList<String> arr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		
				     Bidding frame = new Bidding();
					frame.setVisible(true);
					setTitle("Bidding page ");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 537, 298);
					contentPane = new JPanel();
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					setContentPane(contentPane);
					contentPane.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setToolTipText("");
		textField.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textField.setSize(new Dimension(18, 18));
		textField.setBounds(159, 127, 196, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Bid\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String amo = textField.getText();
				Auctiondisplay_team.enter_auction(arr, amo);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(187, 191, 136, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter the Amount");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(159, 54, 217, 40);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Bidding.class.getResource("/assests/Auctiondisplay.png")));
		lblNewLabel_1.setBounds(0, 10, 513, 241);
		contentPane.add(lblNewLabel_1);
			
			}
		});
	}

	}

