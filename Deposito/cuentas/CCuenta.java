package cuentas;

/**
 * Esta clase representa una cuenta bancaria con nombre, cuenta, saldo y tipo de interés.
 * @author María
 * @version 2.0
 * @since 2.0
 *  
 * */

public class CCuenta {
	
	/**
	 * Nombre del titular de la cuenta
	 * */

	private String nombre;
	
	/**
	 * Número de la cuenta bancaria
	 * */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     * */
    private double saldo;
    
    /**
     * Tipo de interés aplicado a la cuenta
     * */
    private double tipoInterés;
    
    /**
     * Constructor por defecto.
     * Crea una cuenta sin nombre, número de cuenta, saldo ni tipo de interés asociado.
     * 
     * */
    public CCuenta()
    {
    }
    
    /**
     * Constructor que da nombre del propietario, número de cuenta y saldo
     * 
     * @param nom parámetro de tipo String que representa el nombre del propietario de la cuenta 
     * @param cue parámetro de tipo String que representa el número de cuenta bancaria 
     * @param sal parámetro del tipo doble que representa el saldo de la cuenta
     * @param tipo parámetro de tipo double que representa los tipos de interés 
     * */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método que devuelve el saldo de la cuenta. 
     * 
     * Hace referencia al método getSaldo()
     * 
     * @return getSaldo() El valor retornado es el saldo de la cuenta.
     * 
     * */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método que permite ingresar una cantidad en la cuenta bancaria
     * 
     * Controla con un if si la cantidad es menor que 0, lo que arroja una excepción.
     * Si la cantidad es mayor que 0 la agrega al saldo que haya.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws Exception Da una excepción si la cantidad es negativa
     * 
     * */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que permite retirar una cantidad de la cuenta
     * 
     * Este método controla con un if que la cantidad no sea menor o igual que 0, ya que no se puede retirar tal cantidad.
     * Controla con otro if que no se retire una cantidad mayor que el saldo existente en el momento, con una llamada al método estado.
     * Si todo es correcto, actualiza el saldo el de la cuenta restando la cantidad retirada.
     * 
     * @param cantidad cantidad a retirar de la cuenta
     * @throws Exception lanza una excepción si la cantidad es menor o igual que 0, así como si la cantidad es mayor que el saldo
     * 
     * */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    /**
     * Devuelve el nombre del titular asociado a la cuenta
     * 
     * @return nombre del titular
     * 
     * */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Establece el nombre del titular de la cuenta
	 * 
	 * @param nombre Nombre del titular de la cuenta
	 * 
	 * */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el número de la cuenta bancaria
	 * 
	 * @return cuenta número de cuenta bancaria
	 * 
	 * */

	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Establece el número de la cuenta bancaria
	 * 
	 * @param cuenta número de cuenta bancaria
	 * 
	 * */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Devuelve el saldo que tiene la cuenta
	 * 
	 * @return saldo  Saldo de la cuenta
	 * 
	 * */

	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Establece el saldo que hay en la cuenta
	 * 
	 * @param saldo saldo de la cuenta bancaria
	 * 
	 * */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Devuelve el tipo de interés de la cuenta
	 * 
	 * @return tipoInterés Tipo de interés 
	 * 
	 * */

	private double getTipoInteres() {
		return tipoInterés;
	}
	
	/**
	 * Establece el tipo de interés
	 * 
	 * @param tipoInterés Tipo de Interés.
	 * 
	 * */

	private void setTipoInteres(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
