import java.util.Date;
public class Historia{
	public String IdEnfermedad;
	public String nombre;
	public String descripcion;
	public Date registro;

	Historia(String PId, String nom, String des, Date reg){
		IdEnfermedad = PId;
		nombre = nom;
		descripcion = des;
		registro = reg;

	}

	public String toString(){
		return "ID Enfermedad: " + IdEnfermedad + "\nNombre" + nombre + "\nDescripcion: " + descripcion + "\nRegistro: " + registro;
	};
}