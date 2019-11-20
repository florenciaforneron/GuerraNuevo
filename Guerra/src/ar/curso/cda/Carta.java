package ar.curso.cda;


public class Carta {
	
	private Integer numero;
	 private String palos;
	 public Carta( Integer caraCarta, String paloCarta)
	 {   
	 numero = caraCarta;
	 palos = paloCarta;

	 }   

	 public String toString()
	 {   
	 return numero + " de " + palos;
	 }   
	 } 


