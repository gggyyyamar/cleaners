package cleaners;
import java.text.DecimalFormat;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class emppayroll {

	private JFrame frmGeorge;
	private JTextField textFieldEmpNme;
	private JTextField textFieldHrsSal;
	private JTextField textFieldFM;
	private JTextField textFieldSM;
	private JTextField textFieldFT;
	private JTextField textFieldST;
	private JTextField textFieldFW;
	private JTextField textFieldSW;
	private JTextField textFieldFTH;
	private JTextField textFieldSTH;
	private JTextField textFieldFF;
	private JTextField textFieldSF;
	private JTextField textFieldFS;
	private JTextField textFieldSS;
	private JTextField textFieldFSU;
	private JTextField textFieldSSU;
	private JTextField textFieldRegH;
	private JTextField textFieldOverH;
	private JTextField textFieldRegA;
	private JTextField textFieldOverA;
	private JTextField textFieldNet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					emppayroll window = new emppayroll();
					window.frmGeorge.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public emppayroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorge = new JFrame();
		frmGeorge.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmGeorge.setBounds(100, 100, 903, 642);
		frmGeorge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorge.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(0, 10, 879, 153);
		frmGeorge.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setBounds(66, 51, 95, 23);
		panel.add(lblNewLabel);
		
		textFieldEmpNme = new JTextField();
		textFieldEmpNme.setBounds(171, 53, 206, 21);
		panel.add(textFieldEmpNme);
		textFieldEmpNme.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setBounds(480, 52, 79, 21);
		panel.add(lblNewLabel_1);
		
		textFieldHrsSal = new JTextField();
		textFieldHrsSal.setBounds(604, 52, 192, 21);
		panel.add(textFieldHrsSal);
		textFieldHrsSal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 204, 879, 203);
		frmGeorge.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("First Week:");
		lblNewLabel_2.setBounds(21, 74, 71, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Week:");
		lblNewLabel_3.setBounds(11, 118, 81, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setBounds(115, 51, 71, 20);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setBounds(235, 55, 62, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setBounds(325, 55, 71, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setBounds(446, 55, 61, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setBounds(554, 55, 45, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setBounds(668, 55, 61, 13);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setBounds(792, 55, 45, 13);
		panel_1.add(lblNewLabel_10);
		
		textFieldFM = new JTextField();
		textFieldFM.setBounds(90, 75, 96, 19);
		panel_1.add(textFieldFM);
		textFieldFM.setColumns(10);
		
		textFieldSM = new JTextField();
		textFieldSM.setBounds(90, 119, 96, 19);
		panel_1.add(textFieldSM);
		textFieldSM.setColumns(10);
		
		textFieldFT = new JTextField();
		textFieldFT.setBounds(201, 75, 96, 19);
		panel_1.add(textFieldFT);
		textFieldFT.setColumns(10);
		
		textFieldST = new JTextField();
		textFieldST.setBounds(201, 119, 96, 19);
		panel_1.add(textFieldST);
		textFieldST.setColumns(10);
		
		textFieldFW = new JTextField();
		textFieldFW.setBounds(321, 75, 96, 19);
		panel_1.add(textFieldFW);
		textFieldFW.setColumns(10);
		
		textFieldSW = new JTextField();
		textFieldSW.setBounds(321, 119, 96, 19);
		panel_1.add(textFieldSW);
		textFieldSW.setColumns(10);
		
		textFieldFTH = new JTextField();
		textFieldFTH.setBounds(427, 75, 96, 19);
		panel_1.add(textFieldFTH);
		textFieldFTH.setColumns(10);
		
		textFieldSTH = new JTextField();
		textFieldSTH.setBounds(427, 119, 96, 19);
		panel_1.add(textFieldSTH);
		textFieldSTH.setColumns(10);
		
		textFieldFF = new JTextField();
		textFieldFF.setBounds(530, 75, 96, 19);
		panel_1.add(textFieldFF);
		textFieldFF.setColumns(10);
		
		textFieldSF = new JTextField();
		textFieldSF.setBounds(533, 119, 96, 19);
		panel_1.add(textFieldSF);
		textFieldSF.setColumns(10);
		
		textFieldFS = new JTextField();
		textFieldFS.setBounds(649, 75, 96, 19);
		panel_1.add(textFieldFS);
		textFieldFS.setColumns(10);
		
		textFieldSS = new JTextField();
		textFieldSS.setBounds(653, 119, 96, 19);
		panel_1.add(textFieldSS);
		textFieldSS.setColumns(10);
		
		textFieldFSU = new JTextField();
		textFieldFSU.setBounds(773, 75, 96, 19);
		panel_1.add(textFieldFSU);
		textFieldFSU.setColumns(10);
		
		textFieldSSU = new JTextField();
		textFieldSSU.setBounds(773, 119, 96, 19);
		panel_1.add(textFieldSSU);
		textFieldSSU.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 442, 879, 153);
		frmGeorge.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnPrcss = new JButton("Process It");
		btnPrcss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String employeeName;
				employeeName=textFieldEmpNme.getText();
				double [][]hoursWorked = new double [2][7];
				double hourlySalary, rHours = 0 ,oHours = 0,rAmount,oAmount,netPay;
				DecimalFormat df = new DecimalFormat("#.##");
				hoursWorked[0][0] = Double.parseDouble(textFieldFM.getText());
				hoursWorked[0][1] = Double.parseDouble(textFieldFT.getText());
				hoursWorked[0][2] = Double.parseDouble(textFieldFW.getText());
				hoursWorked[0][3] = Double.parseDouble(textFieldFTH.getText());
				hoursWorked[0][4] = Double.parseDouble(textFieldFF.getText());
				hoursWorked[0][5] = Double.parseDouble(textFieldFS.getText());
				hoursWorked[0][6] = Double.parseDouble(textFieldFSU.getText());
				hoursWorked[1][0] = Double.parseDouble(textFieldSM.getText());
				hoursWorked[1][1] = Double.parseDouble(textFieldST.getText());
				hoursWorked[1][2] = Double.parseDouble(textFieldSW.getText());
				hoursWorked[1][3] = Double.parseDouble(textFieldSTH.getText());
				hoursWorked[1][4] = Double.parseDouble(textFieldSF.getText());
				hoursWorked[1][5] = Double.parseDouble(textFieldSS.getText());
				hoursWorked[1][6] = Double.parseDouble(textFieldSSU.getText());
				hourlySalary=Double.parseDouble(textFieldHrsSal.getText());

				
			    for (int i = 0; i < hoursWorked.length; ++i) {
			        for(int j = 0; j < hoursWorked[i].length; ++j) {
			        	if(hoursWorked[i][j]>8) {
			        		double hours = hoursWorked[i][j]-8;
			        		oHours += hours;
			        	}
			        }
			      }
				textFieldOverH.setText(String.valueOf(oHours));
				for(int i= 0; i < hoursWorked.length; ++i) {
					for (int j = 0; j < hoursWorked[i].length; ++j) {
						rHours += hoursWorked[i][j];
					}
				}
				rHours -= oHours;
				textFieldRegH.setText(String.valueOf(rHours));
				rAmount=rHours*hourlySalary;
				textFieldRegA.setText(String.valueOf(rAmount));
				oAmount=oHours*27.78;
				oAmount=Double.parseDouble(df.format(oAmount));
				textFieldOverA.setText(String.valueOf(oAmount));
				netPay=rAmount + oAmount;
				textFieldNet.setText(String.valueOf(netPay));
			}
				
			}
				);
		btnPrcss.setBounds(22, 47, 104, 63);
		panel_2.add(btnPrcss);
		
		JLabel lblNewLabel_11 = new JLabel("Regular:");
		lblNewLabel_11.setBounds(136, 69, 65, 18);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime:");
		lblNewLabel_12.setBounds(136, 92, 65, 18);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setBounds(222, 47, 45, 13);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setBounds(355, 47, 45, 13);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Net Pay:");
		lblNewLabel_15.setBounds(490, 69, 65, 13);
		panel_2.add(lblNewLabel_15);
		
		textFieldRegH = new JTextField();
		textFieldRegH.setEditable(false);
		textFieldRegH.setBounds(198, 67, 104, 16);
		panel_2.add(textFieldRegH);
		textFieldRegH.setColumns(10);
		
		textFieldOverH = new JTextField();
		textFieldOverH.setEditable(false);
		textFieldOverH.setBounds(208, 92, 96, 19);
		panel_2.add(textFieldOverH);
		textFieldOverH.setColumns(10);
		
		textFieldRegA = new JTextField();
		textFieldRegA.setEditable(false);
		textFieldRegA.setBounds(328, 67, 131, 16);
		panel_2.add(textFieldRegA);
		textFieldRegA.setColumns(10);
		
		textFieldOverA = new JTextField();
		textFieldOverA.setEditable(false);
		textFieldOverA.setBounds(328, 92, 131, 18);
		panel_2.add(textFieldOverA);
		textFieldOverA.setColumns(10);
		
		textFieldNet = new JTextField();
		textFieldNet.setEditable(false);
		textFieldNet.setBounds(561, 69, 96, 19);
		panel_2.add(textFieldNet);
		textFieldNet.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(693, 47, 85, 57);
		panel_2.add(btnClose);
	}
}
