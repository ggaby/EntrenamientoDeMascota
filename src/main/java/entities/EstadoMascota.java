package entities;

public interface EstadoMascota {
	public void avanzarHasta(int x, int y, Mascota unaMascota);
	public void descansar(Mascota unaMascota);
	public void cambiarDeEstadoA(Mascota unaMascota);
}
