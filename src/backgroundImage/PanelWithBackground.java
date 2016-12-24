package backgroundImage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelWithBackground extends JPanel {

	BufferedImage panelBackground;
	File bkgFile;
	
	PanelWithBackground(String backgroundFile) {
		try {
			// getClass().getResourceAsStream allows us to get a file that's in the classpath
			panelBackground = ImageIO.read(getClass().getResourceAsStream(backgroundFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Override paintComponent
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(panelBackground, 0, 0, 400, 400, null);
	}
	
}
