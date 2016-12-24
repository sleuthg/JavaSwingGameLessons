package labelWithImage;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelWithImage extends JLabel{
    
	Image image;
	
	public static void main( String[] args )
    {
    	LabelWithImage lblImg = new LabelWithImage();
    	
    	JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.add(lblImg);
        frame.setVisible(true);
        frame.pack();
    }
    
    LabelWithImage() {
    	image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("sedona.png"));
        } catch (IOException e) {
        	e.printStackTrace();
        }
        this.setIcon(new ImageIcon(image));
    }
    
}
