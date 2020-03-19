package pack1;

import interfaces.TableroGUI;

public class GHutsa extends Gelaxka{

	
	public GHutsa(int pZutabea, int pErrenkada) {
		super(pZutabea, pErrenkada);
		
	}

	public void desestali() {
		TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c0.gif");
	}

}
