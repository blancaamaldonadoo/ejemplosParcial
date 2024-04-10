package Parcial1;
import java.util.Scanner;

import Excepciones.ExcNombre;
import Excepciones.ExcNumero;

public class ContactoEmergencia extends Contacto{

	private String relacion;

	public ContactoEmergencia(String nombre, String apellido, String numTelefono, String relacion){
		super(nombre, apellido, numTelefono);
		this.relacion=relacion;
	}

	
	public String getRelacion(){
		return relacion;
	} 

	public void setRelacion(String relacion){
		this.relacion=relacion;
	}

	public String toString(){

		String texto="";
		texto+= super.toString();
        texto+="\nRelación: "+relacion;
        return texto;
		
	}

    public void pedirdatos(){
        super.pedirDatos();
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la relación con el contacto: ");
        try{
            String texto= sc.nextLine();
        }
        catch(ExcNombre e){
            System.out.println("La relacion no puede estar vacía");
        }
    }

    public void alerta() throws ExcNumero, ExcApellido, ExcNombre{
        if(getNumTelefono().length()!=9){
            throw new ExcNumero("El número de teléfono debe tener 9 dígitos");
        }

        if(getApellido().length()==0){
            throw new ExcApellido("El apellido no puede estar vacío");
        }

        if(getNombre().length()==0){
            throw new ExcNombre("El nombre no puede estar vacío");
        }
    }
}