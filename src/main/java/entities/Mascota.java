package entities;

public abstract class Mascota {
	private int energia;
	private int animo;
	private int posicionEnX;
	private int posicionEnY;
	private EstadoMascota estado;
	
	protected Mascota() {
		super();
		this.animo = 100;
		this.energia = 100;
		this.posicionEnX = 0;
		this.posicionEnY = 0;
	}
	
	public int getEnergia() {
		return energia;
	}

	public int getAnimo() {
		return animo;
	}

	public int getPosicionEnX() {
		return posicionEnX;
	}

	public int getPosicionEnY() {
		return posicionEnY;
	}
	
	public EstadoMascota getEstado() {
		return estado;
	}

	public void disminuirEnergiaEn(int unidades) {
		this.energia -= unidades;
	}
	
	public void aumentarEnergiaEn(int unidades) {
		this.energia += unidades; 
	}
	
	public void aumentarAnimoEn(int unidades) {
		this.animo += unidades;
	}
	
	public void disminuirAnimoEn(int unidades) {
		this.animo -= unidades;
	}
	
	public void avanzarPosicion(int unidades, int unaPosicion) {
		unaPosicion+=unidades;
	}
	
	public void retrocederPosicion(int unidades, int unaPosicion) {
		unaPosicion-=unidades;
	}
	
	public void cambiarEstado(EstadoMascota unEstado) {
		this.estado = unEstado;
	}
	
	public void descansar() {
		this.estado.descansar(this);
	}
	
	public void avanzarHasta(int x, int y) {
		avanzarPosicion(x, getPosicionEnX());
		avanzarPosicion(y, getPosicionEnY());
		getEstado().avanzarHasta(x, y, this);
	}
	
	public boolean tenesHambre() {
		return true;
	}
	
	public boolean estasEnForma() {
		return false;
	}
}
