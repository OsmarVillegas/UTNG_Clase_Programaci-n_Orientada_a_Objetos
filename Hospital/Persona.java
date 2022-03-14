/*
 * Descripcion: Clase que representa todos los pacientes de los hospitales 
 * Autor: Osmar Israel Villegas Martínez 
 * Fecha: 24 de febrero 2022
*/
import java.util.Date;
public class Persona{
	public String nombre;
	public String apellidos;
	public Date fechaNacimiento;
	public String telefono;
	public String direccion; 

	public Genero genero = new Genero();

	// Construnctor defaul inicializa una variable
	Persona(){

	}

	Persona(String Pnombre){
		this.nombre = Pnombre;
	}

	public String toString(){
		return "Nombre: " + this.nombre + "\nApellidos: "+ this.apellidos 
		+ "\nFecha de nacimiento " + this.fechaNacimiento + "\n" + genero + "\nTelefono " 
		+ this.telefono + "\nDireccion: " + direccion;

	}
}