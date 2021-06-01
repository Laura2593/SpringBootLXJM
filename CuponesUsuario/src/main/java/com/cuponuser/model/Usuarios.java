/**
 * 
 */
package com.cuponuser.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LX
 *
 */
@Entity
@Table(name = "usuarios",uniqueConstraints = {@UniqueConstraint(name="Correo", columnNames = {"Correo"})})
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;

	@Column(name = "Nombre")
	private String Nombre;
	@Column(name = "Apellidos")
	private String Apellidos;
	@Column(name = "Correo")
	private String Correo;
	@Column(name = "Password")
	private String Password;
	
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="idReferido")
	private UsuarioRef usuarioRef;
	
	private String NombreReferido;

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return Apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public Usuarios() {
		super();
	}

	/**
	 * @param idUsuario
	 * @param nombre
	 * @param correo
	 * @param contraseña
	 * @param idReferido
	 * @param nombreReferido
	 */
	public Usuarios(Integer idUsuario, String nombre, String apellidos, String correo, String password,
			Integer idReferido, String nombreReferido) {
		super();
		this.idUsuario = idUsuario;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		Password = password;
		NombreReferido = nombreReferido;
	}

	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return Correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}


	/**
	 * @return the nombreReferido
	 */
	public String getNombreReferido() {
		return NombreReferido;
	}

	/**
	 * @param nombreReferido the nombreReferido to set
	 */
	public void setNombreReferido(String nombreReferido) {
		NombreReferido = nombreReferido;
	}

	/**
	 * @return the usuarioRef
	 */
	public UsuarioRef getUsuarioRef() {
		return usuarioRef;
	}

	/**
	 * @param usuarioRef the usuarioRef to set
	 */
	public void setUsuarioRef(UsuarioRef usuarioRef) {
		this.usuarioRef = usuarioRef;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", Nombre=" + Nombre + ", Apellidos=" + "Apellidos, Correo="
				+ Correo + ", Password=" + Password +  ", NombreReferido="
				+ NombreReferido + "]";
	}

}
