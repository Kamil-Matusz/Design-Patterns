package Flyweight.Kształty;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program extends JFrame 
{
		
	private static final long serialVersionUID = 1L;
	private final int WIDTH;
	private final int HEIGHT;

	private static final FabrykaKsztaltow.TypyKsztaltow ksztalty[] = { FabrykaKsztaltow.TypyKsztaltow.LINE, FabrykaKsztaltow.TypyKsztaltow.OVAL_FILL, FabrykaKsztaltow.TypyKsztaltow.OVAL_NOFILL };
	private static final Color kolory[] = {Color.RED, Color.GREEN, Color.YELLOW};
	
	public Program(int width, int height)
	{
		this.WIDTH=width;
		this.HEIGHT=height;
		Container contentPane = getContentPane();

		JButton start = new JButton("Rysuj");
		final JPanel panel = new JPanel();

		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(start, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Graphics g = panel.getGraphics();
				for (int i = 0; i < 20; ++i) 
				{
					Ksztalt shape = FabrykaKsztaltow.getKsztalt(getRandomKsztalt());
					shape.rysuj(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomKolor());
				}
			}
		});
	}
	
	private FabrykaKsztaltow.TypyKsztaltow getRandomKsztalt()
	{
		return ksztalty[(int) (Math.random() * ksztalty.length)];
	}

	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 10));
	}

	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	private Color getRandomKolor() {
		return kolory[(int) (Math.random() * kolory.length)];
	}

	public static void main(String[] args) 
	{
		new Program(500,600);
	}
}
