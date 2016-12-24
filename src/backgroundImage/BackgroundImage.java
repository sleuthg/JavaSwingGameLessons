package backgroundImage;

import javax.swing.JFrame;

public class BackgroundImage {

	JFrame window;
	PanelWithBackground panel;
	
	public static void main(String[] args) {
		new BackgroundImage();
	}
	
	BackgroundImage() {
		window = new JFrame();
		panel = new PanelWithBackground("sedona.png");
		
		window.setSize(400,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel); // make sure to add the panel before making the window visible
		window.setVisible(true);
	
	}
	
}
