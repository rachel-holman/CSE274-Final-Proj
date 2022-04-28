
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


// This can be our basis for the GUI

public class GUI extends JFrame implements ActionListener{

	private static final int WIDTH = 1220;
	private static final int HEIGHT = 650;
//	private DrawingCanvas canvas;
	private ImageIcon imageIcon;
	
	JLabel label1, label2;
	JTextField nameTF, addressTF, phoneTF, emailTF;
	JButton addButton, saveButton;
	JTextArea contactsTA;
	JComboBox selectBox;

	
	public GUI() {
		setSize(WIDTH, HEIGHT);
		setTitle("Shortest Path GPS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//canvas = new DrawingCanvas();
		//add(canvas);
		
		Container container = getContentPane();

		container.setLayout(new BorderLayout());

		
		setLayout(new FlowLayout());
		
		JPanel picPanel = new JPanel();
		
		imageIcon = new ImageIcon(getClass().getResource("FinalProjectGraph_Final.png"));
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale image the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		
		label1 = new JLabel(imageIcon);
		label2 = new JLabel("test: This is where we will add the selection options and output textarea");
		
		picPanel.add(label1);
		
		JPanel info = new JPanel();
		info.add(label2);
		
		container.add(info, BorderLayout.WEST);
		container.add(picPanel, BorderLayout.EAST);
	}
	
	
	// We may use the drawingCanvas class below to add arrows showing shortest path
	// that's only if we have the time and energy to be extra
	
//	class DrawingCanvas extends JComponent {
//		
//		@Override
//		public void paintComponent(Graphics g) {
//			graph(g);
//			
//			super.paintComponent(g);
//		}
//
//		public void graph(Graphics g) {
//			g.setColor(Color.YELLOW);
//			g.fillOval(100, 100, 300, 300);
//			g.setColor(Color.BLUE);			
//			g.fillOval(180, 150, 50, 50);
//			g.fillOval(280, 150, 50, 50);
//			g.setColor(Color.RED);			
//			g.drawArc(180, 220, 150, 100, 180, 180);			
//		}
//
//		
//	}
	
	public static void main(String[] args) {
		JFrame graph = new GUI();
		graph.setVisible(true);
	}
	

	// This method below will be used to change useDistCost from false to true with
	// the press of a button
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
