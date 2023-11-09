/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *Clase que refiere a exception, una excepcion propia
 * se manda a llamar si no hay dinero suficiente para retirar
 * @author Santiago Ruiz
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Mensaje que se imprime en el catch
     */
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }
    /**
     * Hace que el mensaje pueda ser usado fuera de su clase
     * como se realiza en el main
     * @param message 
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
    
}
