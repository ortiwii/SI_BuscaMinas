package kontroladorea;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public abstract class GelaxkaEgoera implements MouseListener {
	protected int errenkada;
	protected int zutabea;
	
	public GelaxkaEgoera(int pErr, int pZut) {
		super ();
		this.errenkada = pErr;
		this.zutabea = pZut;
	} 
	@Override
	public abstract void mouseClicked(MouseEvent e);

	@Override
	public abstract void mouseEntered(MouseEvent e);

	@Override
	public abstract void mouseExited(MouseEvent e);

	@Override
	public abstract void mousePressed(MouseEvent e);

	@Override
	public abstract void mouseReleased(MouseEvent e);
}

