import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageCreationExampls {
	static Image createSampleImage() {
// instantiate a new BufferedImage (subclass of Image) instance
		BufferedImage img = new BufferedImage(640, 480, BufferedImage.TYPE_INT_ARGB);
//draw something on the image
		paintOnImage(img);
		return img;
	}

	static void paintOnImage(BufferedImage img) {
// get a drawable Graphics2D (subclass of Graphics) object
		Graphics2D g2d = (Graphics2D) img.getGraphics();
// some sample drawing
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 640, 480);
		g2d.setColor(Color.WHITE);
		g2d.drawLine(0, 0, 640, 480);
		g2d.drawLine(0, 480, 640, 0);
		g2d.setColor(Color.YELLOW);
		g2d.drawOval(200, 100, 240, 280);
		g2d.setColor(Color.RED);
		g2d.drawRect(150, 70, 340, 340);
// drawing on images can be very memory-consuming
// so it's better to free resources early
// it's not necessary, though
		g2d.dispose();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = createSampleImage();
		ImageIcon icon = new ImageIcon(img);
		frame.add(new JLabel(icon));
		frame.pack();
		frame.setVisible(true);
	}
}