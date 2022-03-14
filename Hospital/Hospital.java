/*
 * Descripción: Clase que representa todos los hospitales de GTO
 * Autor: Osmar Israel Villega Martínez
 * Fecha: 24 de febrero 2022
*/
public class Hospital{
	public String nombre;
	public String direccion;
	public String telefono;

	Hospital(){
		System.out.println("Construyendo Hospital");
	}

	Hospital(String pNombre, String pDireccion){
			this.nombre = pNombre;
			this.direccion = pDireccion;
			this.telefono = "No conocida";
	}

	public String toString(){
		return "Nombre: " + this.nombre + "\nDireccion: " + this.direccion + "\nTelefono: " + this.telefono;

	}
}