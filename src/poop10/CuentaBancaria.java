/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Santiago Ruiz
 * Clase CuentaBancaria que realiza las operaciones de depositos y retiros
 */
public class CuentaBancaria {
    /**
     * Atributo saldo
     */
    private double saldo;
    /**
     * Constructor vacio que le da valor a saldo como 0
     */
    public CuentaBancaria() {
        saldo=0;
    }
    /**
     * Constructor
     * @param saldo Atributo que cuenta el dinero de la cuenta
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo get de saldo
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Metodo set de saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo que realiza el calculo cuando se deposita dinero
     * @param monto 
     */
    public void depositar(double monto){
        System.out.println("Depositado: "+monto);
        saldo+=monto;   
    }
    /**
     * Metodo que realiza el calculo cuando se retira dinero
     * ademas realiza un throw si no cuenta con dinero suficiente
     * llamando a la clase SaldoInsuficienteException
     * @param monto Monto que se quiere retirar
     * @throws SaldoInsuficienteException Clase a la que manda el throw
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando:" +monto);
        if(saldo<=monto)
            throw new SaldoInsuficienteException();
        else  
            saldo-=monto;
    }
}
