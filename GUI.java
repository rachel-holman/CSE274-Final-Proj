import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

// This can be our basis for the GUI
// Yes I know right now it just paints a smily face
// It is a place holder for the graph

public class GUI extends JFrame {

	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;
	private DrawingCanvas canvas;

	
	public GUI() {
		setSize(WIDTH, HEIGHT);
		setTitle("Shortest Path");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new DrawingCanvas();
		add(canvas);
	}
	
	
	class DrawingCanvas extends JComponent {
		
		@Override
		public void paintComponent(Graphics g) {
			graph(g);
			
			super.paintComponent(g);
		}

		public void graph(Graphics g) {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 100, 300, 300);
			g.setColor(Color.BLUE);			
			g.fillOval(180, 150, 50, 50);
			g.fillOval(280, 150, 50, 50);
			g.setColor(Color.RED);			
			g.drawArc(180, 220, 150, 100, 180, 180);			
		}

		
	}
	
	public static void main(String[] args) {
		JFrame graph = new GUI();
		graph.setVisible(true);
	}
	
}
