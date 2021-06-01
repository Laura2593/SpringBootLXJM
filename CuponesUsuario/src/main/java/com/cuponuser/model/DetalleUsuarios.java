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
@Table(name = "DetalleUsuarios")
public class DetalleUsuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleUsuarios;

	@Column(name = "IdUsuarios")
	private Integer IdUsuarios;
	@Column(name = "Descuento")
	private Double Descuento;
	@Column(name = "NoSerie")
	private String NoSerie;
	/**
	 * @param idDetalleUsuarios
	 * @param idUsuarios
	 * @param descuento
	 * @param noSerie
	 */
	public DetalleUsuarios(Integer idDetalleUsuarios, Integer idUsuarios, Double descuento, String noSerie) {
		super();
		this.idDetalleUsuarios = idDetalleUsuarios;
		IdUsuarios = idUsuarios;
		Descuento = descuento;
		NoSerie = noSerie;
	}
	/**
	 * 
	 */
	public DetalleUsuarios() {
		super();
	}
	/**
	 * @return the idDetalleUsuarios
	 */
	public Integer getIdDetalleUsuarios() {
		return idDetalleUsuarios;
	}
	/**
	 * @param idDetalleUsuarios the idDetalleUsuarios to set
	 */
	public void setIdDetalleUsuarios(Integer idDetalleUsuarios) {
		this.idDetalleUsuarios = idDetalleUsuarios;
	}
	/**
	 * @return the idUsuarios
	 */
	public Integer getIdUsuarios() {
		return IdUsuarios;
	}
	/**
	 * @param idUsuarios the idUsuarios to set
	 */
	public void setIdUsuarios(Integer idUsuarios) {
		IdUsuarios = idUsuarios;
	}
	/**
	 * @return the descuento
	 */
	public Double getDescuento() {
		return Descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(Double descuento) {
		Descuento = descuento;
	}
	/**
	 * @return the noSerie
	 */
	public String getNoSerie() {
		return NoSerie;
	}
	/**
	 * @param noSerie the noSerie to set
	 */
	public void setNoSerie(String noSerie) {
		NoSerie = noSerie;
	}
	@Override
	public String toString() {
		return "DetalleUsuarios [idDetalleUsuarios=" + idDetalleUsuarios + ", IdUsuarios=" + IdUsuarios + ", Descuento="
				+ Descuento + ", NoSerie=" + NoSerie + "]";
	}
	
	
	
}
