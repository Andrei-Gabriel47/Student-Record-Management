import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Student_Record {

	private JFrame frmBdStudent;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextArea textArea;
	private JTable Table1;
	private JTable Table2;
	

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Record window = new Student_Record();
					window.frmBdStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_Record() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmBdStudent = new JFrame();
		frmBdStudent.setTitle("B&D - Student Record");
		frmBdStudent.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andre\\Desktop\\B&D.png"));
		frmBdStudent.setBounds(100, 100, 1300, 700);
		frmBdStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBdStudent.setLocationRelativeTo(null);
		frmBdStudent.setResizable(false);
		frmBdStudent.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)), "Student Record", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman",Font.BOLD,20), new Color(0, 0, 0)));
		panel.setBounds(10, 10, 850, 400);
		frmBdStudent.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(10, 25, 150, 30);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(170, 25, 150, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblFirstname.setBounds(10, 65, 150, 30);
		panel.add(lblFirstname);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 65, 150, 30);
		panel.add(textField_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblLastName.setBounds(10, 105, 150, 30);
		panel.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(170, 105, 150, 30);
		panel.add(textField_2);
		
		JLabel lblClassCode = new JLabel("Class Code");
		lblClassCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblClassCode.setBounds(10, 145, 150, 30);
		panel.add(lblClassCode);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblTotalScore.setBounds(10, 257, 150, 30);
		panel.add(lblTotalScore);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(170, 257, 150, 30);
		panel.add(textField_4);
		
		JLabel lblAverrage = new JLabel("Average");
		lblAverrage.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblAverrage.setBounds(10, 297, 150, 30);
		panel.add(lblAverrage);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(170, 297, 150, 30);
		panel.add(textField_5);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblRanking.setBounds(10, 337, 150, 30);
		panel.add(lblRanking);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(170, 337, 150, 30);
		panel.add(textField_6);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblMath.setBounds(509, 25, 150, 30);
		panel.add(lblMath);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(669, 25, 150, 30);
		panel.add(textField_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("English");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(509, 65, 150, 30);
		panel.add(lblNewLabel_1_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(669, 65, 150, 30);
		panel.add(textField_8);
		
		JLabel lblNewLabel_2_1 = new JLabel("History");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(509, 105, 150, 30);
		panel.add(lblNewLabel_2_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(669, 105, 150, 30);
		panel.add(textField_9);
		
		JLabel lblNewLabel_3_1 = new JLabel("Geography");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_1.setBounds(509, 145, 150, 30);
		panel.add(lblNewLabel_3_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(669, 145, 150, 30);
		panel.add(textField_10);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblChemistry.setBounds(509, 185, 150, 30);
		panel.add(lblChemistry);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(669, 185, 150, 30);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_2 = new JLabel("Physics");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_2.setBounds(509, 225, 150, 30);
		panel.add(lblNewLabel_1_2);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(669, 225, 150, 30);
		panel.add(textField_12);
		
		JLabel lblNewLabel_2_2 = new JLabel("Economy");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_2.setBounds(509, 265, 150, 30);
		panel.add(lblNewLabel_2_2);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(669, 265, 150, 30);
		panel.add(textField_13);
		
		JLabel lblNewLabel_3_2 = new JLabel("Philosophy");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_2.setBounds(509, 305, 150, 30);
		panel.add(lblNewLabel_3_2);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(669, 305, 150, 30);
		panel.add(textField_14);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Biology");
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_2_1.setBounds(509, 348, 150, 30);
		panel.add(lblNewLabel_3_2_1);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(669, 348, 150, 30);
		panel.add(textField_15);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Code", "A210", "A211", "A212", "A213", "A214", "A215", "B210", "B220", "B230", "B240", "C200", "C210", "C211", "C230", "C240", "D190", "D200", "D210", "D220", "E200", "E210", "E220", "E230", "E240", "F180", "F190", "F200", "F210", "F220"}));
		comboBox.setBounds(170, 145, 150, 30);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new MatteBorder(2, 3, 2, 3, (Color) new Color(64, 64, 64)), "Grades", TitledBorder.LEADING, TitledBorder.TOP, new Font("Times New Roman",Font.BOLD,20), Color.BLACK));
		panel_1.setBounds(870, 10, 406, 400);
		frmBdStudent.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 24, 386, 366);
		panel_1.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		scrollPane.setViewportView(textArea);
		textArea.setColumns(10);
		
		JButton btnNewButton = new JButton("Ranking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
	
		
	         	Double[] T = new Double[30];
				T[0] = Double.parseDouble(textField_7.getText());
				T[1] = Double.parseDouble(textField_8.getText());
				T[2] = Double.parseDouble(textField_9.getText());
				T[3] = Double.parseDouble(textField_10.getText());
				T[4] = Double.parseDouble(textField_11.getText());
				T[5] = Double.parseDouble(textField_12.getText());
				T[6] = Double.parseDouble(textField_13.getText());
				T[7] = Double.parseDouble(textField_14.getText());
				T[8] = Double.parseDouble(textField_15.getText());
				
				T[9] = T[0]+T[1]+T[2]+T[3]+T[4]+T[5]+T[6]+T[7]+T[8];
				T[10] = T[9] / 9;
				
				String Total = String.format("%.0f", T[9]);
				textField_4.setText(Total);
				
				String Average = String.format("%.2f", T[10]);
				textField_5.setText(Average);
				
				if(T[9]>850) {
					textField_6.setText("5%");
				}
				else if(T[9]>750) {
					textField_6.setText("15%");
				}
				else if(T[9]>700) {
					textField_6.setText("20%");
				}
				else if(T[9]>650) {
					textField_6.setText("35%");
				}
				else if(T[9]>550) {
					textField_6.setText("55%");
				}
				else if(T[9]>500) {
					textField_6.setText("75%");
				}
				else if(T[9]>400) {
					textField_6.setText("90%");
				}
				else  {
					textField_6.setText("Failed");
				}
				
				DefaultTableModel model = (DefaultTableModel) Table2.getModel();
				model.addRow(new Object[]{
					
						textField_1.getText(),
						textField_2.getText(),
						comboBox.getSelectedItem(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_13.getText(),
						textField_14.getText(),
						textField_15.getText()
						
						
					
				});
				
				textArea.setText("Stdent Result Record" +"\n"
						+"================================"+"\n"
						+"First Name :\t\t" + textField_1.getText()+"\n"
						+"Last Name :\t\t" + textField_2.getText()+"\n"
						+"Math :\t\t" + textField_7.getText()+"\n"
						+"English :\t\t" + textField_8.getText()+"\n"
						+"History :\t\t" + textField_9.getText()+"\n"
						+"Geography:\t\t" + textField_10.getText()+"\n"
						+"Chemistry:\t\t" + textField_11.getText()+"\n"
						+"Physics:\t\t" + textField_12.getText()+"\n"
						+"Economy :\t\t" + textField_13.getText()+"\n"
						+"Philosophy:\t\t" + textField_14.getText()+"\n"
						+"Biology:\t\t" + textField_15.getText()+"\n"
						+"================================="
						);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(10, 595, 200, 58);
		frmBdStudent.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) Table2.getModel();
				model.removeRow(Table2.getSelectedRow());
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnDelete.setBounds(254, 595, 200, 58);
		frmBdStudent.getContentPane().add(btnDelete);
		
		JButton btnAdd = new JButton("Add New");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				comboBox.setSelectedIndex(0);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_6.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textArea.setText(null);
				
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnAdd.setBounds(515, 595, 200, 58);
		frmBdStudent.getContentPane().add(btnAdd);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				comboBox.setSelectedIndex(0);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_6.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textArea.setText(null);
				
				DefaultTableModel model = (DefaultTableModel) Table2.getModel();
				int i=0;
				 while(Table2.getRowCount()!=0) {
					 model.removeRow(i);
					 
					 
				 }
				 
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnReset.setBounds(773, 595, 200, 58);
		frmBdStudent.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBdStudent.dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnExit.setBounds(1023, 595, 200, 58);
		frmBdStudent.getContentPane().add(btnExit);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 427, 1266, 158);
		frmBdStudent.getContentPane().add(scrollPane_1);
		
		Table2 = new JTable();
		Table2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First name", "Last Name", "Class Code", "Total Score", "Average", "Ranking", "Math", "English", "History", "Geography", "Chemistry", "Physics", "Economy", "Philosophy", "Biology"
			}
		));
		Table2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		scrollPane_1.setViewportView(Table2);
		frmBdStudent.setVisible(true);
		
	}
}
