import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class humanguessingGUI extends JPanel implements Observer {
	Model model;
	/**
	 * Create the panel.
	 */
	public humanguessingGUI(Model model) {
		this.model=model;
		setBackground(new Color(70, 130, 180));
		EmptyBorder emp=new EmptyBorder(5, 5, 5, 5);
		setBorder(emp);
		setLayout(null);
		
		JPanel guessingboard = new JPanel();
		guessingboard.setBackground(new Color(173, 216, 230));
		guessingboard.setBounds(18, 91, 359, 262);
		add(guessingboard);
		guessingboard.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 55, 131, 27);
		guessingboard.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(39, 96, 131, 27);
		guessingboard.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(39, 137, 131, 27);
		guessingboard.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(39, 178, 131, 27);
		guessingboard.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(39, 219, 131, 27);
		guessingboard.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(39, 14, 131, 27);
		guessingboard.add(comboBox_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setPreferredSize(new Dimension(30, 30));
		panel_9.setBackground(new Color(70, 130, 180));
		panel_9.setBounds(183, 14, 56, 27);
		guessingboard.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setPreferredSize(new Dimension(30, 30));
		panel_10.setBackground(new Color(70, 130, 180));
		panel_10.setBounds(183, 55, 56, 27);
		guessingboard.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setPreferredSize(new Dimension(30, 30));
		panel_11.setBackground(new Color(70, 130, 180));
		panel_11.setBounds(183, 96, 56, 27);
		guessingboard.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setPreferredSize(new Dimension(30, 30));
		panel_12.setBackground(new Color(70, 130, 180));
		panel_12.setBounds(183, 137, 56, 27);
		guessingboard.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setPreferredSize(new Dimension(30, 30));
		panel_13.setBackground(new Color(70, 130, 180));
		panel_13.setBounds(183, 178, 56, 27);
		guessingboard.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setPreferredSize(new Dimension(30, 30));
		panel_14.setBackground(new Color(70, 130, 180));
		panel_14.setBounds(183, 219, 56, 27);
		guessingboard.add(panel_14);
		
		JButton btnNewButton = new JButton("guess");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.makeguess();
			}
		});
		btnNewButton.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 13));
		btnNewButton.setBounds(263, 218, 79, 29);
		guessingboard.add(btnNewButton);
		
		JButton btnClear = new JButton("clear");
		btnClear.setFont(new Font("Nanum Myeongjo", Font.PLAIN, 13));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Cleanup();
			}
		});
		btnClear.setBounds(263, 188, 79, 29);
		guessingboard.add(btnClear);
		
		JPanel progress = new JPanel();
		progress.setBackground(new Color(173, 216, 230));
		progress.setBounds(389, 16, 203, 283);
		add(progress);
		progress.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel feedbackboard = new JPanel();
		feedbackboard.setBackground(new Color(173, 216, 230));
		feedbackboard.setBounds(18, 16, 359, 63);
		add(feedbackboard);
		feedbackboard.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 16, 30, 30);
		feedbackboard.add(panel);
		panel.setBackground(new Color(70, 130, 180));
		panel.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(81, 16, 30, 30);
		feedbackboard.add(panel_2);
		panel_2.setBackground(new Color(153, 50, 204));
		panel_2.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 16, 30, 30);
		feedbackboard.add(panel_3);
		panel_3.setBackground(new Color(32, 178, 170));
		panel_3.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(191, 16, 30, 30);
		feedbackboard.add(panel_4);
		panel_4.setBackground(new Color(219, 112, 147));
		panel_4.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(246, 16, 30, 30);
		feedbackboard.add(panel_1);
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(301, 16, 30, 30);
		feedbackboard.add(panel_5);
		panel_5.setBackground(new Color(255, 215, 0));
		panel_5.setPreferredSize(new Dimension(30, 30));
		
		JPanel Result = new JPanel();
		Result.setBackground(new Color(176, 224, 230));
		Result.setBounds(389, 307, 203, 46);
		add(Result);
		

	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
