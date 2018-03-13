package entities;

public class Aburrida implements EstadoMascota {

	public void avanzarHasta(int x, int y, Mascota unaMascota) {
		unaMascota.disminuirEnergiaEn(x);
		unaMascota.aumentarAnimoEn(x+y);
		if(estaConAnimos(unaMascota)) {
			cambiarDeEstadoA(unaMascota);
		}
	}
	
	public void cambiarDeEstadoA(Mascota unaMascota) {
		unaMascota.cambiarEstado(new Contenta());
	}
	
	private boolean estaConAnimos(Mascota unaMascota) {
		return (unaMascota.getAnimo()>15);
	}
	
	public void descansar(Mascota unaMascota) {
		unaMascota.aumentarEnergiaEn(2);
	}

}
