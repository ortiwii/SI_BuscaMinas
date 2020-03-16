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
		int i = 0;
		while (i < bombaKop) {
			rE = ThreadLocalRandom.current().nextInt(0, errenkada);
			rZ = ThreadLocalRandom.current().nextInt(0, zutabea);
			if (!this.badagoBeteta(rZ, rE)) {
				this.add(new GBomba(rE, rZ));
				i ++;
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
		int e = 0;
		int z;
		while (e < errenkada) {
			this.lista.add(e, new Gelaxka[zutabea]);
			z = 0;
			while (z < zutabea) {
				this.lista.get(e)[z] = FactoryGelaxka.getFact().gelaxkaSortu(0, z,e, 0);
				z ++;
			}
			e++;
		}
		this.bonbakJarri();
		this.zenbakiakJarri();
	}
	private boolean badagoBeteta (int pZut, int pErr) {
		Gelaxka[] aux = this.lista.get(pErr);
		if (aux[pZut] != null && !(aux[pZut] instanceof GBomba)) {
			return (false);
		}else {
			return (true);
		}
	}
	private void zenbakiakJarri () {
		int e = 0;
		int z = 0;
		FactoryGelaxka gelF = FactoryGelaxka.getFact();
		while (e < this.errenkada) {
			z = 0;
			while (z < this.zutabea) {
				if (lista.get(e)[z] != null && !(lista.get(e)[z] instanceof GBomba)) {
					int bKop = this.zenbatu(e, z);
					if (z != 0) {
						this.lista.get(e)[z] = gelF.gelaxkaSortu(1, z, e, bKop);
					}else {
						this.lista.get(e)[z] = gelF.gelaxkaSortu(0, z, e, 0);
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
		if (e != this.errenkada-1 && z!=0 && this.lista.get(e+1)[z-1] instanceof GBomba) {
			emaitza ++;
		}
		//e+1, z
		if (e != this.errenkada-1 && this.lista.get(e+1)[z] instanceof GBomba) {
			emaitza ++;
		}
		//e+1, z+1
		if (e != this.errenkada-1 && z != this.zutabea-1 && this.lista.get(e+1)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		//e, z+1
		if (z != this.zutabea-1 && this.lista.get(e)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		//e-1, z+1
		if (z != this.zutabea-1 && e!=0 && this.lista.get(e-1)[z+1] instanceof GBomba) {
			emaitza ++;
		}
		return emaitza;
		
	}
	//Soilik probatzeko
	public void inprimatu () {
		int z = 0, e = 0;
		while (e < this.errenkada) {
			z = 0;
			while (z < this.zutabea) {
				if (this.lista.get(e)[z] instanceof GBomba) {
					System.out.print("[]");
				}else if (this.lista.get(e)[z] instanceof GZenbakia) {
					System.out.print(((GZenbakia)this.lista.get(e)[z]).getZenb()+ " ");
				}else {
					System.out.print("0 ");
				}
				System.out.print(" ");
				z ++;
			}
			System.out.println("");
			e ++;
		}
	}
}
