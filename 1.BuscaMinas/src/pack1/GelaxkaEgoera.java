package pack1;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class GelaxkaEgoera implements MouseListener {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton b=(JButton)e.getSource();
		if (e.getButton()==MouseEvent.BUTTON3){
				System.out.println("BOTON DERECHO");
				try {
					FondoSwing a=new FondoSwing(ImageIO.read(new File("./src/irudiak/bandera.gif")));
					b.setBorder(a);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				// TODO Auto-generated catch block
			
			
		}
		if (e.getButton()==MouseEvent.BUTTON1){
			System.out.println("BOTON IZQUIERDO");
			FondoSwing a;
			try {
				a = new FondoSwing(ImageIO.read(new File("./src/irudiak/c0.gif")));
				b.setBorder(a);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}

