/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero, contador, suma;
        
        contador = 1;
        suma = 0;
        
        Scanner leer = new Scanner(System.in);       
        
        do{
            System.out.print("Ingresa un número: ");
             numero = leer.nextInt();
             suma = suma + numero;
             contador++;
             
            if(numero == 0){
                 System.out.println("Se capturó el número cero");
                 break;
            }            
        }while(contador <= 20);      
        
        System.out.println("La suma de los números ingresados es de: " + suma);
    }    
}
