import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Bilimsel extends JFrame {

	protected static final String Frame2 = null;
	private JPanel contentPane;
	private JTextField textField;
	private JButton button_1;
	private JButton button_4;
	private JButton button_2;
	private JButton button_3;

	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private Graphics gra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bilimsel frame = new Bilimsel();
					frame.setTitle("Bilimsel Hesap Makinesi");
					frame.setVisible(true);
					frame.setResizable(false);
					frame.getContentPane().setBackground(Color.BLACK);
					frame.getContentPane().setForeground(Color.BLACK);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	double sayi1 = 0, sayi2 = 0;
	String iþlem = "";
	double tri = 0;

	/**
	 * Create the frame.
	 */
	public Bilimsel() {
	
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\pc\\Desktop\\osman\\cvb.jpg"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
		
        textField = new JTextField();
		textField.setBounds(5, 64, 424, 20);
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.RIGHT); //textfield içinde yazýlarý saða hizaladým.

		final JLabel label = new JLabel("");
		label.setBounds(0, 48, 429, 14);
		label.setForeground(new Color(0, 102, 0));
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		menuBar.setBounds(0, 0, 444, 21);
		contentPane.add(menuBar);

		JMenu Yardým = new JMenu("Yardým");
		menuBar.add(Yardým);

		JMenuItem hakkýnda = new JMenuItem("Hakkýnda");
		Yardým.add(hakkýnda);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(15, 214, 45, 37);
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "0");
			}
		});
	
		JButton button_1 = new JButton("1");
		button_1.setBounds(15, 99, 45, 37);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "1");
			}
		});
		button_2 = new JButton("2");
		button_2.setBounds(61, 99, 45, 37);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "2");
			}
		});

		button_3 = new JButton("3");
		button_3.setBounds(106, 99, 45, 37);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "3");
			}
		});

		button_4 = new JButton("4");
		button_4.setBounds(15, 136, 45, 37);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "4");
			}
		});
		button_5 = new JButton("5");
		button_5.setBounds(61, 136, 45, 37);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "5");
			}
		});

		

		button_6 = new JButton("6");
		button_6.setBounds(106, 136, 45, 37);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "6");
			}
		});

		button_7 = new JButton("7");
		button_7.setBounds(15, 175, 45, 37);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "7");
			}
		});

		button_8 = new JButton("8");
		button_8.setBounds(61, 175, 45, 37);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "8");
			}
		});

		

		button_9 = new JButton("9");
		button_9.setBounds(106, 175, 45, 37);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(textField.getText() + "9");
			}
		});

		JButton button_10 = new JButton("+");
		button_10.setBounds(197, 99, 45, 37);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				iþlem = "+";
				
				sayi1 = Double.parseDouble(textField.getText());
				label.setText(sayi1+"+");
					textField.setText("");
				
			}
		});
		JButton button_11 = new JButton("-");
		button_11.setBounds(197, 136, 45, 37);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "-";
				
				sayi1 = Double.parseDouble(textField.getText());
				label.setText(sayi1+"-");
				textField.setText("");

			}
		});
		JButton button_12 = new JButton("*");
		button_12.setBounds(197, 175, 45, 37);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "*";
				
				sayi1 = Double.parseDouble(textField.getText());
				label.setText(sayi1+"*");
				textField.setText("");
			}
		});
		JButton button_13 = new JButton("/");
		button_13.setBounds(197, 214, 45, 37);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "/";
				
				sayi1 = Double.parseDouble(textField.getText());
				label.setText(sayi1+"/");
				textField.setText("");
			}
		});
		

		JButton btnC = new JButton("C");
		btnC.setBounds(61, 214, 45, 37);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");

			}
		});

		JButton button_14 = new JButton("^");
		button_14.setBounds(243, 99, 58, 37);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "^";
				
				sayi1 = Double.parseDouble(textField.getText());
				label.setText(sayi1+"^");
				textField.setText("");
			}
		});
		JButton btnSin = new JButton("Sin");
		btnSin.setBounds(243, 136, 57, 37);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "Sin";
				
				sayi1 = Double.parseDouble(textField.getText());
				tri = Math.sin(sayi1);
				label.setText("sin("+sayi1+")");
				textField.setText(String.valueOf(tri));// Stringe geri
														// çevirdik....
				iþlem = "";
			}
		});
		JButton btnCos = new JButton("Cos");
		btnCos.setBounds(244, 175, 57, 37);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				iþlem = "Cos";
				
				sayi1 = Double.parseDouble(textField.getText());
				tri = Math.cos(sayi1);
				label.setText("cos("+sayi1+")");
				textField.setText(String.valueOf(tri));// Stringe geri
														// çevirdik....
				iþlem = "";
			}
		});
		JButton btnKk = new JButton("Kök");
		btnKk.setBounds(244, 214, 57, 37);
		btnKk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				iþlem = "Kök";
				
				double kok = 0;
				sayi1 = Double.parseDouble(textField.getText());
				label.setText("kök("+sayi1+")");
				kok = Math.sqrt(sayi1);
				textField.setText(String.valueOf(kok));
				iþlem = "";
			}
		});
		JButton buttonEsit = new JButton("=");
		buttonEsit.setBounds(106, 214, 45, 37);
		buttonEsit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi2 = Double.parseDouble(textField.getText());
				double sonuç = 0;

				switch (iþlem) {
				case "+":
					sonuç = sayi1 + sayi2;
					break;

				case "-":
					sonuç = sayi1 - sayi2;
					break;

				case "*":
					sonuç = sayi1 * sayi2;
					break;

				case "/":
					if (sayi2 != 0)
						sonuç = sayi1 / sayi2;

					break;

				case "^":
					sonuç = Math.pow(sayi1, sayi2);
					break;

				}// switch sonu..........
                 label.setText("");
				textField.setText(String.valueOf(sonuç));
				iþlem = "";

			}
		});
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(textField);
		contentPane.add(button_1);
		contentPane.add(button_2);
		contentPane.add(button_3);
		contentPane.add(button_10);
		contentPane.add(button_14);
		contentPane.add(button_4);
		contentPane.add(button_5);
		contentPane.add(button_6);
		contentPane.add(button_11);
		contentPane.add(btnSin);
		contentPane.add(button_7);
		contentPane.add(button_8);
		contentPane.add(button_9);
		contentPane.add(button_12);
		contentPane.add(btnCos);
		contentPane.add(button_0);
		contentPane.add(btnC);
		contentPane.add(buttonEsit);
		contentPane.add(button_13);
		contentPane.add(btnKk);
		
      
		hakkýnda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
	Hakkýnda h=new Hakkýnda();
	h.setVisible(true);
	// JPanel panel=new JPanel();
	// panel.add(new ResimEkleme());


	// frame2.add(panel);
	/*
	JPanel jpHakkýnda = new JPanel();
    ImageIcon resim=new ImageIcon("C:\\Users\\pc\\Desktop\\osman\\cvb.png");
    JLabel lHakkýnda=new JLabel(resim);
    lHakkýnda.setSize(100, 170);
    jpHakkýnda.add(lHakkýnda,BorderLayout.WEST);
    
    frame2.add(jpHakkýnda,BorderLayout.WEST);*/
	
	/* JFrame frame2 = new JFrame();

		frame2.setTitle("Hakk\u0131nda:Bilimsel Hesap Makinesi 1.0");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(200, 200, 530, 280);
		
		JPanel contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane2);
		contentPane2.setLayout(null);
		
		ImageIcon resim=new ImageIcon("C:\\Users\\pc\\Desktop\\osman\\cvb.png");
		JLabel lblNewLabel = new JLabel(resim);
		lblNewLabel.setBounds(0, 5, 193, 237);
		contentPane2.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("Bilimsel Hesap Makinesi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(231, 5, 214, 37);
		contentPane2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eclipse Luna da haz\u0131rlam\u0131\u015F oldu\u011Fum hesap makinesi ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(231, 48, 273, 14);
		contentPane2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("projemdir.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(231, 65, 245, 27);
		contentPane2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Versiyonu:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(231, 103, 78, 14);
		contentPane2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tasarlay\u0131c\u0131:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(231, 128, 78, 14);
		contentPane2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Website:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(231, 158, 78, 14);
		contentPane2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1.0");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(330, 103, 46, 14);
		contentPane2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Osman A\u015Far");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(330, 128, 146, 14);
		contentPane2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("www.osmanasar.beseba.com");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(330, 158, 174, 14);
		contentPane2.add(lblNewLabel_9);
		frame2.add(contentPane2);

	  frame2.setVisible(true);*/
				
			}
		});

		

	}
}
