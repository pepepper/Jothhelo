import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;

public class setmenu extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JRadioButton rdbtnNewRadioButton_3;
	JCheckBox chckbxNewCheckBox;
	JCheckBox chckbxNewCheckBox_1;
	setting set;
	ButtonGroup buttongroup1;
	ButtonGroup buttongroup2;
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;

	/**
	 * Create the frame.
	 */
	public setmenu(setting s, ActionListener listener) {
		set = s;
		buttongroup1 = new ButtonGroup();
		buttongroup2 = new ButtonGroup();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("設定");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lblNewLabel = new JLabel("モード");
		lblNewLabel.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(lblNewLabel);

		rdbtnNewRadioButton = new JRadioButton("オフライン");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(rdbtnNewRadioButton);
		buttongroup1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(listener);

		rdbtnNewRadioButton_1 = new JRadioButton("オンライン");
		rdbtnNewRadioButton_1.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(rdbtnNewRadioButton_1);
		buttongroup1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(listener);

		JLabel lblNewLabel_1 = new JLabel("ネットモード");
		lblNewLabel_1.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);

		rdbtnNewRadioButton_2 = new JRadioButton("ホスト");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setSelected(true);
		rdbtnNewRadioButton_2.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(rdbtnNewRadioButton_2);
		buttongroup2.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(listener);

		rdbtnNewRadioButton_3 = new JRadioButton("ゲスト");
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_3.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(rdbtnNewRadioButton_3);
		buttongroup2.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.addActionListener(listener);

		chckbxNewCheckBox = new JCheckBox("盤面サイズ");
		chckbxNewCheckBox.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(listener);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Koruri Regular", Font.PLAIN, 12));
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setFont(new Font("Koruri Regular", Font.PLAIN, 12));
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("8以下で入力 実際のサイズは入力値の二倍");
		lblNewLabel_4.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(lblNewLabel_4);

		label = new JLabel("");
		contentPane.add(label);

		label_1 = new JLabel("");
		contentPane.add(label_1);

		JLabel lblNewLabel_2 = new JLabel("IPまたはドメイン");
		lblNewLabel_2.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setFont(new Font("Koruri Regular", Font.PLAIN, 12));
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		label_2 = new JLabel("");
		contentPane.add(label_2);

		JLabel lblNewLabel_3 = new JLabel("部屋番号");
		lblNewLabel_3.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setFont(new Font("Koruri Regular", Font.PLAIN, 12));
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		label_3 = new JLabel("");
		contentPane.add(label_3);

		chckbxNewCheckBox_1 = new JCheckBox("パスワード");
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addActionListener(listener);

		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setFont(new Font("Koruri Regular", Font.PLAIN, 12));
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		label_4 = new JLabel("");
		contentPane.add(label_4);

		btnNewButton = new JButton("開始");
		btnNewButton.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(listener);

		btnNewButton_1 = new JButton("終了");
		btnNewButton_1.setFont(new Font("Koruri Regular", Font.BOLD, 12));
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(listener);
	}
}
