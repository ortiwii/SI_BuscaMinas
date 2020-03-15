package pack1;
public class FactoryGelaxka {
	
	private static FactoryGelaxka nFact = null;
	
	private FactoryGelaxka () {	}
	
	public static FactoryGelaxka getFact () {
		if (nFact == null) {
			nFact = new FactoryGelaxka();
		}
		return nFact;
	}
	
	public Gelaxka gelaxkaSortu (int mota, int pZutabea, int pErrenkada) { //0. mota => hutsik; 1. mota => Zenbakiarekin; 2. mota => bonbarekin
		switch (mota) {
		case 0:
			return (Gelaxka(new GHutsa(pZutabea, pErrenkada)));
			
		}
	}
	

}
