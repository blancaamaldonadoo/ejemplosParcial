package Parcial1;

import Excepciones.ExcApellido;
import Excepciones.ExcNombre;
import Excepciones.ExcNumero;

public class Contacto{

    private String nombre;
    private String apellido;
    private String numTelefono;

    public Contacto(String nombre, String apellido, String numTelefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numTelefono=numTelefono;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getNumTelefono(){
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono){
        this.numTelefono=numTelefono;
    }

    public String toString(){

		String texto="";
		texto+="Nombre: " + nombre;
		texto+="\nApellido: " + apellido;
		texto+="\nNúmero de teléfono: "+numTelefono;
        return texto;
	}
    
    public void pedirDatos(){
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce el nombre del contacto: ");
		try{
			String texto= sc.nextLine();
		}
		catch(ExcNombre e){
            System.out.println(e.getMessage());
        }
       
		System.out.println("Introduce el apellido del contacto: ");
        try{
		String texto= sc.nextLine();
        }
        catch(ExcApellido e){
            System.out.println(e.getMessage());
        }

		System.out.println("Introduce el número del contacto: ");
        try{
		String texto= sc.nextLine();
        }
        catch(ExcNumero e){
            System.out.println(e.getMessage());
        }
		sc.close();

	}

}



    