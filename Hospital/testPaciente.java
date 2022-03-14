import java.util.Date;
public class testPaciente{
	public static void main(String[] args){
		
		Paciente Alexis = new Paciente();
		Alexis.nombre = "Jose Alexis";
		Alexis.apellidos = "Martinez Barcenas";
		Alexis.fechaNacimiento = new Date();
		Alexis.telefono = "4181571479";
		Alexis.direccion = "Colonia privada";
		Alexis.genero = new Genero("Modelo Osi");
		Alexis.ID = "ELPEPE";
		Alexis.aceptado = new Date();
		Alexis.prescripciones = "Una Gotica Culon*";
		Alexis.alergias = "fructuosa";

		Alexis.enfermedad = new Historia("EteSech","Sindrome de Up","Lo contrario al sindrome de down", new Date());

		System.out.println(Alexis);


	}
}