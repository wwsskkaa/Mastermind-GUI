import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class GuessingPanel extends JPanel implements Observer {
	Model model;
	/**
	 * Create the panel.
	 */
	public GuessingPanel(Model model) {
		this.model=model;
		setBackground(new Color(205, 92, 92));
		EmptyBorder emp=new EmptyBorder(5, 5, 5, 5);
		setBorder(emp);
		setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 228, 225));
		panel_6.setBounds(18, 91, 359, 147);
		add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 228, 225));
		panel_7.setBounds(389, 17, 132, 336);
		add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 228, 225));
		panel_8.setBounds(18, 16, 359, 63);
		add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 16, 30, 30);
		panel_8.add(panel);
		panel.setBackground(new Color(220, 20, 60));
		panel.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(81, 16, 30, 30);
		panel_8.add(panel_2);
		panel_2.setBackground(new Color(153, 50, 204));
		panel_2.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 16, 30, 30);
		panel_8.add(panel_3);
		panel_3.setBackground(new Color(32, 178, 170));
		panel_3.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(191, 16, 30, 30);
		panel_8.add(panel_4);
		panel_4.setBackground(new Color(219, 112, 147));
		panel_4.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(246, 16, 30, 30);
		panel_8.add(panel_1);
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(301, 16, 30, 30);
		panel_8.add(panel_5);
		panel_5.setBackground(new Color(255, 215, 0));
		panel_5.setPreferredSize(new Dimension(30, 30));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 228, 225));
		panel_9.setBounds(18, 250, 359, 103);
		add(panel_9);
		

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
