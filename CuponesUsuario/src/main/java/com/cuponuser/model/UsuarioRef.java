/**
 * 
 */
package com.cuponuser.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author LX
 *
 */
@Entity
@Table(name="usuariosRef")
public class UsuarioRef {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idReferido;
	
	private String Nombre;
	private String ApellidoP;
	private String ApellidoM;
	
	@OneToMany(mappedBy="usuarioRef", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Usuarios> usuariosList;
	
	
	
	public UsuarioRef() {
		super();
	}


	public UsuarioRef(Integer idReferido, String nombre, String apellidoP, String apellidoM) {
		super();
		this.idReferido = idReferido;
		Nombre = nombre;
		ApellidoP = apellidoP;
		ApellidoM = apellidoM;
	}
	
	
	public Integer getIdReferido() {
		return idReferido;
	}
	public void setIdReferido(Integer idReferido) {
		this.idReferido = idReferido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidoP() {
		return ApellidoP;
	}
	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}
	public String getApellidoM() {
		return ApellidoM;
	}
	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}



	/**
	 * @return the usuariosList
	 */
	public List<Usuarios> getUsuariosList() {
		return usuariosList;
	}


	/**
	 * @param usuariosList the usuariosList to set
	 */
	public void setUsuariosList(List<Usuarios> usuariosList) {
		this.usuariosList = usuariosList;
	}


	@Override
	public String toString() {
		return "UsuarioRef [idReferido=" + idReferido + ", Nombre=" + Nombre + ", ApellidoP=" + ApellidoP
				+ ", ApellidoM=" + ApellidoM + "]";
	}

}
