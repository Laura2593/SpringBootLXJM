package com.cuponuser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LX
 *
 */
@Entity
@Table(name="cupones")
public class Cupones {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer NoSerie;
	private String Restaurante;
	private String Rfc;
	private String Descripcion;
	private String Vigencia;
	/**
	 * @param noSerie
	 * @param restaurante
	 * @param rfc
	 * @param descripcion
	 * @param vigencia
	 */
	public Cupones(Integer noSerie, String restaurante, String rfc, String descripcion, String vigencia) {
		super();
		NoSerie = noSerie;
		Restaurante = restaurante;
		Rfc = rfc;
		Descripcion = descripcion;
		Vigencia = vigencia;
	}
	/**
	 * 
	 */
	public Cupones() {
		super();
	}
	/**
	 * @return the noSerie
	 */
	public Integer getNoSerie() {
		return NoSerie;
	}
	/**
	 * @param noSerie the noSerie to set
	 */
	public void setNoSerie(Integer noSerie) {
		NoSerie = noSerie;
	}
	/**
	 * @return the restaurante
	 */
	public String getRestaurante() {
		return Restaurante;
	}
	/**
	 * @param restaurante the restaurante to set
	 */
	public void setRestaurante(String restaurante) {
		Restaurante = restaurante;
	}
	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return Rfc;
	}
	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		Rfc = rfc;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	/**
	 * @return the vigencia
	 */
	public String getVigencia() {
		return Vigencia;
	}
	/**
	 * @param vigencia the vigencia to set
	 */
	public void setVigencia(String vigencia) {
		Vigencia = vigencia;
	}
	@Override
	public String toString() {
		return "Cupones [NoSerie=" + NoSerie + ", Restaurante=" + Restaurante + ", Rfc=" + Rfc + ", Descripcion="
				+ Descripcion + ", Vigencia=" + Vigencia + "]";
	}
	
	
	

}
