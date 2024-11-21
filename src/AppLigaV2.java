
public class AppLigaV2 {

	public AppLigaV2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//--------------------- JUGADORES -----------------------------------------------------		
		Jugador j1 = new Jugador();		
		j1.setNombre("Johan Cruiff");
		j1.setEdad(25);
		j1.setPosicion(Puesto.DELANTERO);
		j1.setNumero(11);
		// David Carrasco
		Jugador j2 = new Jugador("Luis Aragones",Puesto.DELANTERO,9,34,0,true);
		Jugador j3 = new Jugador("Isi palazon", Puesto.DELANTERO, 7 , 29, 0, true);
		// Nicolás Magallanes	
		Jugador j20 = new Jugador ("Lionel Messi", Puesto.DELANTERO,10,37,848,true);
		Jugador j30 = new Jugador ("Tierry Henry", Puesto.DELANTERO,11,43,608,false);
		Jugador j40 = new Jugador ("Samuel Eto'o", Puesto.DELANTERO,9,47,421,false);
		Jugador j50 = new Jugador ("Andres Iniesta", Puesto.CENTRAL,8,47,127,false);
		Jugador j60 = new Jugador ("Xavi Hernandez", Puesto.CENTRAL,6,49,184,false);
		Jugador j70 = new Jugador ("Sergio Busquets", Puesto.CENTRAL,5,39,104,true);
		Jugador j80 = new Jugador ("Dani Alves", Puesto.DEFENSA,2,47,311,false);
		Jugador j90 = new Jugador ("Gerard Pique", Puesto.DEFENSA,3,37,81,false);		
		// Noelia
		Jugador j4 = new Jugador ("Lamine Yamal", Puesto.DELANTERO, 19, 17,0, true );
		Jugador j51= new Jugador ("Ferran Torres", Puesto.DELANTERO, 7, 24,0, true );
		// Manuel		
		Jugador j52= new Jugador("radamel falcao",Puesto.DELANTERO,9,38,310,true);				
		// Nicolás Pezo
		Jugador j42 = new Jugador("Diego Maradona",Puesto.DELANTERO,10,60,159,false);	
		Jugador j5 =new Jugador ("Ronaldo de Assis Moreira",Puesto.CENTRAL,21,44,266,false);		
		// Roberto Lukacs	
		Jugador j33 = new Jugador("viktor gyokeres", Puesto.DELANTERO, 20 , 11, 0, true);	
		// Luis Enrique
		Jugador j35 = new Jugador("Kylian Mbappé",Puesto.DELANTERO,9,25,8,true);
		// Víctor Vidales	
		Jugador j34 = new Jugador("Joao Cozzarelli",Puesto.DELANTERO,11,21,3,true);
		Jugador j44 = new Jugador("Nickolas Magallanes",Puesto.DEFENSA,4,20,0,true);
		Jugador j54 = new Jugador("Nicolás Pezo",Puesto.CENTRAL,8,18,0,true);
		Jugador j64 = new Jugador("David Carrasco",Puesto.DELANTERO,10,17,1,true);
		Jugador j74 = new Jugador("Daniel Casado",Puesto.CENTRAL,6,29,0,true);
		Jugador j84 = new Jugador("Alba Martinez",Puesto.DEFENSA,3,21,0,true);
		Jugador j94 = new Jugador ("Ignacio Galvez",Puesto.CENTRAL,7,38,0,true);
		Jugador j10 = new Jugador ("Alejandro",Puesto.DELANTERO,12,25,2,true);		
		// Joao	
		Jugador jm1= new Jugador("Rafael Leao",Puesto.DELANTERO,10,24,10,true);
		Jugador jm2 = new Jugador("Mike Maignan", Puesto.PORTERO, 16, 27, 0, false);
		Jugador jm3 = new Jugador("Theo Hernández", Puesto.DEFENSA, 19, 26, 5, true);
		Jugador jm4 = new Jugador("Sandro Tonali", Puesto.CENTRAL, 8, 23, 3, true);		
		//--------------------- ENTRENADORES -----------------------------------------------------		
		Entrenador E2 = new Entrenador();
		E2.setEdad(66);		
		E2.setNombre("Ricardo Alberto Gareca Nardi");		
		E2.setNumtitulos(10);		
		Entrenador en2 = new Entrenador("Iñigo Perez" , 36, 0);	
		Entrenador e2 = new Entrenador ("Pep Guardiola",53, 39);
		Entrenador en1=new Entrenador("jose pekerman",75,8);		
		Entrenador em1 = new Entrenador("Stefano Pioli", 58, 1);
		Entrenador e13 = new Entrenador("Ramón Merchan",55,0);		
		Entrenador n2 = new Entrenador("Carlo Ancelotti",45,4);
		Entrenador e12 = new Entrenador("Rúben Amorim" , 36, 0);
//--------------------- EQUIPOS -----------------------------------------------------
		Equipo team12 = new Equipo ("Sporting de Portugal", "San Siro");
		Equipo e1 = new Equipo(); //"FC Barcelona","Nou Camp");
		e1.setNombre("FC Barcelona");
		e1.setEstadio("Nou Camp");
		Equipo team1 = new Equipo ("Rayo Vallecano", "Estadio de Vallecas");
		// Angie
		Equipo e7 = new Equipo("Atlético de Madrid", "Riyadh Air Metropolitano");	
		// Guillermo
		Equipo eq3 = new Equipo();
		eq3.setNombre("Villarreal");
		eq3.setEstadio("La Cerámica");
		// Karina
		Equipo e5 = new Equipo("Deportivo La Coruña", "Abanca Riazor");
		Equipo e24 = new Equipo();
		e24.setNombre("Real madrid");
		e24.setEstadio("Bernabeu");
		Equipo e27= new Equipo("IES Paloma","Estadio la Paloma");
		Equipo Eqm1= new Equipo("Milan","San Siro");
/*	
 * ***** Si los atributos son públicos	
// Asignar todos los entrenadores posibles a un equipo concreto		
		team12.Entrenadores[0]=e12;
		team12.Entrenadores[1]=E2;
*/
		
// Si los atributos son privados
		
		Entrenador[] miArray = team12.getEntrenadores();
		miArray[0]=e12;
		
		team12.getEntrenadores()[0] = e12;
		
		
		team12.asignaEntrenador(1,E2);
		// Asignar 1 jugador existente a un equipo existente en una posición de la plantilla concreta		
		team12.Jugadores[0]= j74;
		team12.Jugadores[15]= j33;
// Crear arrays a partir de los jugadores y entrenadores disponibles	
		Jugador[] cjto1 = {j34, j10,j44,j54,j64,j84,j94,jm1,jm2,jm3,jm4,j20,j30,j40,j50,j1,j2,j3,j4,j5};
		Entrenador[] cjto2 = {e12,E2};	
		Jugador[] cjto3 = {j51,j52};

// Asignar a un equipo ya creado un array de jugadores		
		e24.Jugadores = cjto1;		
		
		e27.Jugadores = cjto3;
// Crear un equipo nuevo e instanciar de una vez todos los jugadores y entrenadores
		Equipo nuevo = new Equipo ("1WET","La Paloma",cjto1,cjto2);
		
		
	}

}
