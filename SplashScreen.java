

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SplashScreen extends JWindow {
	private int showtime;
	private static Timer timer;
	private static int counter = 0;
	private static JProgressBar progress = new JProgressBar();

	public SplashScreen(int d) 
	{
		showtime = d;
	}

	public void exhibitSplash() throws Exception {
		JPanel Screen = (JPanel) getContentPane();
		Screen.setBackground(Color.BLACK);
		Dimension sc = Toolkit.getDefaultToolkit().getScreenSize();//set to the center of the screen
		setBounds((sc.width-800)/2, (sc.height-600)/2, 800, 600);
		JLabel welcome = new JLabel(new ImageIcon("newlogo.png"));
		EmptyBorder border = new EmptyBorder(15, 0, 0, 0);
		welcome.setBorder(border);

		JPanel instruc = new JPanel(new GridLayout(5, 1));
		instruc.setBackground(Color.BLACK);
		JLabel intro = new JLabel(
				"This game is created by Shuang Wu");
		intro.setHorizontalAlignment(JLabel.CENTER);
		intro.setFont(new Font("Andalus", Font.PLAIN, 20));
		intro.setForeground(Color.PINK);

		Image image = ImageIO.read(new File("snakeheadlogo.png"));
		Image scaledImage = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		JLabel labelpng = new JLabel(new ImageIcon(scaledImage));

		JLabel label1 = new JLabel("   Want to play a game with me? ");
		JLabel label2 = new JLabel(
				"   Think about any combination of colors,");
		JLabel label3 = new JLabel(
				"   And I will guess it correctly in 5 steps.");
		label1.setFont(new Font("Andalus", Font.BOLD, 17));
		label1.setForeground(Color.PINK);
		label2.setFont(new Font("Andalus", Font.BOLD, 17));
		label2.setForeground(Color.PINK);
		label3.setFont(new Font("Andalus", Font.BOLD, 17));
		label3.setForeground(Color.PINK);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);

		instruc.add(intro);
		instruc.add(labelpng);
		instruc.add(label1);
		instruc.add(label2);
		instruc.add(label3);

		progress.setMaximum(50);
		Screen.add(progress, BorderLayout.SOUTH);
		LoadSplash();
		Screen.add(welcome, BorderLayout.NORTH);
		Screen.add(instruc, BorderLayout.CENTER);
		Screen.setBorder(BorderFactory.createLineBorder(Color.PINK, 5));
		setVisible(true);
		try {
			Thread.sleep(showtime);
		} catch (Exception e) {
		}

		setVisible(false);
	}

	public void LoadSplash() {
		ActionListener al = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				progress.setValue(++counter);
				if (counter == 600) {
					timer.stop();
					setVisible(false);
					return;
				}
			}
		};
		timer = new Timer(100, al);
		timer.start();
	}

	public void VisiblethenDisappear() throws Exception {
		exhibitSplash();
	}
}
