import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
<<<<<<< HEAD
		cat.draw(g, 75, 75);
=======
<<<<<<< HEAD
		cat.draw(g, 10, 10);
=======
		cat.draw(g, 100, 75);
>>>>>>> 993f03506fb189ec582432d8436f5e95c21b8689
>>>>>>> 5047e03e65a87aaa45657f43629d1df7b4440941
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(800, 800);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
