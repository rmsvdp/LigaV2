
public class Entrenador {

		private String nombre;
		private int edad;
		private int Numtitulos;       	  			     			    
  	   
	
	public Entrenador() {}
	public Entrenador (String nombre, int edad, int Numtitulos) {
		this.nombre = nombre;	
		this.edad = edad;
		this.Numtitulos = Numtitulos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumtitulos() {
		return Numtitulos;
	}
	public void setNumtitulos(int numtitulos) {
		Numtitulos = numtitulos;
	}
	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", edad=" + edad + ", Numtitulos=" + Numtitulos + "]";
	}


} //end class
