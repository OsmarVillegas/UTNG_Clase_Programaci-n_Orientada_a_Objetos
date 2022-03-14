/*
 * Descripción: Clase que testea la clase Persona
 * Autor: Osmar Israel Villega Martínez
 * Fecha: 24 de febrero 2022
*/
import java.util.Date;
public class testPersona{
	public static void main(String[] args){
		Paciente Alexis = new Paciente();
		Alexis.nombre = "Jose Alexis";
		Alexis.apellidos = "Martinez Barcenas";
		Alexis.fechaNacimiento = new Date();
		Alexis.telefono = "4181571479";
		Alexis.direccion = "Colonia privada";
		Alexis.genero = new Genero("Modelo Osi");

		System.out.println("\n");
		System.out.println(Alexis);
	}
}