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
		int j;
		while (i < errenkada) {
			this.lista.add(i, new Gelaxka[zutabea]);
			j = 0;
			while (j < zutabea) {
				this.lista.get(i)[j] = new GHutsa (j,i);
				j ++;
			}
			i++;
		}
		this.bonbakJarri();
		this.zenbakiakJarri();
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
		int e = 0;
		int z = 0;
		while (e < this.errenkada) {
			z = 0;
			while (z < this.zutabea) {
				if (lista.get(e)[z] != null && !(lista.get(e)[z] instanceof GBomba)) {
					int bKop = this.zenbatu(e, z);
					if (z != 0) {
						this.lista.get(e)[z] = new GZenbakia(z, e, bKop);
					}else {
						this.lista.get(e)[z] = new GHutsa(z, e);
					}
				}
			
				z ++;
			}
			e ++;
		}
	}
	private int zenbatu (int e, int z) {
		
		int emaitza = 0;
		
		//e-1, z
		if (e != 0 && this.lista.get(e-1)[z] instanceof GBomba) {
			emaitza ++;
		}
		//e-1, z-1	
		if (e != 0 && z != 0 && this.lista.get(e-1)[z-1] instanceof GBomba) {
			emaitza ++;
		}
		//e, z-1
		if (z != 0 && this.lista.get(e)[z-1] instanceof GBomba) {
			emaitza ++;
		}
		//e+1, z-1
		if (z!=0 && this.lista.get(e+1)[z-1] instanceof GBomba) {
			emaitza ++;
		}
		//e+1, z
		if (this.lista.get(e+1)[z] instanceof GBomba) {
			emaitza ++;
		}
		//e+1, z+1
		if (this.lista.get(e+1)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		//e, z+1
		if (this.lista.get(e)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		//e-1, z+1
		if (e!=0 && this.lista.get(e-1)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		return emaitza;
		
	}
}
