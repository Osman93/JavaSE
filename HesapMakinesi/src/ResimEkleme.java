import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class ResimEkleme extends JFrame {
	ImageIcon resim = new ImageIcon("C:\\Users\\pc\\Desktop\\osman\\cvb.png");

	public ResimEkleme() {

		setSize(50, 100);
		setVisible(true);

	}

	public void paint(Graphics graphics) {

		graphics.drawImage(resim.getImage(), 0, 0, getWidth(), getHeight(),
				null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ResimEkleme();
	}

}
