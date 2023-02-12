package cuentas;

/**
 * Clase que implementa la cuenta bancaria. 
 * Devuelve el saldo y movimientos de la cuenta.
 * 
 * @author María
 * @version 2.0
 * @since 2.0
 * 
 * */

public class Main {
	
	/**
	 * Método main para la implementación de una cuenta bancaria.
	 * 
	 * Realiza una operación con una cantidad que se pasa al método operativa_cuenta
	 * 
	 * @param args array que recibe datos de la línea de comandos
	 * 
	 * */
	 public static void main(String[] args) {
	        operativa_cuenta(0);
	    }
	 
	 /**
	  * Método que ejecuta las operaciones de la cuenta asociada.
	  * 
	  * Este método contiene un bloque try-catch que notifica si hay fallos en los métodos de ingreso y retirada, recogidos en la clase CCuenta
	  *
	  * @param cantidad Cantidad a operar con la cuenta.
	  * 
	  * */


	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		System.out.println("Cuenta bancaria");
		System.out.println("...............");
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es "+ saldoActual );

		try {
		    cuenta1.retirar(2300);
		} catch (Exception e) {
		    System.out.print("Fallo al retirar");
		}
		try {
		    System.out.println("Ingreso en cuenta");
		    cuenta1.ingresar(695);
		} catch (Exception e) {
		    System.out.print("Fallo al ingresar");
		}
	}
}
