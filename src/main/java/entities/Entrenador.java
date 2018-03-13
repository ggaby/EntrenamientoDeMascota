package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Entrenador {
	private String nombre;
	private int edad;
	private int posicionX;
	private int posicionY;
	private List<Mascota> mascotas;
	
	public Entrenador() {
		super();
		this.mascotas = new ArrayList<>();
		this.posicionX = 0;
		this.posicionY = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void agregar(Mascota unaMascota) {
		mascotas.add(unaMascota);
	}
	
	public void quitar(Mascota unaMascota) {
		mascotas.remove(unaMascota);
	}
	
	public void avanzarHasta(int unPuntoX, int unPuntoY) {
		this.posicionX += unPuntoX;
		this.posicionY += unPuntoY;
	}
	
	public void daleRespiroALosHambrientos() {
		List<Mascota> mascotasConHambre = mascotas.stream().filter(unaMascota -> unaMascota.tenesHambre()).collect(Collectors.toList());
		mascotasConHambre.forEach(unaMascota -> unaMascota.descansar());
	}
	
	public void entrenaMascotasHasta(int unPuntoX, int unPuntoY) {
		for(Mascota unaMascota : mascotas) {
			unaMascota.avanzarHasta(unPuntoX, unPuntoY);
		}
		avanzarHasta(unPuntoX, unPuntoY);
	}
}
