/* Programa para llevar inventario de productos
   Hecho por: Chrystian VIera 31.418.023
   Materia: Programación II UBA */


import java.util.Scanner;

public class AccesoClase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("SISTEMA DE CONTROL DE ACCESO");
            System.out.println("============================");
            
            // Pedir datos al usuario
            
            System.out.print("\nIngrese su nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            // Creaamos el objeto 
            
            Usuario usuario = new Usuario(nombre, edad);
            
            // Mostrar información y verificar acceso
            
            usuario.mostrarInfo();
            
            // Mensaje personalizado
            
            if(usuario.puedeAcceder()) {
                System.out.println("\nBienvenido " + usuario.getNombre() + ", acceso concedido.");
            } else {
                System.out.println("\nLo sentimos " + usuario.getNombre() + ", no cumples con la edad mínima.");
                System.out.println("El acceso está restringido a mayores de 18 años.");
            }
        }
    }
}