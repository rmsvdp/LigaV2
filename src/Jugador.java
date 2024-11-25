
public class Jugador {

	
	private String nombre;
	private Puesto posicion;
	private int numero;
	private int edad;
	private int golAVG = 0;
	private boolean activo;
	
	public Jugador() {
		this.numero = -1;
		this.activo=true;
	}

	public Jugador (String nombre, Puesto posicion, int numero, int edad, int golAVG, boolean activo) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.numero = numero;
		this.edad = edad;
		this.golAVG = golAVG;
		this.activo=activo;
	}
	
	public int getNumero() 							{	return this.numero;	}
	public void setNumero(int numero) 				{	this.numero = numero;}
	public Puesto getPosicion()						{	return this.posicion;}
	public void setPosicion(Puesto posicion)		{	this.posicion=posicion;}
	public int getEdad() 							{	return this.edad;	}
	public void setEdad(int edad) 					{	this.edad = edad;	}
	public String getNombre()						{	return nombre;      }
	public void setNombre(String nombre)			{	this.nombre=nombre;	}      
	public int getGolAVG()							{	return this.golAVG;	}
	public void setGolAVG(int golAVG)				{	this.golAVG = golAVG;}
	public boolean isActivo()						{	return this.activo;	}
	public void setActivo(boolean activo)			{	this.activo=activo;	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numero=" + numero + ", edad=" + edad
				+ ", golAVG=" + golAVG + ", activo=" + activo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // Jugador
