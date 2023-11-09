/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Santiago Ruiz
 */
public class POOP10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");//Impresión clasica en pantalla
        String[] mensaje={"Primero", "Segundo", "Tercero"};//Cadena
        /**
         * En este try-catch se muestra el como atrapa el error del for
         */
        try{
            for(int i=0; i<=3;i++){
                System.out.println("Mensaje " + mensaje[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error"+e.getMessage());
            System.out.println();
        }
        //Se imprime este segundo hola mundo para comprobar que el programa sigue en funcionamiento
        System.out.println("Hola mundo2");
        /**
         * Para este try se prueba el error de la división entre cero
         */
        try{
            double x;
            x=0/0;
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        /**
         * De igual manera que el anterior try este manda error si hay una división entre 0
         * Uno contiene excepciones de tipo Array Idex out of Bounds
         * y el otro de Arithmetic, al final solo el de tipo aritmetico encuentra en error.
         */
        try{
            double x;
            x=0/0;
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error array: "+e.getMessage());
            System.out.println();
        }catch(ArithmeticException e){
            System.out.println("Error aritmetico: "+e.getMessage());
            
        }
        /**
         * En este try igual se manda el error si hay una división entre 0
         * Cambia la forma de imprimir el error y evita que llegue al main
         */
        try{
            double x;
            x=10/0;
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
        //Se imprime este tercer hola mundo para comprobar que el programa sigue en funcionamiento
        System.out.println("Hola mundo 3");
        
        /**
         * Aquí se prueban los trows, manda a llamar al metodo,
         * si falla se lanza el mensaje en pantalla en el catch
         */
        try{
            double division=metodoDivision(4f,6.0);
        }catch(UnsupportedOperationException e){
            System.out.println("Error: "+e.getMessage());
        }
        //Se crea un objeto referenciando a la clase CuentaBancaria
        CuentaBancaria cuentabancaria = new CuentaBancaria();
        /**
         * En base a las clases CuentaBancaria y SaldoInsuficienteException
         * se prueban las excepciones propias, en donde se simula ser un cajero
         * así entrando en un catch si no hay fondos para retirar
         */
        try{
            cuentabancaria.depositar(2000);
            cuentabancaria.retirar(1000);
            cuentabancaria.getSaldo();
            cuentabancaria.retirar(1000);
            cuentabancaria.getSaldo();
            cuentabancaria.retirar(1000);
            cuentabancaria.getSaldo();
            cuentabancaria.depositar(200);
            cuentabancaria.retirar(100);
            
        }catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }
    }
    /**
     * Metodo trows
     * @param f primer num
     * @param d segundo num
     * @return 
     * @throws UnsupportedOperationException Regresa el mensaje de "operacion no realizada"
     */
    private static double metodoDivision(float f, double d) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Operacion no soportada"); 
    }
    
   
    
}
