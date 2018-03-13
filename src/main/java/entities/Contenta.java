package entities;

public class Contenta implements EstadoMascota {

	public void avanzarHasta(int x, int y, Mascota unaMascota) {
		unaMascota.disminuirEnergiaEn(y);
		unaMascota.aumentarAnimoEn(2*(x+y));
		if(estaDebilitada(unaMascota)) {
			cambiarDeEstadoA(unaMascota);
		}
	}
	
	private boolean estaDebilitada(Mascota unaMascota) {
		return (unaMascota.getEnergia()<40);
	}
	
	public void cambiarDeEstadoA(Mascota unaMascota) {
		unaMascota.cambiarEstado(new Cansada());
	}
	
	public void descansar(Mascota unaMascota) {
		unaMascota.aumentarEnergiaEn(5);
	}

}
