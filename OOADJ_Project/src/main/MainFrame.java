package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Rectangle;

public class MainFrame extends JFrame {

	private static JPanel MainPanel;

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}

	public MainFrame() {
		setResizable(false);
		setTitle("Computer Based Test\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 584);
		setBackground(Color.BLACK);
		MainPanel = new JPanel();
		MainPanel.setBounds(new Rectangle(0, 0, 1000, 600));
		MainPanel.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		MainPanel.setBackground(Color.BLACK);
		setContentPane(MainPanel);
		MainPanel.setLayout(null);
		AddPanel(new Panel1());
	}
	public static void AddPanel(JPanel p)
	{
		MainFrame.RemoveAllPanel();
		p.setBounds(new Rectangle(0, 0, 1000, 600));
		MainPanel.add(p);
	}
	public static void RemoveAllPanel()
	{
		MainPanel.removeAll();
		MainPanel.repaint();
		MainPanel.revalidate();
	}
	public static Rectangle Dimensions()
	{
		return MainPanel.getBounds();
	}
}