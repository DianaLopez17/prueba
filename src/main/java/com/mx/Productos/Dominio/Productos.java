package com.mx.Productos.Dominio;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="PRODUCTOS_TRIGGER_2025")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Data 
public class Productos {

	@Id
	int id;
	String nombre;
	int cantidad;
	
	@Column(name="PRECIO_UNITARIO", columnDefinition ="NUMBER") //sirve si cambiamos el tipo de dato
	String precio_unitario;
	
	@Column(name="FECHA_CADUCIDAD", columnDefinition = "DATE")
	@JsonFormat(pattern ="dd/MM/yyyy", timezone="America/Mexico_City")
	Date fecha_caducidad;
	
	String descripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(String precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
