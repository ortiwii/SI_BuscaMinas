package pack1;

import interfaces.TableroGUI;

public class GZenbakia extends Gelaxka {

	private int zenb;
	
	public GZenbakia(int pZut, int pEr, int pZenb) {
		super (pZut, pEr);
		this.zenb = pZenb;
		
	}
	public int getZenb () {
		return (this.zenb);
	}
	public void desestali() {
		if (this.zenb == 1) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c1.gif");
		}else if (this.zenb == 2) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c2.gif");
		}else if (this.zenb == 3) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c3.gif");
		}else if (this.zenb == 4) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c4.gif");
		}else if (this.zenb == 5) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c5.gif");
		}else if (this.zenb == 6) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c6.gif");
		}else if (this.zenb == 7) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c7.gif");
		}else if (this.zenb == 8) {
			TableroGUI.getTablero().aldatu(getErrenkada(), getZutabea(), "./src/irudiak/c8.gif");
		}
	}
}
