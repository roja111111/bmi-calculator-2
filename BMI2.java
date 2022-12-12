package Calculator;

import java.awt.Desktop.Action;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI2 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI2 frame = new BMI2();
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
	public BMI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BODY MASS INDEX");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(31, 23, 361, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER YOUR HEIGHT:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(31, 107, 175, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER YOUR WEIGHT:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(31, 185, 218, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YOUR BMI:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(31, 287, 159, 14);
		contentPane.add(lblNewLabel_3);
		
		text1 = new JTextField();
		text1.setBounds(226, 106, 166, 38);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(226, 184, 169, 45);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setBounds(148, 286, 326, 45);
		contentPane.add(text3);
		text3.setColumns(10);
		
		JButton button1 = new JButton("Calculate BMI");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
		
				double height = Double.parseDouble(text1.getText());
						
				double weight = Double.parseDouble(text2.getText());
				double BMI = weight /(height * height);
				String calbmi = String.format("%.2f", BMI);
				text3.setText(calbmi);
		
			}
		});

			
		button1.setBounds(31, 378, 89, 23);
		contentPane.add(button1);
		
		JButton button2 = new JButton("Reset");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				
			}
		});
		button2.setBounds(204, 378, 89, 23);
		contentPane.add(button2);
		
		JButton button4 = new JButton("Exit");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button4.setBounds(370, 423, 89, 23);
		contentPane.add(button4);
	}
}
