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
	
	public Gelaxka gelaxkaSortu (int mota, int pZutabea, int pErrenkada, int pZenbat) { //0. mota => hutsik; 1. mota => Zenbakiarekin; 2. mota => bonbarekin
		if (mota == 0) {
			return (new GHutsa(pZutabea, pErrenkada));
		}else if (mota == 1) {
			return (new GZenbakia(pZutabea, pErrenkada, pZenbat));
		}else if (mota == 2) {
			return (new GBomba(pZutabea, pErrenkada));
		}else {
			return (null);
		}
	}
	

}
