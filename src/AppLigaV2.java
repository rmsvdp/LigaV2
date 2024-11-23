import java.lang.reflect.Array;
import java.util.Arrays;

public class AppLigaV2 {

	public AppLigaV2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------
		//--------------------- JUGADORES -----------------------------------------------------		
		Jugador jug00 = new Jugador();		
		jug00.setNombre("Jan Oblak");
		jug00.setEdad(25);
		jug00.setPosicion(Puesto.PORTERO);
		jug00.setNumero(11);
		Jugador jug01 = new Jugador("Luis Aragones",Puesto.DEFENSA,9,34,0,true);
		Jugador jug02 = new Jugador("Isi palazon", Puesto.DEFENSA, 7 , 29, 0, true);
		Jugador jug03 = new Jugador("Lionel Messi", Puesto.CENTRAL,10,37,848,true);
		Jugador jug04 = new Jugador("Tierry Henry", Puesto.DELANTERO,11,43,608,false);
		Jugador jug05 = new Jugador("Samuel Eto'o", Puesto.DELANTERO,9,47,421,false);
		Jugador jug06 = new Jugador("Andres Iniesta", Puesto.CENTRAL,8,47,127,false);
		Jugador jug07 = new Jugador("Xavi Hernandez", Puesto.CENTRAL,6,49,184,false);
		Jugador jug08 = new Jugador("Sergio Busquets", Puesto.CENTRAL,5,39,104,true);
		Jugador jug09 = new Jugador("Dani Alves", Puesto.DEFENSA,2,47,311,false);
		Jugador jug10 = new Jugador("Gerard Pique", Puesto.DEFENSA,3,37,81,false);	
		Jugador jug11 = new Jugador("Johan Cruiff", Puesto.DELANTERO,3,37,81,false);	
		Jugador jug12 = new Jugador("Lamine Yamal", Puesto.DELANTERO, 19, 17,0, true );
		Jugador jug13 = new Jugador("Ferran Torres", Puesto.DELANTERO, 7, 24,0, true );
		Jugador jug14 = new Jugador("radamel falcao",Puesto.DELANTERO,9,38,310,true);				
		Jugador jug15 = new Jugador("Diego Maradona",Puesto.DELANTERO,10,60,159,false);	
		Jugador jug16 = new Jugador("Ronaldo de Assis Moreira",Puesto.CENTRAL,21,44,266,false);		
		Jugador jug17 = new Jugador("viktor gyokeres", Puesto.DELANTERO, 20 , 11, 0, true);	
		Jugador jug18 = new Jugador("Kylian Mbappé",Puesto.DELANTERO,9,25,8,true);
		Jugador jug19 = new Jugador("Joao Cozzarelli",Puesto.DELANTERO,11,21,3,true);
		Jugador jug20 = new Jugador("Mike Maignan",Puesto.PORTERO,4,20,0,true);
		Jugador jug21 = new Jugador("Nicolás Pezo",Puesto.CENTRAL,8,18,0,true);
		Jugador jug22 = new Jugador("David Carrasco",Puesto.DELANTERO,10,17,1,true);
		Jugador jug23 = new Jugador("Daniel Casado",Puesto.CENTRAL,6,29,0,true);
		Jugador jug24 = new Jugador("Alba Martinez",Puesto.DEFENSA,3,21,0,true);
		Jugador jug25 = new Jugador("Ignacio Galvez",Puesto.CENTRAL,7,38,0,true);
		Jugador jug26 = new Jugador("Alejandro",Puesto.DELANTERO,12,25,2,true);		
		Jugador jug27 = new Jugador("Rafael Leao",Puesto.DELANTERO,10,24,10,true);
		Jugador jug28 = new Jugador("Nicolás Magallanes", Puesto.CENTRAL, 16, 27, 0, false);
		Jugador jug29 = new Jugador("Theo Hernández", Puesto.DEFENSA, 19, 26, 5, true);
		Jugador jug30 = new Jugador("Sandro Tonali", Puesto.CENTRAL, 8, 23, 3, true);
		Jugador jug31 = new Jugador("Erling Haaland",Puesto.DEFENSA,8,18,0,true);
		Jugador jug32 = new Jugador("Bukayo Saka",Puesto.DELANTERO,10,17,1,true);
		Jugador jug33 = new Jugador("Jack Grealish",Puesto.CENTRAL,6,29,0,true);
		Jugador jug34 = new Jugador("Harry Kane",Puesto.DEFENSA,3,21,0,true);
		Jugador jug35 = new Jugador("Marcus Rashford",Puesto.CENTRAL,7,38,0,true);
		Jugador jug36 = new Jugador("Kevin De Bruyne",Puesto.DEFENSA,12,25,2,true);		
		Jugador jug37 = new Jugador("Mohamed Salah",Puesto.DELANTERO,10,24,10,true);
		Jugador jug38 = new Jugador("Bruno Fernandes", Puesto.CENTRAL, 16, 27, 0, false);
		Jugador jug39 = new Jugador("Son Heung-min", Puesto.DEFENSA, 19, 26, 5, true);
		//--------------------- ENTRENADORES -----------------------------------------------------		
		Entrenador ent00 = new Entrenador();
		ent00.setEdad(66);		
		ent00.setNombre("Ricardo Alberto Gareca Nardi");		
		ent00.setNumtitulos(10);		
		Entrenador ent01 = new Entrenador("Iñigo Perez" , 36, 0);	
		Entrenador ent02 = new Entrenador ("Pep Guardiola",53, 39);
		Entrenador ent03 = new Entrenador("jose pekerman",75,8);		
		Entrenador ent04 = new Entrenador("Stefano Pioli", 58, 1);
		Entrenador ent05 = new Entrenador("Ramón Merchan",55,0);		
		Entrenador ent06 = new Entrenador("Carlo Ancelotti",45,4);
		Entrenador ent07 = new Entrenador("Rúben Amorim" , 36, 0);
//--------------------- EQUIPOS -----------------------------------------------------
		Equipo team01 = new Equipo ("Sporting de Portugal", "San Siro");
		Equipo team02 = new Equipo(); //"FC Barcelona","Nou Camp");
		team02.setNombre("FC Barcelona");
		team02.setEstadio("Nou Camp");
		Equipo team03 = new Equipo ("Rayo Vallecano", "Estadio de Vallecas");
		Equipo team04 = new Equipo("Atlético de Madrid", "Riyadh Air Metropolitano");	
		Equipo team05 = new Equipo();
		team05.setNombre("Villarreal");
		team05.setEstadio("La Cerámica");
		Equipo team06 = new Equipo("Deportivo La Coruña", "Abanca Riazor");
		Equipo team07 = new Equipo("Real madrid","Bernabeu");
		Equipo team08 = new Equipo("IES Paloma","Estadio la Paloma");
		Equipo team09 = new Equipo("Milan","San Siro");
/*	
 * ***** Si los atributos son públicos	
// Asignar todos los entrenadores posibles a un equipo concreto		
		team12.Entrenadores[0]=e12;
		team12.Entrenadores[1]=E2;
*/
		
// Si los atributos son privados
		Entrenador[] miArray = team01.getEntrenadores();
		miArray[0]=ent07;
		team01.getEntrenadores()[0] = ent07;
		team01.asignaEntrenador(1,ent00);
		// Asignar 1 jugador existente a un equipo existente en una posición de la plantilla concreta		
		team01.Jugadores[0]= jug23;
		team01.Jugadores[15]= jug17;
// Crear arrays a partir de los jugadores y entrenadores disponibles	
		// *** Es imprescindible que los arrays tengan el mismo número de elmentos que los arrays de la clase !! ***
		Jugador[] plantilla1 = {jug00,jug01,jug02,jug03,jug04,jug05,jug06,jug07,jug08,jug09,jug10,jug11,jug12,jug13,jug14,jug15,jug16,jug17,jug18,jug19};
		Jugador[] plantilla2 = {jug20,jug21,jug22,jug23,jug24,jug25,jug26,jug27,jug28,jug29,jug30,jug31,jug32,jug33,jug34,jug35,jug36,jug37,jug38,jug39};
		Entrenador[] cuerpoTec1= {ent07,ent00};	
		Entrenador[] cuerpoTec2= {ent05,ent02};
// Asignar a un equipo ya creado un array de jugadores		
		team07.Jugadores = plantilla1;		
		team08.Jugadores = plantilla2;
// Crear un equipo nuevo e instanciar de una vez todos los jugadores y entrenadores
		Equipo team10 = new Equipo ("1WET","La Paloma",	plantilla1,cuerpoTec2)  ;
// Forma alternativa, construyen el array directamente, pero en el caso del array hay que señalar al compilador que le pasamos un arrya del tipo adecuado
		// sino no sabe generar el código y dará error
	   Equipo eq = new Equipo("1WET","La Paloma", plantilla1, new Entrenador[] {ent05,ent02}); 
				
	} // main

} // Class AppLigaV2.java
