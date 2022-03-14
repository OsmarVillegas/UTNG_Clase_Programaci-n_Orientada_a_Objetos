/*
 * Descripción: Clase que presenta los generos que existe
 * Autor: Osmar Israel Villega Martínez
 * Fecha: 24 de febrero 2022
*/
public class Genero{
	public String nombre;

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String pNombre){


		switch(pNombre){
			case "masculino":
			case "femenino":
			case "otro":
				this.nombre = pNombre;
			default:
				System.out.println("Error");
		}

		this.nombre = pNombre;
	}

    /*
	// Este es un constructor
	Genero(){
		System.out.println("\n");
		System.out.println("Construyendo un objeto genero");

	}

	Genero(String pNombre){
		this.nombre = pNombre;
	}

	public String toString(){
		return "Genero: " + this.nombre;
	}
	*/
}