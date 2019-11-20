package ar.curso.cda;

public class Main {

	public static void main(String args[])
	 {     
	  MazoDeCartas miPaqueteDeCartas = new MazoDeCartas();
	  miPaqueteDeCartas.barajar();
	 

	 System.out.println("\n");
	 for ( int i = 0; i < 12; i++ )
	 { 
	 System.out.printf("%-20s%-20s%-20s%-20s\n", 
	 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
	 miPaqueteDeCartas.repartirCarta(),miPaqueteDeCartas.repartirCarta());
	 }  

	 System.out.println("\n");
	 }     
	 }     


