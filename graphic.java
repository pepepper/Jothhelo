import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphic extends JFrame{
	
	public graphic(MouseListener listen, WindowListener wlisten){
		addWindowListener(wlisten);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("クソオセロ");
		setSize(768, 768);
		JPanel panel = new JPanel();
		othellocanvas canvas = new othellocanvas(listen);
		getContentPane().add(panel);
		canvas.setPreferredSize(new Dimension(768, 768));
		panel.add(canvas);
	}
	
	void changeturn(int turn){
		if(turn == 1)
			setTitle("クソオセロ:白番です");
		if(turn == -1)
			setTitle("クソオセロ:黒番です");
	}
	
	void netwait(){
		setTitle("クソオセロ:対戦相手待ち");
	}
	
	void end(){
		setTitle("クソオセロ:ゲーム終了");
	}
}

class othellocanvas extends Canvas{
	private BufferedImage image;
	private Graphics2D grph;
	private BufferedImage black;
	private BufferedImage white;
	private BufferedImage bg;
	
	othellocanvas(MouseListener listen){
		addMouseListener(listen);
		try{
			black = ImageIO.read(new File("black.bmp"));
			white = ImageIO.read(new File("white.bmp"));
			bg = ImageIO.read(new File("green.bmp"));
		}catch(IOException e){
			e.printStackTrace();
		}
		image = new BufferedImage(1052, 1052, BufferedImage.TYPE_INT_RGB);
		grph = (Graphics2D) image.getGraphics();
		grph.setColor(new Color(10, 128, 10));
		grph.fillRect(0, 0, 1052, 1052);
		grph.drawImage(bg, 0, 0, null);
	}
	
	void putstone(int delta[][]){
		for(int i = 0; delta[i][0] != 0 && i < 43; i++){
			if(delta[i][0] == -1)
				grph.drawImage(black, 132 * delta[i][1], 132 * delta[i][2], null);
			else if(delta[i][0] == 1)
				grph.drawImage(white, 132 * delta[i][1], 132 * delta[i][2], null);
			delta[i][0] = delta[i][1] = delta[i][2] = 0;
		}
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, 768, 768, null);
	}
}
