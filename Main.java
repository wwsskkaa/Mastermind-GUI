import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){	
	Model mod=new Model();
	JFrame frame = new JFrame("Mastermind");
	GuessingPanel Compguessing=new GuessingPanel(mod);
	humanguessingGUI Humguessing=new humanguessingGUI(mod);
	mod.addObserver(Compguessing);
	mod.addObserver(Humguessing);
	frame.add(Compguessing);
	frame.add(Humguessing);
	frame.setPreferredSize(new Dimension(610,400));
	frame.setMinimumSize(new Dimension(610,400));
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);


	}
}
