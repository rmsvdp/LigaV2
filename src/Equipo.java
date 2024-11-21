
public class Equipo {

	public final int TOT_JUGADORES=20;
	public final int TOT_TECNICOS=2;
	private String nombre;     			
	private String estadio; 
	public Jugador[] 	Jugadores; 	
	private Entrenador[] Entrenadores ;
	/*
	public Jugador[] 	Jugadores 		= new Jugador [TOT_JUGADORES];
	public Entrenador[] Entrenadores 	= new Entrenador [TOT_TECNICOS];
	*/
		
	public Equipo() {
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenadores = new Entrenador[TOT_TECNICOS];
	}

	public Equipo(String nombre, String estadio) {
		
		this.nombre = nombre;
		this.estadio= estadio;
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenadores = new Entrenador[TOT_TECNICOS];
		
	}

	public Equipo(String nombre, String estadio, Jugador[] jugadores, Entrenador[] entrenadores) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.Jugadores = jugadores;
		this.Entrenadores = entrenadores;
	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	public String getEstadio() {		return estadio;	}
	public void setEstadio(String estadio) {		this.estadio = estadio;	}
	public Jugador[] getJugadores() {		return Jugadores;	}
	public void setJugadores(Jugador[] jugadores) {		Jugadores = jugadores;	}
	public Entrenador[] getEntrenadores() {		return Entrenadores;	}
	public void setEntrenadores(Entrenador[] entrenadores) {		Entrenadores = entrenadores;}

	public void asignaEntrenador(int posicion,Entrenador e) {		
		this.Entrenadores[posicion]=e;
	}

	
	
	
	
	
}
