package pack1;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import interfaces.TableroGUI;

public class GBomba extends Gelaxka{
	
	public GBomba(int pZut, int pEr) {
		super(pZut, pEr);
	}
	
	public void desestali() {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/mina-r.gif");
			System.out.println("Galdu duzu");
	}

}
