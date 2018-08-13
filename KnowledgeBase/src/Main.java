import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame f = new JFrame("Window");
	public static JPanel parentPanel, lineHandler, p1, p2, p3;
	public static JLabel userNamelbl, passwordlbl;
	public static JTextField username;
	public static JPasswordField password;
	public static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static void main(String[] args) {
		
		//Window Parameters
		f.setSize(800, 900);
		f.setLocation(dim.width / 2 - f.getSize().width/2, dim.height / 2 - f.getSize().height/2);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		//panel set up
		parentPanel = new JPanel();
		lineHandler = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		//Panel layout set up
		parentPanel.setLayout(new FlowLayout());
		lineHandler.setLayout(new GridLayout(3,1));
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());

		//adding components to JFrame
		f.add(parentPanel);
		parentPanel.add(lineHandler);
		lineHandler.add(p1);
		lineHandler.add(p2);
		lineHandler.add(p3);
		
		//JLabel set up
		userNamelbl = new JLabel("Username");
		passwordlbl = new JLabel("Password");
		username = new JTextField(10);
		password = new JPasswordField(10);
		
		//p1
		p1.add(userNamelbl);
		p1.add(username);
		
		//p2
		p2.add(passwordlbl);
		p2.add(password);
	}
	
}
