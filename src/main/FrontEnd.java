package main;

import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;
import main.FromList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FrontEnd extends JFrame {
	//sorry for the mess

	private JPanel contentPane;
	private JButton btnRole;
	private JButton btnMisfortune;
	private JLabel lblRareCards;
	private JLabel lblCommonCards;
	private JLabel lblVeryRareCards;
	private JLabel lblMisfortuneCards;
	private JLabel lblCommon1;
	private JLabel lblCommon2;
	private JLabel lblCommon3;
	private JLabel lblRare1;
	private JLabel lblVeryRare1;
	private JLabel lblMisfortune;
	private JLabel lblRare2;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
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
	public FrontEnd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnRole());
		contentPane.add(getBtnMisfortune());
		contentPane.add(getLblRareCards());
		contentPane.add(getLblCommonCards());
		contentPane.add(getLblVeryRareCards());
		contentPane.add(getLblVeryRare_1_1());
		contentPane.add(getLblCommon1());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblRare1());
		contentPane.add(getLblVeryRare1());
		contentPane.add(getLblMisfortune());
		contentPane.add(getLblRare2());
		contentPane.add(getBtnReset());
	}

	private JButton getBtnRole() {
		if (btnRole == null) {
			btnRole = new JButton("Role");
			btnRole.addActionListener(new BtnRoleActionListener());
			btnRole.setBounds(10, 11, 155, 69);
		}
		return btnRole;
	}

	private JButton getBtnMisfortune() {
		if (btnMisfortune == null) {
			btnMisfortune = new JButton("Generate Misfortune");
			btnMisfortune.addActionListener(new BtnMisfortuneActionListener());
			btnMisfortune.setBounds(769, 11, 155, 69);
		}
		return btnMisfortune;
	}

	private JLabel getLblRareCards() {
		if (lblRareCards == null) {
			lblRareCards = new JLabel("");
			lblRareCards.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Rare Cards", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			lblRareCards.setBounds(10, 199, 914, 82);
		}
		return lblRareCards;
	}

	private JLabel getLblCommonCards() {
		if (lblCommonCards == null) {
			lblCommonCards = new JLabel("");
			lblCommonCards.setBorder(
					new TitledBorder(null, "Common Cards", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			lblCommonCards.setBounds(10, 106, 914, 82);
		}
		return lblCommonCards;
	}

	private JLabel getLblVeryRareCards() {
		if (lblVeryRareCards == null) {
			lblVeryRareCards = new JLabel("");
			lblVeryRareCards.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Very Rare Card", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			lblVeryRareCards.setBounds(10, 292, 393, 82);
		}
		return lblVeryRareCards;
	}

	private JLabel getLblVeryRare_1_1() {
		if (lblMisfortuneCards == null) {
			lblMisfortuneCards = new JLabel("");
			lblMisfortuneCards.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Misfortune Card", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			lblMisfortuneCards.setBounds(531, 292, 393, 82);
		}
		return lblMisfortuneCards;
	}

	private JLabel getLblCommon1() {
		if (lblCommon1 == null) {
			lblCommon1 = new JLabel("", SwingConstants.CENTER);
			lblCommon1.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblCommon1.setBounds(23, 122, 267, 56);
		}
		return lblCommon1;
	}

	private JLabel getLblNewLabel_1_2() {
		if (lblCommon2 == null) {
			lblCommon2 = new JLabel("", SwingConstants.CENTER);
			lblCommon2.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblCommon2.setBounds(328, 122, 267, 56);
		}
		return lblCommon2;
	}

	private JLabel getLblNewLabel_1_1_1() {
		if (lblCommon3 == null) {
			lblCommon3 = new JLabel("", SwingConstants.CENTER);
			lblCommon3.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblCommon3.setBounds(643, 122, 267, 56);
		}
		return lblCommon3;
	}

	private JLabel getLblRare1() {
		if (lblRare1 == null) {
			lblRare1 = new JLabel("", SwingConstants.CENTER);
			lblRare1.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblRare1.setBounds(23, 214, 367, 56);
		}
		return lblRare1;
	}

	private JLabel getLblVeryRare1() {
		if (lblVeryRare1 == null) {
			lblVeryRare1 = new JLabel("", SwingConstants.CENTER);
			lblVeryRare1.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblVeryRare1.setBounds(23, 307, 367, 56);
		}
		return lblVeryRare1;
	}

	private JLabel getLblMisfortune() {
		if (lblMisfortune == null) {
			lblMisfortune = new JLabel("", SwingConstants.CENTER);
			lblMisfortune.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblMisfortune.setBounds(543, 307, 367, 56);
		}
		return lblMisfortune;
	}

	private JLabel getLblRare2() {
		if (lblRare2 == null) {
			lblRare2 = new JLabel("", SwingConstants.CENTER);
			lblRare2.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblRare2.setBounds(543, 214, 367, 56);
		}
		return lblRare2;
	}

	private JButton getBtnReset() {
		if (btnReset == null) {
			btnReset = new JButton("Reset");
			btnReset.addActionListener(new BtnResetActionListener());
			btnReset.setBounds(372, 11, 167, 69);
		}
		return btnReset;
	}

	private class BtnRoleActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// resetting
			lblCommon1.setText("");
			lblCommon2.setText("");
			lblCommon3.setText("");

			lblRare1.setText("");
			lblRare2.setText("");

			lblVeryRare1.setText("");
			lblMisfortune.setText("");

			FromList list = new FromList();
			try {
				list.generateList();
				String[] commons = list.getCommons();
				String[] rares = list.getRares();
				String veryRares = list.getVeryRares();
				String misfortunes = list.getMisfortunes();

				// setting the common card labels
				if (commons[0] != null) {
					lblCommon1.setText(commons[0]);
				}

				if (commons[1] != null) {
					lblCommon2.setText(commons[1]);
				}

				if (commons[2] != null) {
					lblCommon3.setText(commons[2]);
				}

				// setting the rare card labels
				if (commons[0] != null) {
					lblRare1.setText(rares[0]);
				}

				if (rares[1] != null) {
					lblRare2.setText(rares[1]);
				}

				// setting very rare label
				if (veryRares != null) {
					lblVeryRare1.setText(veryRares);
				}

				// setting misfortune label
				if (misfortunes != null) {
					lblMisfortune.setText(misfortunes);
				}

			} catch (Exception l) {

				JOptionPane.showMessageDialog(null,
						"An error occured. You can most likely ignore it but if this message keeps repeating check the created logs file for the exact error.\nA log file has been created in this programs directory. For further assitance please read the ErrorReadMe.txt file included with this program");

				try {
					BufferedReader errRead = new BufferedReader(new FileReader("Error.log"));
					String strRead;
					String errorLog = "";
					while ((strRead = errRead.readLine()) != null) {
						errorLog += strRead + "\n";
					}
					errRead.close();

					FileWriter errWrite = new FileWriter("Error.log");
					Timestamp timestamp = new Timestamp(System.currentTimeMillis());
					String output = errorLog + timestamp + " >> " + l;
					errWrite.write(output);
					errWrite.close();

				} catch (Exception r) {
					JOptionPane.showMessageDialog(null,
							"Failed to write Error to log File. \nHere is the previous error message: " + l);
				}
			}
		}
	}

	private class BtnResetActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblCommon1.setText("");
			lblCommon2.setText("");
			lblCommon3.setText("");

			lblRare1.setText("");
			lblRare2.setText("");

			lblVeryRare1.setText("");
			lblMisfortune.setText("");
		}
	}

	private class BtnMisfortuneActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblCommon1.setText("");
			lblCommon2.setText("");
			lblCommon3.setText("");

			lblRare1.setText("");
			lblRare2.setText("");

			lblVeryRare1.setText("");
			lblMisfortune.setText("");

			FromList list = new FromList();

			try {
				list.getMisfortunes2();
				lblMisfortune.setText(list.getMisfortunes2());
			} catch (Exception l) {

				JOptionPane.showMessageDialog(null,
						"An error occured. You can most likely ignore it but if this message keeps repeating check the created logs file for the exact error.\nA log file has been created in this programs directory. For further assitance please read the ErrorReadMe.txt file included with this program");

				try {
					BufferedReader errRead = new BufferedReader(new FileReader("Error.log"));
					String strRead;
					String errorLog = "";
					while ((strRead = errRead.readLine()) != null) {
						errorLog += strRead + "\n";
					}
					errRead.close();

					FileWriter errWrite = new FileWriter("Error.log");
					Timestamp timestamp = new Timestamp(System.currentTimeMillis());
					String output = errorLog + timestamp + " >> " + l;
					errWrite.write(output);
					errWrite.close();

				} catch (Exception r) {
					JOptionPane.showMessageDialog(null,
							"Failed to write Error to log File. \nHere is the previous error message: " + l);
				}
			}
		}
	}
}
