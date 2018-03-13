package entities;

public class Mametchi extends Mascota{
	private int hambre;
	
	public Mametchi() {
		super();
		this.hambre = 0;
	}
	
	@Override
	public void avanzarHasta(int x, int y) {
		super.avanzarHasta(x, y);
		aumentarHambreEn(5);
	}
		
	private void aumentarHambreEn(int unidades) {
		this.hambre += unidades;
	}
	
	@Override
	public boolean tenesHambre() {
		return (this.hambre>25);
	}
}
