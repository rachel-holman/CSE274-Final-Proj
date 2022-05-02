
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


// This can be our basis for the GUI

public class GUI extends JFrame implements ActionListener{

	private static final int WIDTH = 1200;
	private static final int HEIGHT = 640;
//	private DrawingCanvas canvas;
	private ImageIcon imageIcon;
	
	JLabel label1, label2;
	JTextField nameTF, addressTF, phoneTF, emailTF;
	JButton addButton, saveButton;
	JTextArea contactsTA;
	JComboBox selectBox;

	/**
	 * Constructs the GUI
	 */
	public GUI() {
		setSize(WIDTH, HEIGHT);
		setTitle("Shortest Path GPS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		//canvas = new DrawingCanvas();
		//add(canvas);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());

		//-------------------------------------------------------------- Right side of screen
		
		JPanel picPanel = new JPanel();
		picPanel.setLayout(new FlowLayout());
		
		imageIcon = new ImageIcon(getClass().getResource("FinalProjectGraph_Final.png"));
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(600, 600,  java.awt.Image.SCALE_SMOOTH); // scale image the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		
		label1 = new JLabel(imageIcon);
		picPanel.add(label1);			// adds graph picture to the gui
		
		
		//-------------------------------------------------------------- Left side of screen
		
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(3,1));
		
		JPanel select = select();
		JPanel options = options();
		JPanel output = output();
		
		info.add(select);
		info.add(options);
		info.add(output);
		
		container.add(info, BorderLayout.WEST);
		container.add(picPanel, BorderLayout.EAST);
	}
	
	/**
	 * Selection panel where user selects a starting vertex and a destination
	 * @return
	 */
	public JPanel select() {
		JPanel select = new JPanel();
		select.setLayout(new GridLayout(1,2));
		
		JPanel selectStart = new JPanel();
		JPanel selectEnd = new JPanel();
		
		selectStart.setBorder(new TitledBorder("Starting Location"));
		selectEnd.setBorder(new TitledBorder("Destination"));
		
		label2 = new JLabel("This is where user will select start location");
		selectStart.add(label2);
		
		select.add(selectStart);
		select.add(selectEnd);
		
		return select;
	}
	
	/**
	 * Options panel where user selects time/distance cost and presses compute button
	 * @return
	 */
	public JPanel options() {
		JPanel options = new JPanel();
		options.setBorder(new TitledBorder("Options and Controls"));
		
		return options;
		
	}
	
	/**
	 * Output panel which displays shortest path
	 * @return
	 */
	public JPanel output() {
		JPanel output = new JPanel();
		output.setBorder(new TitledBorder("Directions"));
		
		return output;
	}
	
	/**
	 * Action listener for the compute button
	 */
	
	// This method below will be used to change useDistCost from false to true with
		// the press of a button
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame graph = new GUI();
		graph.setVisible(true);
	}
	
	
	
}
