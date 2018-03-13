package entities;

public class Cansada implements EstadoMascota {

	public void avanzarHasta(int x, int y, Mascota unaMascota) {
		unaMascota.disminuirAnimoEn(20);
	}

	public void descansar(Mascota unaMascota) {
		unaMascota.aumentarEnergiaEn(20);
		if(recuperoEnergia(unaMascota)) {
			cambiarDeEstadoA(unaMascota);
		}
	}
	
	private boolean recuperoEnergia(Mascota unaMascota) {
		return (unaMascota.getEnergia()>80);
	}
	
	public void cambiarDeEstadoA(Mascota unaMascota) {
		unaMascota.cambiarEstado(new Aburrida());
	}

}
