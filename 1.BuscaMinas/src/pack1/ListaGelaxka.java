package pack1;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class ListaGelaxka {
	
	ArrayList<Gelaxka[]> lista;
	int zutabea;
	int errenkada;
	int bombaKop;
	
	public ListaGelaxka(int pErrenkada, int pZutabea) {
		this.errenkada = pErrenkada;
		this.zutabea = pZutabea;	
		this.bombaKop = pZutabea * 1; // 1 zailtasuna da
		this.hasieratu(pErrenkada, pZutabea);
	}
	
	private void bonbakJarri () {
		int rZ, rE;
		for (int i = 0; i < bombaKop; i ++) {
			rE = ThreadLocalRandom.current().nextInt(0, errenkada);
			rZ = ThreadLocalRandom.current().nextInt(0, zutabea);
			if (this.badagoBeteta(rZ, rE)) {
				this.add(new GBomba(rE, rZ));	
			}else {
				i --;
			}
		}
		
	}

	public void add (Gelaxka pGel) {
		Gelaxka[] aux = this.lista.get(pGel.getErrenkada());
		aux[pGel.getZutabea()] = pGel;
	}
	private void hasieratu (int errenkada, int zutabea) {
		
		this.lista = new ArrayList<Gelaxka[]>();
		int i = 0;
		while (i < errenkada) {
			this.lista.add(new Gelaxka[zutabea]);
			i++;
		}
		
		this.bonbakJarri();
		
		//this.zenbakiakJarri();
	}
	private boolean badagoBeteta (int pZut, int pErr) {
		Gelaxka[] aux = this.lista.get(pErr);
		if (aux[pZut] != null) {
			return (false);
		}else {
			return (true);
		}
	}
	private void zenbakiakJarri () {
		
	}
}
