package pack1;
public abstract class Gelaxka {
	
	private int zutabea;
	private int errenkada;
	private GelaxkaEgoera egoera;
	
	public Gelaxka (int pZutabea, int pErrenkada) {
		this.zutabea = pZutabea;
		this.errenkada = pErrenkada;
		this.egoera = new GEstalita();
	}
	
	public void egoeraAldatu () {
		this.egoera = new GDesestalita();
	}
	
	public abstract  void desestali ();
	
	public int getErrenkada () {
		return this.errenkada;
	}
	
	public int getZutabea () {
		return this.zutabea;
	}
}
