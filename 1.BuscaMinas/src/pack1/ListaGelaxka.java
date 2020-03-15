package pack1;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class ListaGelaxka {
	
	ArrayList<ArrayList<Gelaxka>> lista;
	int zutabea;
	int errenkada;
	int bombaKop;
	
	public ListaGelaxka(int pErrenkada, int pZutabea) {
		this.errenkada = pErrenkada;
		this.zutabea = pZutabea;	
		this.bombaKop = pZutabea * 1; // 1 zailtasuna da
	}
	
	private void bonbakJarri () {
		int rZ, rE;
		for (int i = 0; i < bombaKop; i ++) {
			rE = ThreadLocalRandom.current().nextInt(0, errenkada);
			rZ = ThreadLocalRandom.current().nextInt(0, zutabea);
			// sortu
		}
		
	}
	
	public void add (Gelaxka pGel) {
		ArrayList<Gelaxka> aux = lista.get(pGel.getErrenkada());
		aux.add(pGel.getZutabea(), pGel);
	}
	public void hasieratu (int errenkada, int zutabea) {
		
		int i = 0;
		int j;
		while (i < errenkada) {
			ArrayList<Gelaxka> lista2 = new ArrayList<Gelaxka>();
			j = 0;
			while (j < zutabea) {
//				lista2.add()
				j ++;
			}
			i++;
		}
	}

}
