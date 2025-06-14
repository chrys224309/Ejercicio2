public class Usuario {
    // Atributos
    private final String nombre;
    private final int edad;
    
    // Constructor
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    // Método para verificar acceso
    public boolean puedeAcceder() {
        return edad >= 18;  // true si es mayor o igual a 18
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Acceso permitido: " + (puedeAcceder() ? "SI" : "NO"));
        System.out.println("-------------------------------");
    }
}