import java.util.Date;
public class Paciente extends Persona{
	public String ID;
	public Date aceptado; 
	public String prescripciones;
	public String alergias;
	
	public Historia enfermedad = new Historia();
	
	Paciente(){
	} 

	public String toStrings(){
		return super.toString() + "\nId " + this.ID + "\nAceptado: " + this.aceptado + "\nPrescripciones: " + this.prescripciones + "\nAlergias: " + this.alergias + "\nEnfermedad" + this.enfermedad;
	}

}