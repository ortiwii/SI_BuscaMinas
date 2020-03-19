package kontroladorea;

import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

import pack1.*;

public class GEstalita extends GelaxkaEgoera{

	public GEstalita(int pErr, int pZut) {
		super(pErr, pZut);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
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
			ListaGelaxka.getLista().getGelaxka(super.errenkada, super.zutabea).desestali();
		
		}
		
		
	}@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
