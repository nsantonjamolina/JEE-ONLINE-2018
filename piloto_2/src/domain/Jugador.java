package domain;

// Generated 06-oct-2010 17:23:23 by Hibernate Tools 3.2.0.b9

import java.util.Date;

/**
 * Jugador generated by hbm2java
 */
public class Jugador implements java.io.Serializable {

	private Integer idJugador;
	private Equipo equipo;
	private String nombre;
	private Date fechaNacimiento;
	private String direccion;

	public Jugador() {
	}

	public Jugador(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public Jugador(Integer idJugador, Equipo equipo, String nombre,
			Date fechaNacimiento, String direccion) {
		this.idJugador = idJugador;
		this.equipo = equipo;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
	}

	public Integer getIdJugador() {
		return this.idJugador;
	}

	public void setIdJugador(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
