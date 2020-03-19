package pack1;

import kontroladorea.GDesestalita;
import kontroladorea.GEstalita;
import kontroladorea.GelaxkaEgoera;

public abstract class Gelaxka {
	
	private int zutabea;
	private int errenkada;
	private GelaxkaEgoera egoera;
	
	public Gelaxka (int pZutabea, int pErrenkada) {
		this.zutabea = pZutabea;
		this.errenkada = pErrenkada;
		this.egoera = new GEstalita(errenkada, zutabea);
	}
	
	public void egoeraAldatu () {
		this.egoera = new GDesestalita(errenkada, zutabea);
	}
	
	public abstract  void desestali ();
	
	public int getErrenkada () {
		return this.errenkada;
	}
	
	public int getZutabea () {
		return this.zutabea;
	}
	public GelaxkaEgoera getEgoera () {
		return (this.egoera);
	}
}
