package ar.curso.cda;
import java.util.Random;


public class MazoDeCartas {
	
	private Carta paquete[];
	 private int cartaActual;
	 private final int NUMERO_DE_CARTAS = 48;
	 private Random numerosAleatorios;
	 
	 public MazoDeCartas()
	 {   

	 Integer numero[] = { 1, 2, 3, 4, 5, 6, 7,
	 8, 9, 10, 11, 12};
	 String palos[] = { "BASTO", "COPA", "ORO", "ESPADA"};

	 paquete = new Carta[ NUMERO_DE_CARTAS ];
	 cartaActual = 0;
	 numerosAleatorios = new Random();

	 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
	 paquete[ cuenta ] = new Carta( numero[cuenta % 12], palos[cuenta/12]); 
	 }   
	

	 public void barajar()
	 {   
	 cartaActual = 0;
	 
	 for ( int primera = 0; primera < paquete.length; primera++ )
	 { 
	 int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
	 
	 Carta temp = paquete[primera];

	 paquete[primera] = paquete[segunda];
	 paquete[segunda] = temp;
	 
	 }  
	 }   

	 public Carta repartirCarta()
	 { 
	 if (cartaActual < paquete.length )
	 return paquete[cartaActual++];
	 else return null;	

}
}