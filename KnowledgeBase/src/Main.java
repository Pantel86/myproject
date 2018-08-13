import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
	
	public static JFrame f = new JFrame("Window");
	public static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static void main(String[] args) {
		
		//Window Parameters
		f.setSize(850, 900);
		f.setLocation(dim.width / 2 - f.getSize().width/2, dim.height / 2 - f.getSize().height/2);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
}
