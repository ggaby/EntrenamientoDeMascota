package entities;

public class Tropicatchi extends Mascota{
	private int masaMuscular;
	
	public Tropicatchi() {
		super();
		this.masaMuscular = 5;
	}

	@Override
	public void avanzarHasta(int x, int y) {
		super.avanzarHasta(x, y);
		this.aumentarMasaMuscularEn(10);
	}
	
	private void aumentarMasaMuscularEn(int unidades) {
		this.masaMuscular += unidades;
	}
	
	@Override
	public boolean estasEnForma() {
		return (this.masaMuscular>90);
	}
}
