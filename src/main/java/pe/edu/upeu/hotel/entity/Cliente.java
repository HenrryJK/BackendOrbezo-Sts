package pe.edu.upeu.hotel.entity;

public class Cliente {
private int idcliente;
private String nombre;
private String dni;
private String fecha_naci;
private String sexo;
private String observacion;
public Cliente() {
	super();
}
public Cliente(int idcliente, String nombre, String dni, String fecha_naci, String sexo, String observacion) {
	super();
	this.idcliente = idcliente;
	this.nombre = nombre;
	this.dni = dni;
	this.fecha_naci = fecha_naci;
	this.sexo = sexo;
	this.observacion = observacion;
}
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getFecha_naci() {
	return fecha_naci;
}
public void setFecha_naci(String fecha_naci) {
	this.fecha_naci = fecha_naci;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getObservacion() {
	return observacion;
}
public void setObservacion(String observacion) {
	this.observacion = observacion;
}
}
